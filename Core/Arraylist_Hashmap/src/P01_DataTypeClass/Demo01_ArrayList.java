/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi01_BaiTapQuaTrinh;

/**
 *
 * ArrayList
 */
import java.util.ArrayList;
import java.util.Collections;

public class Demo01_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drug = new ArrayList<>();
        drug.add("Paracetamol 500 mg");
        drug.add("Tramadol");
        drug.add("Clopheniramin");
        drug.add("Thanh Hao Hoa Vang");
        
        //add an item at a specified position by referring to the index number:
        drug.add(0,"Ibupropen");
        System.out.println(drug);
        
        //To access an element in the ArrayList, use the get() method and refer to the index
        System.out.println(drug.get(2));
        //To modify an element, use the set() method and refer to the index number:
        drug.set(2, "api");
        System.out.println(drug.get(2));
        //To remove an element
        drug.remove(2);
        System.out.println(drug.get(2));
        //how many elements an ArrayList have
        System.out.println(drug.size());
        //remove all the elements
//        drug.clear();
//        System.out.println(drug);
//        System.out.println(drug.size());
        //Loop through the elements 
        for (int i = 0; i < drug.size(); i++) {
            System.out.println(drug.get(i));
        }
        //
        for(String i:drug)
            System.out.println(i);
        //Sort arraylist
        Collections.sort(drug);
        //        //
        for(String i:drug)
            System.out.println(i);
        
        
        //System.out.println(drug);
       ArrayList<Integer> a=new ArrayList<Integer>();
       a.add(2);
       a.add(1);
       a.add(3);
       for(int i:a)
            System.out.println(i);
    }
    
    
}
