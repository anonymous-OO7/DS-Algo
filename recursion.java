// Java program to take an integer
// as input and print it
  
import java.io.*;
import java.util.Scanner;

class recursion {




  
      public static int findFact(int x , int ans) {
        System.out.println("LKJHBJN");

        if(x == 1)
        {   
            System.out.println("ANs is" +  ans );
            return x;
        }else{
            findFact(x-1 , ans*x);
        }

        return 0;

      }

      public static void printNums(int x)
      {

        if(x > 1)
        {
            printNums(x-1);
        }else{

                System.out.println("NUMS" + x);
        }
      }


      


    public static void main(String[] args)
    {


       int t;
       Scanner sc = new Scanner(System.in);
       t = sc.nextInt();

       while(t > 0)
       {

           int n  = sc.nextInt();
           int ans = 1;


            // findFact(n , ans);
            printNums(n);

           t--;
       }





    }
}
