/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class DoubleArray 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        doubleArr(arr);
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void doubleArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] *= 2;
        }
    }
}
