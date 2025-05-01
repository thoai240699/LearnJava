/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thoai.genericsdemo;

/**
 *
 * @author QA19
 */
public class GenericsDemo {

    public static void main(String[] args) {
        MyGenericsClass a = new MyGenericsClass();
        a.SetMyVar(9.9999);
 // Will eror with String
//        a.SetMyVar("Anh yeu em");
        a.printValue();

// To limit logical eror, using Integer to prevent wrong input due to typing
//        MyGenericsClass<Integer> a = new MyGenericsClass();
//        a.SetMyVar("Anh yeu em");
//        a.printValue();

    }
//    public static class MyGenericsClass<G> {
//        private G myVar;
//        void SetMyVar(G x){
//            myVar = x;
//        }
//        void printValue(){
//                System.out.println("The value of myVar is "+ myVar);
//        }
//    }
    // Want class to only work with numeric data types

        public static class MyGenericsClass<G extends Number> {
        private G myVar;
        void SetMyVar(G x){
            myVar = x;
        }
        void printValue(){
                System.out.println("The value of myVar is "+ myVar);
        }
    }
}
