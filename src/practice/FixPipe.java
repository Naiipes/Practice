/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class FixPipe 
{
    public static void main(String[] args)
    {
        int[] arr = {-1, -1};
        int[] newArr = pipeFix(arr);
        
        for(int i = 0; i < newArr.length; i++)
        {
            System.out.print(newArr[i] + " ");
        }
    }
    
    public static int[] pipeFix(int[] arr)
    {   
        int largest = arr[0];
        int smallest = arr[0];
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        
        int size = largest - smallest + 1;
        
        int[] newArr = new int[size];
        
        for(int i = 0; i < size; i++)
        {
            newArr[i] = smallest + i;
        }
        
        return newArr;
    }
}
