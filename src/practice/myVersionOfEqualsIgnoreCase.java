/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class myVersionOfEqualsIgnoreCase 
{
    public static void main(String[] args)
    {
        String str = "abcde", str2 = "abcDe";
        System.out.println(isEqual(str, str2));
        System.out.println(str.equalsIgnoreCase(str2));
        
    }
    
    public static boolean isEqual(String str1, String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        if(len1 != len2)
        {
            return false;
        }
        else
        {
            for(int i = 0; i < len1; i++)
            {
                if(str1.charAt(i) != str2.charAt(i))
                {
                    return false;
                }
            }
            
            return true;
        }
        
        
    }
}
