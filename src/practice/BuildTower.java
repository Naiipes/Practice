/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class BuildTower 
{
    public static void main(String[] args)
    {
        buildTower(4);
    }
    
    public static void buildTower(int floors)
    {
        //     *    1      
        //    ***   3       
        //   *****  5
        //  ******* 7
        
        
        for(int i = 0; i < floors; i++)
        {   
            for(int j = 0; j < floors - i; j++)
            {
                System.out.print(" ");
            }
            
            for(int k = 1; k <= 2 * i - 1; k++)
            {   
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
