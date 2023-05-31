import java.util.Scanner;

public class pathwithMaxGold {



    //Path with Maximum Gold leetcode


    public int getMaximumGold(int[][] grid) {
        
        int rows = grid.length;
      int columns = grid[0].length;

      int goldarr[][]  = new int [rows][columns];

//         for(int i=0;i<rows;i++)
//         {
          
//             for(int j=0;j<columns;j++)
//             {

//                 int temp = sc.nextInt();

//                 goldarr[i][j] = temp;
//             }
//         } 


      int dp[][] = new int[rows][columns];



      for(int j= columns -1; j>=0 ; j--)
      {
          for(int i = rows-1;i>=0;i--)
          {

              if(j == columns -1 )
              {
                  dp[i][j] = grid[i][j];

              }else if(i == rows -1)
              {
                  dp[i][j] = Math.max( dp[i][j+1] , dp[i-1][j+1]) + grid[i][j];
              }else if( i == 0){

                  dp[i][j] = Math.max( dp[i][j+1] , dp[i+1][j+1]) + grid[i][j];


              }else {
                  int temp = Math.max(dp[i-1][j+1] , dp[i+1][j+1] );

                  dp[i][j] = Math.max( dp[i][j+1] , temp) + grid[i][j];



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

  return maxtmp;        
  }




  public static void main( String[] args )
  {


    Scanner sc = new Scanner(System.in);


    

  }

    
}
