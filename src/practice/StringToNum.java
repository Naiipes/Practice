/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class StringToNum 
{
    public static void main(String[] args)
    {
        String str = "123 + 34";
        System.out.println(sumStr(str));
    }
    
    public static int sumStr(String str)
    {
        int index1, index2;
        
        index1 = str.indexOf(" ");
        index2 = str.indexOf("+");
        
        String num1 = str.substring(0, index1);
        String num2 = str.substring(index2 + 2);
        
        int sum1 = Integer.parseInt(num1);
        int sum2 = Integer.parseInt(num2);
        
        return sum1+ sum2;
    }
}
