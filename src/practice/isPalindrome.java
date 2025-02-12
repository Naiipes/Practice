/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class isPalindrome 
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("bosta"));
    }
    
    public static boolean isPalindrome(String str)
    {
        int len = str.length();
        
        for(int i = 0; i < len; i++)
        {
            if(str.charAt(i) != str.charAt(len - i - 1))
            {
                return false;
            }
        }
        return true;
    }
}
