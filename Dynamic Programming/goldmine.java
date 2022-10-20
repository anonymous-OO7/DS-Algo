import java.io.*;
import java.util.*;





public class goldmine {
    

    public static void main(String[] args)
    {



        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int goldarr[][]  = new int [rows][columns];

        for(int i=0;i<rows;i++)
        {
            
            for(int j=0;j<columns;j++)
            {

                int temp = sc.nextInt();

                goldarr[i][j] = temp;
            }
        }


        int dp[][] = new int[rows][columns];



        for(int j= columns -1; j>=0 ; j--)
        {
            for(int i = rows-1;i>=0;i--)
            {

                if(j == columns -1 )
                {
                    dp[i][j] = goldarr[i][j];
                    System.out.println(dp[i][j] + "inside last column");;

                }else if(i == rows -1)
                {
                    dp[i][j] = Math.max( dp[i][j+1] , dp[i-1][j+1]) + goldarr[i][j];

                    System.out.println(dp[i][j] + "inside last rows");;

                }else if( i == 0){

                    dp[i][j] = Math.max( dp[i][j+1] , dp[i+1][j+1]) + goldarr[i][j];
                    System.out.println(dp[i][j] + "inside first row");;



                }else {
                    int temp = Math.max(dp[i-1][j-1] , dp[i+1][j+1] );

                    dp[i][j] = Math.max( dp[i][j+1] , temp) + goldarr[i][j];

                    System.out.println(dp[i][j] + "inside middle rows column");;




                }
            }
        }

        int maxtmp = 0;

        for(int i=0;i<rows;i++)
        {
            int tempmx = dp[i][0];

            if(tempmx > maxtmp)
            {
                maxtmp = tempmx;
            }
        }

        System.out.println(maxtmp);
    }
}
