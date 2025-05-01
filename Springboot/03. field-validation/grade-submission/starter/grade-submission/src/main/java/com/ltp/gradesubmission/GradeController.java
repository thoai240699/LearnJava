package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {

    List<Grade> studentGrades = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index = getGradeIndex(id);
        model.addAttribute("grade", index == Constants.NOT_FOUND ? new Grade() : studentGrades.get(index));
        return "form";
    }

    /*
     * Khi người dùng gửi dữ liệu từ biểu mẫu (form) đến endpoint /handleSubmit,
     * Spring sẽ:
     * Ánh xạ dữ liệu từ biểu mẫu vào đối tượng Grade.
     * Kiểm tra các ràng buộc (constraints) trên đối tượng Grade bằng cách sử
     * dụng @Valid.
     * Nếu dữ liệu không hợp lệ:
     * Các lỗi sẽ được lưu trong BindingResult result.
     * kiểm tra lỗi bằng cách gọi result.hasErrors() và xử lý lỗi trả về trang biểu
     * mẫu với thông báo lỗi).
     * Nếu dữ liệu hợp lệ:
     * Tiếp tục xử lý logic trong phương thức (ví dụ: thêm hoặc cập nhật Grade trong
     * danh sách studentGrades).
     */

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Grade grade, BindingResult result) {
        System.out.println("Has errors? " + result.hasErrors());
        if (result.hasErrors())
            return "form";
        int index = getGradeIndex(grade.getId());
        if (index == Constants.NOT_FOUND) {
            studentGrades.add(grade);
        } else {
            studentGrades.set(index, grade);
        }
        /*
         * Redirect là quá trình mà máy chủ yêu cầu trình duyệt thực hiện một yêu cầu,
         * Spring gửi phản hồi HTTP với mã trạng thái 302 Found (Redirect).
         * Trình duyệt nhận phản hồi và tự động gửi một yêu cầu HTTP mới đến URL/grades.
         * Nếu redirect:/ thì sẽ mất dữ liệu binding
         */
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    public int getGradeIndex(String id) {
        for (int i = 0; i < studentGrades.size(); i++) {
            if (studentGrades.get(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }

}