/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Naiipes
 */
public class TotalPoints 
{
    public static void main(String[] args)
    {
        String[] games = {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"};
        String[] games2 = {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"};
        
        System.out.println(points(games));
        System.out.println(points(games2));
    }
    
    public static int points(String[] games)
    {   
        int sum = 0;
        // 012
        // X:Y
        
        for(int i = 0; i < games.length; i++)
        {
            String team1 = games[i].substring(0, 1);
            String team2 = games[i].substring(2, 3);
            
            int x = Integer.parseInt(team1);
            int y = Integer.parseInt(team2);
            
            if(x == y)
            {
                sum += 1;
            }
            else if(x > y)
            {
                sum += 3;
            }
        }
        
        return sum;
        
    }
}
