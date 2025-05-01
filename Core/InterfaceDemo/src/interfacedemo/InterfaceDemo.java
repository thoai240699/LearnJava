/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacedemo;

/**
 *
 * @author IT
 */
public class InterfaceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass a = new MyClass();
        a.someMethod();
        
        System.out.println("Value "+MyInterface.myInt);
        a.someDefaultMethod();
        MyInterface.someStaticMethod();
    }
    
}
class MyClass implements MyInterface{
    @Override
    public void someMethod(){
        System.out.println("This is a method implemented is MyClass");
    }
}
interface MyInterface{
    int myInt=5;
     void someMethod();//abstract
    public static void someStaticMethod()
{
System.out.println("This is a static method in an interface");
}
   
public default void someDefaultMethod()
{
System.out.println("This is a default method in an interface");
}
}