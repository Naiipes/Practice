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

public class StringWithTheMostR 
{
    public static void main(String[] args)
    {   
        Scanner kb = new Scanner(System.in);
        String[] str = {"Ferrari", "Skibidi", "Refactor"};
        System.out.println(mostChar(str, 'R'));
        
        // ----------------------------------------------- //
        
        String[] strInput = new String[3];
        
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Input string " + i + ": ");
            strInput[i] = kb.nextLine();
        }
        
        // Check for the string with the most specified letter
        
        System.out.println(mostChar(strInput, 'G'));
        
        
    }
    
    public static String mostChar(String[] str, char letter)
    {   
        int index = 0;
        int max = 0;
        
        letter = Character.toLowerCase(letter); // MAKE IT CASE INSENSITIVE!!!
        
        for(int i = 0; i < str.length; i++)
        {
            int count = 0;
            
            for(int j = 0; j < str[i].length(); j++)
            {
                if(str[i].charAt(j) == letter)
                {
                    count++;
                }
            }
            
            if(count > max)
            {
                max = count;
                index = i;
            }
        }
        
        String newStr = str[index].substring(0);
        
        return newStr;
    }
}
