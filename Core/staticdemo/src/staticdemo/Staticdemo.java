/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
class MyClass
{
//Non static field and method
public String message = "Hello World";
public void displayMessage()
{
    System.out.println("Message = " + message);
}
//Static field and method
public static String greetings = "Good morning";
public static void displayGreetings()
{
    System.out.println("Greeting = " + greetings);
}
}
public class Staticdemo {
public static void main(String[] args) {
       
    MyClass sd = new MyClass();
       
    System.out.println(sd.message);
    sd.displayMessage();
    System.out.println(MyClass.greetings);
    MyClass.displayGreetings();
}
}
