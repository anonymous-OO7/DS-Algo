// Java program to take an integer
// as input and print it
  
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;



class codechefTest {

    

    public static void main(String[] args)
    {

       

        	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

        // System.out.println("NUMBER OF TEST CASES" + t);
		
		for(int i=0;i<t;i++)
		{
		    int l = sc.nextInt();
		    String s = sc.next();
            int count =0;
            boolean answered = false;
           
            for(int j =0; j<l;j++)
            {
                char temp = s.charAt(j);

                if( temp == '1')
                {
                    count++;
                }else{

                    System.out.println(count + "INSIDE LOOP");
                    answered = true;
 
                    break;
                }




            }
            if(answered == false)
            {
                System.out.println(count + "OUTSIDE MAIN LPOp");

            }


		}
	

    }
}
