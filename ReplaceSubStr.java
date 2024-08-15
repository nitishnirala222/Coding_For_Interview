/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interviewquest;

import java.util.Scanner;

/**
 *
 * @author nitis
 */
public class ReplaceSubStr {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        String oldstr,newstr,repstr,str;
        
        System.out.print("enter the string: ");
        str=sc.nextLine();
        System.out.print("enter the strings to be replaced: ");
        oldstr=sc.nextLine();
        System.out.print("enter the new string: ");
        newstr=sc.nextLine();
        
        repstr=str.replace(oldstr, newstr);
        System.out.print(repstr);
    }
}
