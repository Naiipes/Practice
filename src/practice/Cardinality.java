/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class Cardinality 
{
    public static void main(String[] args)
    {
        int[] set = {1, 1, 4, 4, 5, 5, -7};
        System.out.println(cardinality(set));
    }
    
    public static int cardinality(int[] set)
    {
        int distinct = 0;
        int[] temp = new int[set.length];
        
        for(int i = 0; i < set.length; i++)
        {
            boolean belongs = true;
            
            for(int j = 0; j < distinct; j++)
            {
                if(temp[j] == set[i])
                {
                    belongs = false;
                    break;
                }
            }
            
            if(belongs)
            {   
                temp[distinct] = set[i];
                distinct++;
            }
        }
        
        return distinct;
    }
}
