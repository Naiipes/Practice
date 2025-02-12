/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class Factorial 
{
    public static void main(String[] args)
    {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(6));
    }
    
    public static int factorial(int num)
    {   
        int factorial = 1;
        
        if(num == 0)
        {
            return factorial;
        }
        else
        {   
            for(int i = 1; i <= num; i++)
            {
                factorial *= i;
            }
        }
        
        return factorial;
    }
}
