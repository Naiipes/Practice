/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class shiftArrays 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        shiftRight(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void shiftLeft(int[] arr)
    {
        // |1|2|3| -> |2|3|1|
        int temp = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        
    }
    
    public static void shiftRight(int[] arr)
    {   
        //  0 1 2      0 1 2 
        // |1|2|3| -> |3|1|2|
        
        int temp = arr[arr.length - 1];
        
        for(int i = arr.length - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
