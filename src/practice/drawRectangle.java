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

public class drawRectangle 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    
        int height, width;
        System.out.print("Enter height: ");
        height = input.nextInt();
        System.out.print("Enter width: ");
        width = input.nextInt();
        
        drawRectangle(height, width);
        
    }
    
    public static void drawRectangle(int height, int width)
    {
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
            {
                System.out.print("[] ");
            }
            System.out.println();
        }
    }
}
