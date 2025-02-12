/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class ReturnOddArray 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] oddArr = oddArr(arr);
        
        for(int i = 0; i < oddArr.length; i++)
        {
            System.out.print(oddArr[i] + " ");
        }
    }
    
    public static int[] oddArr(int[] arr)
    {
        int size = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 != 0)
            {
                size++;
            }
        }
        
        int[] newArr = new int[size];
        int j = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 != 0)
            {
                newArr[j] = arr[i];
                j++;
            }
        }
        
        return newArr;
    }
}
