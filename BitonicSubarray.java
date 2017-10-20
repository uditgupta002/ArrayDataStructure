// package whatever; // don't place package name!

import java.io.*;
import java.util.Scanner;

public class BitonicSubarray
{
    public static void main (String[] args) throws java.lang.Exception
    {
        /*
        This is a program to find a bitonic subarray in an array.
        
        */
        
        //Using Scanner class for token input
        
        Scanner sc = new Scanner(System.in);
        
        
        int arraySize = sc.nextInt();
        int[] numberArray = new int[arraySize];
        
        for(int i=0;i<arraySize;i++){
            numberArray[i] = sc.nextInt();    
            //System.out.println(numberArray[i]);
        }
        
        int currentStart = 0;
        int j = 0;
        int nextStart = 0;
        int maxLengthBio = 0;
        int finalStartIndex = 0;
        int finalEndIndex = 0;
        
        // Checking for the longest increasing subsequence
        while(currentStart < arraySize-1){

        
            while(j < arraySize-1 && numberArray[j] < numberArray[j+1]){
                j++;
            }
            
            //System.out.println("Current Start Index reached="+j);
            
            while(j < arraySize-1 && numberArray[j] >= numberArray[j+1]){
                
                if(numberArray[j] >= numberArray[j+1])
                    nextStart = j+1;
                j++;
                
            }
            //System.out.println("Current End Index reached="+j);
        
            if((j - currentStart + 1) >= maxLengthBio){
                finalStartIndex = currentStart;
                finalEndIndex = j;
            }
        
            currentStart = nextStart;
            //j = nextStart;
            
            //System.out.println("j at end="+currentStart);
            
        }
        
        for(int i=finalStartIndex;i<finalEndIndex;i++){
            System.out.print(numberArray[i]+" ");
        }
        
    }
}
