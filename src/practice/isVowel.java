/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class isVowel 
{
    public static void main(String[] args)
    {
        System.out.println((isVowel('a')) ? "Vowel" : "Consonant");
        
        System.out.println(isDoubleVowel("boolean"));
        
        System.out.println(countVowel("IIII"));
        
        
    }
    
    public static boolean isVowel(char letter)
    {   
        letter = Character.toUpperCase(letter);
        
        switch(letter)
        {
            case 'A': case 'E': case 'I': case 'O': case 'U':
                return true; // No need to add break. As soon as one of the conditions is met, the program will end and return. 
            default:
                return false;
        }
    }
    
    public static boolean isDoubleVowel(String str)
    {
        int len = str.length();
        
        for(int i = 0; i < len - 1; i++) // len - 1 to avoid checking beyond the length of the string.
        {
            if(isVowel(str.charAt(i)) == isVowel(str.charAt(i + 1)))
            {
                return true;
            }
        }
        return false;
    }
    
    public static int countVowel(String str)
    {
        int count = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            if(isVowel(str.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
    
}
