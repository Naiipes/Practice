/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */

import java.util.Scanner;

public class reverseArray 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        
        reverseArray(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void reverseArray(int[] arr)
    {
        int len = arr.length;
        
        int start = 0;
        int end = len - 1;
        
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
    
    
   
    
    
    
    
    
}
