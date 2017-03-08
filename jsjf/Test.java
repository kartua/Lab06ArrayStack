/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

/**
 *
 * @author Kartua
 */
public class Test {
    public static void main(String[] args) {
        ArrayStack a = new ArrayStack(1); 
        a.push("S");
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a.toString());
        a.push("M");
        a.push("I");
        a.push("T");
        System.out.println(a.size());
        System.out.println(a.pop());
        System.out.print(a.toString());
        String s=" ";
        System.out.println(s.length());
        
        
    }
}
