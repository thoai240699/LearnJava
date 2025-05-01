package com.ltp.globalsuperstore;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PostMapping;

// @Controller and @GetMapping / @PostMapping: standard Spring MVC annotations.
// In-Memory List: Storing Item objects in List<Item> items.
// Updating vs. Creating: If the item’s ID isn’t found, we treat it as new. Otherwise, we update it—unless the date check fails.
// RedirectAttributes and Flash Attributes let you pass a "status" to the front-end so it can show success/failure messages.

@Controller
public class StoreController {
    // In memory data store
    List<Item> items = new ArrayList<>();

    // 1. Display the form to create/edit an Item
    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = getIndexFromId(id);
        // If no existing item found, create a new Item
        Item item = (index == Constants.NOT_FOUND) ? new Item() : items.get(index);

        // Pass item + category array to the form
        model.addAttribute("item", item);
        model.addAttribute("categories", Constants.CATEGORIES);
        // form is the name of FE template
        return "form";
    }

    // 2. Process form submissions (create or update)
    @PostMapping("/submitItem")
    public String handleSubmit(Item item, RedirectAttributes redirectAttributes) {
        int index = getIndexFromId(item.getId());
        String status = Constants.SUCCESS_STATUS;
        // if new item, just add it to the list
        if (index == Constants.NOT_FOUND)
            items.add(item);
        else {
            // if existing item, only update if the date difference is within 5 days
            if (within5Days(item.getDate(), items.get(index).getDate()))
                items.set(index, item);
            else
                status = Constants.FAILURE_STATUS;

        }
        redirectAttributes.addFlashAttribute("status", status);
        return "redirect:/inventory";
    }

    // 3. Show the inventory page
    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("items", items);
        return "inventory";
    }

    // find item index by ID
    public int getIndexFromId(String id) {
        if (id == null)
            return Constants.NOT_FOUND;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                return i;
            }
        }
        return Constants.NOT_FOUND;

    }

    // check if the new date is within 5 days of the old date
    public boolean within5Days(Date newDate, Date oldDate) {
        long diff = Math.abs(newDate.getTime() - oldDate.getTime());
        long days = TimeUnit.MILLISECONDS.toDays(diff);
        return days <= 5;
    }

}
