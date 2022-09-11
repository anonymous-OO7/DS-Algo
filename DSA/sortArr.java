import java.io.*;
import java.util.*;


 public class sortArr{


   static void recursiveSort(int arr[] , int length)
    {

        int temp;
        if(arr.length == 0 )
        {
            return;
        }

        
        temp = arr[length -1];
        recursiveSort(arr, length - 1);
        

        for(int i=length-1;i>= 0;i--)
        {
            if(arr[i] < temp){

            }
        }



    }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.println( "HELLO GAURAVVVTHIS IS Sort ana rray using recussion");



        int arr[]  = {1,3,5,2,56,2,6,64,2366,632,5,0};
        int length1 = arr.length;

        recursiveSort(arr, length1 );




    }

}