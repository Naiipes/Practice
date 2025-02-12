/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class FlushHand 
{
    public static void main(String[] args)
    {
        String[] cards = {"AS", "3S", "9S", "KS", "4S"};
        System.out.println(isFlush(cards));
        
        String[] cards2 = {"AD", "4S", "7H", "KC", "5S"};
        System.out.println(isFlush(cards2));
        
        String[] cards3 = {"AD", "4S", "10H", "KC", "5S"};
        System.out.println(isFlush(cards3));
        
        String[] cards4 = {"QD", "4D", "10D", "KD", "5D"};
        System.out.println(isFlush(cards4));
    }
    
    public static boolean isFlush(String[] cards)
    {   
        for(int i = 0; i < cards.length - 1; i++)
        {   
            int len = cards[i].length();
            int len2 = cards[i + 1].length();
            
            if(cards[i].charAt(len - 1) != cards[i + 1].charAt(len2 - 1))
            {
                return false;
            }
        }
        return true;
    }
}
