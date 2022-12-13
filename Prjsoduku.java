package com.company;
import java.io.*;
import java.util.Random;

public class Prjsoduku
{
    public static void main(String[] args) throws Exception
    {
        PrintWriter f=new PrintWriter( new FileOutputStream("sudoku.txt"));
        boolean ok=false;
        int cpt;
        int [][]ans=new int [9][9];
        int []test=new int [9];
        Random r = new Random();
        while(!ok) {
            cpt=0;
            for (int x = 0; x < ans.length; x++) {

                for (int y = 0; y < ans.length; y++) {

                    switch (x) {
                        case 0:
                            lol(ans, x, y, r);
                            break;
                        case 1:
                            if (y != 8&&y!=7&&y!=6&&y!=5&&y!=4&&y!=3) {
                                do {
                                    lol(ans, x, y, r);
                                }
                                while (ans[x][y] == ans[0][y]);
                            } else {
                                lol(ans, x, y, r);
                                if (ans[x][y] == ans[0][y])

                                    y = 0;
                            }
                            break;
                        case 2:
                            if (y != 8&&y!=7&&y!=6&&y!=5&&y!=4&&y!=3) {
                                do {
                                    lol(ans, x, y, r);
                                }
                                while (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y]);
                            } else {
                                lol(ans, x, y, r);
                                if (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y])
                                    y = 0;
                                if(y==8)
                                {
                                    for(int c=0;c<ans.length;c+=3)
                                    {
                                        for(int h=0;h<ans.length;h++)
                                        {
                                            test[h] = ans[h / 3][c + (h % 3)];
                                        }
                                        for(int a=0;a<ans.length;a++)
                                        {
                                            for(int i=a+1;i<ans.length;i++)
                                            {
                                                if (test[a] == test[i])
                                                {
                                                    y = 0;
                                                    x = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (y != 8&&y!=7&&y!=6&&y!=5&&y!=4&&y!=3) {
                                do {
                                    lol(ans, x, y, r);
                                }
                                while (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y]);
                            } else {
                                lol(ans, x, y, r);
                                if (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y])
                                    y = 0;
                            }
                            break;
                        case 4:
                            if (y != 8&&y!=7&&y!=6&&y!=5&&y!=4&&y!=3) {
                                do {
                                    lol(ans, x, y, r);
                                }
                                while (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y] || ans[x][y] == ans[3][y]);
                            } else {
                                lol(ans, x, y, r);
                                if (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[3][y] || ans[x][y] == ans[2][y])
                                    y = 0;
                            }
                            break;
                        case 5:
                            if (y != 8&&y!=7&&y!=6&&y!=5&&y!=4&&y!=3) {
                                do {
                                    lol(ans, x, y, r);
                                }
                                while (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y] || ans[x][y] == ans[3][y] || ans[x][y] == ans[4][y]);
                            } else {
                                lol(ans, x, y, r);
                                if (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y] || ans[x][y] == ans[3][y] || ans[x][y] == ans[4][y])
                                    y = 0;
                                if(y==8)
                                {
                                    for(int c=0;c<ans.length;c+=3)
                                    {
                                        for(int h=0;h<ans.length;h++)
                                        {
                                            test[h] = ans[3+h/3][c + (h % 3)];
                                        }
                                        for(int a=0;a<ans.length;a++)
                                        {
                                            for(int i=a+1;i<ans.length;i++)
                                            {
                                                if (test[a] == test[i])
                                                {
                                                    y = 0;
                                                    x = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (y != 8&&y!=7&&y!=6&&y!=5&&y!=4&&y!=3) {
                                do {
                                    lol(ans, x, y, r);
                                }
                                while (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y] || ans[x][y] == ans[3][y] || ans[x][y] == ans[4][y] || ans[x][y] == ans[5][y]);
                            } else {
                                lol(ans, x, y, r);
                                if (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y] || ans[x][y] == ans[3][y] || ans[x][y] == ans[4][y] || ans[x][y] == ans[5][y])
                                    y = 0;
                            }
                            break;
                        case 7:
                            if (y != 8&&y!=7&&y!=6&&y!=5&&y!=4&&y!=3) {
                                do {
                                    lol(ans, x, y, r);
                                }
                                while (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y] || ans[x][y] == ans[3][y] || ans[x][y] == ans[4][y] || ans[x][y] == ans[5][y] || ans[x][y] == ans[6][y]);
                            } else {
                                lol(ans, x, y, r);
                                if (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y] || ans[x][y] == ans[3][y] || ans[x][y] == ans[4][y] || ans[x][y] == ans[5][y] || ans[x][y] == ans[6][y])
                                    y = 0;
                            }
                            break;
                        case 8:
                            if (y != 8&&y!=7&&y!=6&&y!=5&&y!=4&&y!=3) {
                                do {
                                    lol(ans, x, y, r);
                                }
                                while (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y] || ans[x][y] == ans[3][y] || ans[x][y] == ans[4][y] || ans[x][y] == ans[5][y] || ans[x][y] == ans[6][y] || ans[x][y] == ans[7][y]);
                            } else {
                                lol(ans, x, y, r);
                                if (ans[x][y] == ans[0][y] || ans[x][y] == ans[1][y] || ans[x][y] == ans[2][y] || ans[x][y] == ans[3][y] || ans[x][y] == ans[4][y] || ans[x][y] == ans[5][y] || ans[x][y] == ans[6][y] || ans[x][y] == ans[7][y])
                                    y = 0;
                                if(y==8)
                                {
                                    for(int c=0;c<ans.length;c+=3)
                                    {
                                        for(int h=0;h<ans.length;h++)
                                        {
                                            test[h] = ans[6+h/3][c + (h % 3)];
                                        }
                                        for(int a=0;a<ans.length;a++)
                                        {
                                            for(int i=a+1;i<ans.length;i++)
                                            {
                                                if (test[a] == test[i])
                                                {
                                                    y = 0;
                                                    x = 3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }
            }
            int a=8;
            if(ans[0][a] == ans[1][a] || ans[0][a] == ans[2][a] || ans[0][a] == ans[3][a] || ans[0][a] == ans[4][a] || ans[0][a] == ans[5][a] || ans[0][a] == ans[6][a] || ans[0][a] == ans[7][a] || ans[0][a] == ans[8][a] || ans[1][a] == ans[2][a] || ans[1][a] == ans[3][a] || ans[1][a] == ans[4][a] || ans[1][a] == ans[5][a] || ans[1][a] == ans[6][a] || ans[1][a] == ans[7][a] || ans[1][a] == ans[8][a] || ans[2][a] == ans[3][a] || ans[2][a] == ans[4][a] || ans[2][a] == ans[5][a] || ans[2][a] == ans[6][a] || ans[2][a] == ans[7][a] || ans[2][a] == ans[8][a] || ans[3][a] == ans[4][a] || ans[3][a] == ans[5][a] || ans[3][a] == ans[6][a] || ans[3][a] == ans[7][a] || ans[3][a] == ans[8][a] || ans[4][a] == ans[5][a] || ans[4][a] == ans[6][a] || ans[4][a] == ans[7][a] || ans[4][a] == ans[8][a] || ans[5][a] == ans[a][6] || ans[5][a] == ans[7][a] || ans[5][a] == ans[8][a] || ans[6][a] == ans[8][a] || ans[6][a] == ans[7][a] || ans[7][a] == ans[8][a]) {
                cpt++;
            }
                if(cpt==0)
                    ok=true;
        }
        for(int z=0;z<ans.length;z++)
        {
            test[z] = r.nextInt(9) + 1;
        }
        for (int x = 0; x < ans.length; x++)
        {
            for (int y = 0; y < ans.length; y++)
            {
                if(ans[x][y]>test[x]+1)
                f.print(ans[x][y] + "  ");
                else
                {
                    f.print("   ");
                }
                if(y==2||y==5)
                {
                    f.print(" | ");
                }
                if(y==8)
                {
                    if(x==2||x==5)
                    {
                        f.println();
                        f.print("-----------------------------------");
                    }
                }
            }
                f.println();
        }
        f.println();f.println();
        f.println("SOLUTION BELOW:");
        for (int x = 0; x < ans.length; x++)
        {
            f.println("| " + ans[x][0] + "  " + ans[x][1] + "  " + ans[x][2] + " | " + ans[x][3] + "  " + ans[x][4] + "  " + ans[x][5] + " | " + ans[x][6] + "  " + ans[x][7] + "  " + ans[x][8] + " |");
            if (x == 2 || x == 5 || x == 8)
                f.println("-------------------------------");
        }
        f.close();
    }
    public static int [][]lol(int[][]ans,int x,int y, Random r)
    {
        switch (y)
        {
            case 0:
                ans[x][y] = r.nextInt(9) + 1;
                break;
            case 1:
                do
                {
                    ans[x][y] = r.nextInt(9) + 1;
                }
                while (ans[x][y] == ans[x][0]);
                break;
            case 2:
                do
                {
                    ans[x][y] = r.nextInt(9) + 1;
                }
                while (ans[x][y] == ans[x][1] || ans[x][y] == ans[x][0]);
                break;
            case 3:
                do
                {
                    ans[x][y] = r.nextInt(9) + 1;
                }
                while (ans[x][y] == ans[x][1] || ans[x][y] == ans[x][2] || ans[x][y] == ans[x][0]);
                break;
            case 4:
                do
                {
                    ans[x][y] = r.nextInt(9) + 1;
                }
                while (ans[x][y] == ans[x][1] || ans[x][y] == ans[x][2] || ans[x][y] == ans[x][0]|| ans[x][y] == ans[x][3]);
                break;
            case 5:
                do
                {
                    ans[x][y] = r.nextInt(9) + 1;
                }
                while(ans[x][y] == ans[x][1] || ans[x][y] == ans[x][2] || ans[x][y] == ans[x][0]|| ans[x][y] == ans[x][3]||ans[x][y] == ans[x][4]);
                break;
            case 6:
                do
                {
                    ans[x][y] = r.nextInt(9) + 1;
                }
                while(ans[x][y] == ans[x][1] || ans[x][y] == ans[x][2] || ans[x][y] == ans[x][0]|| ans[x][y] == ans[x][3]||ans[x][y] == ans[x][4]||ans[x][y] == ans[x][5]);
                break;
            case 7:
                do
                {
                    ans[x][y] = r.nextInt(9) + 1;
                }
                while(ans[x][y] == ans[x][1] || ans[x][y] == ans[x][2] || ans[x][y] == ans[x][0]|| ans[x][y] == ans[x][3]||ans[x][y] == ans[x][4]||ans[x][y] == ans[x][5]||ans[x][y] == ans[x][6]);
                break;
            case 8:
                do
                {
                    ans[x][y] = r.nextInt(9) + 1;
                }
                while(ans[x][y] == ans[x][1] || ans[x][y] == ans[x][2] || ans[x][y] == ans[x][0]|| ans[x][y] == ans[x][3]||ans[x][y] == ans[x][4]||ans[x][y] == ans[x][5]||ans[x][y] == ans[x][6]||ans[x][y] == ans[x][7]);
                break;
        }
        return ans;
    }
}