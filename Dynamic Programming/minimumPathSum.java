
//DONE COMPLETE CODE




import java.io.*;
import java.util.Scanner;

public class minimumPathSum {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int  rows = sc.nextInt();
        int column = sc.nextInt();

        int costarr[][]  = new int[rows][column];


        for(int i=0;i<rows; i++)
        {
            for(int j=0;j<column;j++)
            {
                int temp = sc.nextInt();
                costarr[i][j] = temp;
            }
        }

        int dp[][] = new int [rows][column];


        for(int i=rows -1 ; i>=0 ; i--)
        {
            for(int j =column -1; j>=0;j--)
            {
                System.out.println( i + "I" + j +"J");

                if(i == rows-1 && j == column -1)
                {

                    dp[i][j] = costarr[i][j];
                    System.out.println("INSIDE lAST ELEMENT BLOCK" + dp[i][j]);


                }else if( i == rows -1 )
                {

                    dp[i][j] = dp[i][j+1] + costarr[i][j];

                    System.out.println("INSIDE lAST row BLOCK" + dp[i][j]);


                }else if( j == column -1)
                {

                    dp[i][j] = dp[i+1][j] + costarr[i][j];
                    System.out.println("INSIDE lAST column BLOCK" + dp[i][j]);


                }else{


                    dp[i][j] = Math.min(dp[i+1][j] , dp[i][j+1])+ costarr[i][j];
                    System.out.println("INSIDE middle  BLOCK" + dp[i][j]);


                }
            }
        }

        System.out.println("MINIMUM COSTR IS " + dp[0][0]);


    }
    
}



