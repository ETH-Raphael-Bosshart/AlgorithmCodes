package Diverses;

import java.io.*; 
public class IntegerPartitions  
{ 
    public int integerPartition(int n) 
    { 
        int[] p = new int[n]; 
        int j = 0;  
        p[j] = n;  
        int count = 0;

        while (true) 
        { 
            int mem = 0;
            count++;
            while (j >= 0 && p[j] == 1) 
            { 
            	mem += p[j]; 
                j--; 
            } 
            if (j < 0)  return count; 
            p[j]--; 
            mem++; 
            while (mem > p[j]){ 
                p[j+1] = p[j]; 
                mem = mem - p[j]; 
                j++; 
            } 
            p[j+1] = mem; 
            j++; 
        }
     
    } 
      
    // Driver program 
    public static void main (String[] args)  
    { 
    	IntegerPartitions integer = new IntegerPartitions();
    	System.out.println(integer.integerPartition(4));
    } 
} 