/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modifierdemo;

/**
 *
 * @author IT
 */;

public class ClassesInSamePackage {
    
}
class ClassA extends ModifierDemo{
    public void printMessages(){
        System.out.println(publicNum);
        System.out.println(protectedNum);
        System.out.println(packagePrivateNum);
        System.out.println(privateNum);
        
    }
    
}
class ClassB
{
public void printMessages()
{
    ModifierDemo p = new ModifierDemo();
    //This is ok
    System.out.println(p.publicNum);
    //This is ok
    System.out.println(p.protectedNum);
    //This is ok
    System.out.println(p.packagePrivateNum);
//This is NOT ok
    System.out.println(p.privateNum);
}
}
