/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package P01_DataTypeClass;
import java.util.HashMap;
/**
 *
 * @author IT
 */
public class Demo02_HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Create
        HashMap<String, String> location= new HashMap<>();
       //add items key,value(Ten, tinh)
       location.put("Nam", "BacLieu");
       location.put("Thoai", "BacLieu");
       location.put("Thu", "BacLieu");
       System.out.println(location);
       
       //access an item
       System.out.println(location.get("Thoai"));
       //remove
       location.remove("Nam");
       System.out.println(location);
       //clear
       //SIze hashmap
       System.out.println(location.size());
       //loop key
       for(String i: location.keySet())
       System.out.println(i);
       //loop value
       for(String i: location.values())
       System.out.println(i);
       
       //Create Hashmap people
       HashMap<String,Integer> people = new HashMap<>();
       people.put("Thoai", 26);
       people.put("Sinh", 27);
       for(String i:people.keySet())
       System.out.println("Key: "+i+" value: "+people.get(i));
       
    }
    
}
