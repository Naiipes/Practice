/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
import java.util.Scanner;

public class EXAM 
{
    public static void main(String[] args)
    {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        exercise5();
    }
    
    public static void exercise1()
    {
        int[] arr = {1, 1, 2, 2, 3, 3};
        printDistinctArr(arr);
    }
    
    public static void printDistinctArr(int[] arr)
    {
        int distinctNum = 0;
        
        int[] tempArr = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++)
        {
            boolean belongs = true;
            
            for(int j = 0; j < distinctNum; j++)
            {
                if(tempArr[j] == arr[i])
                {
                    belongs = false;
                    break;
                }
            }
            
            if(belongs)
            {
                tempArr[distinctNum] = arr[i];
                distinctNum++;
            }
        }
        System.out.println("The number of distinct numbers is " + distinctNum);
        for(int i = 0; i < distinctNum; i++)
        {
            System.out.print(tempArr[i] + " ");
        }
    }
    
    public static void exercise2()
    {
        int[][] arr = {{1, 2, 3, 55}, {4, 5, 6, 1}, {1, 2, 3, 5}};
        
        int[] largest = largestRow(arr);
        
        for(int i = 0; i < largest.length; i++)
        {
            System.out.print(largest[i] + " ");
        }
    }
    
    public static int[] largestRow(int[][] arr)
    {
        int largest = arr[0][0];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            
            for(int j = 0; j < arr[0].length; j++)
            {
                sum += arr[i][j];
            }
            
            if(sum > largest)
            {
                largest = sum;
                index = i;
            }
        }
        
        int[] tempArr = new int[arr[0].length];  
        
        for(int i = 0; i < arr[0].length; i++)
        {
            tempArr[i] = arr[index][i];
        }
        
        return tempArr;
    }
    
    public static void exercise3()
    {
        int[][] arr = {{1, 2, 3, 55}, {4, 5, 6, 1}, {1, 2, 3, 5}};
        
        int[] largest = largestColumn(arr);
        
        for(int i = 0; i < largest.length; i++)
        {
            System.out.print(largest[i] + " ");
        }
    }
    
    public static int[] largestColumn(int[][] arr)
    {
        int largest = arr[0][0];
        int index = 0;
        
        for(int i = 0; i < arr[0].length; i++)
        {
            int sum = 0;
            
            for(int j = 0; j < arr.length; j++)
            {
                sum += arr[j][i];
            }
            
            if(sum > largest)
            {
                largest = sum;
                index = i;
            }
        }
        
        int[] tempArr = new int[arr.length];
        
        for(int i = 0; i < arr[0].length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                tempArr[j] = arr[j][index];
            }
        }
        
        return tempArr;
    }
    
    public static void exercise4()
    {
        int[] arr = {1, 2, 3, 4, 5};
        shiftRight(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void shiftRight(int[] arr)
    {
        // |1|2|3| ->  |3|1|2|
        
        // arr[1] = arr[0]
        // arr[2] = arr[1]
        
        // arr[0] = arr[2]
           
        int temp = arr[arr.length - 1];
        
        for(int i = arr.length - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
    
    public static void exercise5()
    {
        int[] arr = {1, 2, 3, 4, 5};
        shiftLeft(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void shiftLeft(int[] arr)
    {
        int temp = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
}

