package com.company;

import java.util.Random;

public class Prjtestfile
{
    public static void main(String[] args)
    {
        int [][]ans=new int [9][9];
        Random r = new Random();
        for(int x=0;x<ans.length;x++)
        {
            for (int y = 0; y < ans.length; y++)
            {
                ans[x][y] = r.nextInt(9) + 1;
            }
        }
        for(int x=0;x<ans.length;x++)
        {
            for (int y = 0; y < ans.length; y++)
            {
                if(y!=0&&x!=0)
                {
                    for (int z = 0; z < y; z++)
                    {
                        while (ans[x][y] == ans[x][z])
                        {
                            ans[x][y] = r.nextInt(9) + 1;
                        }
                    }
                }
            }
        }
        for(int x=0;x<ans.length;x++)
        {
            for (int y = 0; y < ans.length; y++)
            {
                System.out.print(ans[x][y]+"  ");
            }
            System.out.println();
        }
    }
}