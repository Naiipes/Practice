/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class LargestAvgIn2DArray 
{
    public static void main(String[] args)
    {
        int[][] arr = {{1, 23, 3}, {4, 5, 6}, {5, 6, 47}};
        
        int[] newArr = largestAverage(arr);
        for(int i = 0; i < newArr.length; i++)
        {
            System.out.print(newArr[i] + " ");
        }
    }
    
    // Create a program that will return the array with the largest average
    
    public static int[] largestAverage(int[][] arr)
    {   
        double largest = 0;
        int index = 0;
        
        for(int i = 0; i < arr.length; i++)
        {   
            int sum = 0;
            double average = 0;
            
            for(int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
            
            average = sum / arr[i].length;
            
            if(average > largest)
            {
                largest = average;
                index = i;
            }
        }
        
        int[] largestAvg = new int[arr[index].length];
        
        for(int i = 0; i < 1; i++)
        {
            for(int j = 0; j < arr[index].length; j++)
            {
                largestAvg[j] = arr[index][j];
            }
        }
        
        return largestAvg;
    }
}
