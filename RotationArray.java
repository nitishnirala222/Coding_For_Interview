/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interviewquest;

/**
 *
 * @author nitis
 */
public class RotationArray {
    public static void Rotation(int ar[],int n)
    {
        int temp=ar[0];
        for(int i=0;i<n-1;i++)
            ar[i]=ar[i+1];
        ar[n-1]=temp;
    }
    
    public static void main(String[] args)
    {
        int[] arr=new int[]{1,2,3,4,5,6,7};
        int len=arr.length;
        int k=3;
        for(int j=0;j<k;j++)
            Rotation(arr,len);
        for(int p : arr)
            System.out.print(p+" ");
    }
}
