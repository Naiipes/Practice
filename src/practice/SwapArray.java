/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class SwapArray 
{
    public static void main(String[] args)
    {
        double[] arr = {1.1, -2.2, 3.3, 4.4, -5.5};
        
        swapArr(arr);
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void swapArr(double[] arr)
    {
        int index1 = -1;
        int index2 = -1;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                if(index1 == -1)
                {
                    index1 = i;
                }
                else
                {
                    index2 = i;
                }
            }
        }
        
        double temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
