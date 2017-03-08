/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import java.util.Stack;

/**
 *
 * @author Kartua
 */
public class PlayWstack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("S");
        System.out.println(s.isEmpty());
        s.pop();
        System.out.println(s.isEmpty());
        s.push("M");
        s.push("I");
        s.push("T");
        s.push("H");
        String output = s.toString();
        System.out.println(output);
        System.out.println(output.charAt(0));
        
    }
    
}
