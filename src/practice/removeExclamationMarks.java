/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class removeExclamationMarks 
{
    public static void main(String[] args)
    {
        String str = removeExMark("!H!E!L!L!O!!!!!");
        
        System.out.println(str);
    }
    
    public static String removeExMark(String str)
    {
        int len = str.length();
        
        String newStr;
        int count = 0;
        
        for(int i = 0; i < len; i++)
        {
            if(str.charAt(len - 1 - i) == '!')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        newStr = str.substring(0, len - count);
        
        return newStr;
    }
}
