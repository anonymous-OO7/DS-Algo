// Java program to take an integer
// as input and print it
  
import java.io.*;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.Arrays;
import java.lang.reflect.Array;



class codechefTest {

    

    public static void main(String[] args)
    {

       int t;
       Scanner sc = new Scanner(System.in);
       t = sc.nextInt();

       while(t > 0)
       {

        int len = sc.nextInt();

        int arr[] = new int[len];
        int counter[] = new int[1000];

        Array.set(counter, 0, "for");

        for(int i =0;i<len;i++)

        {
            arr[i] = sc.nextInt();

            counter[arr[i]]= counter[arr[i]] + 1;

        }

        System.out.println(arr);

           t--;
       }

    }
}
