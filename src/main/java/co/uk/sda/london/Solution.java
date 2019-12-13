package co.uk.sda.london;


import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int n =5;
        int roz = returnN(n);
        int K=3;
        int [] table = new int[roz];

        int [] table2 = returnTableWithRandNumber(table,n);

        solution(table2, K);

    }

    private static int returnN(int n) {
        int p = n;
        if(p<=0)
        {
            throw new IllegalArgumentException("Invalid Blog ID");
        }
        else{
            return p;
        }
    }

    private static void printTableAfterCyclicRotation(int [] A) {
        for(int i =0; i<A.length; i++)
        {
            System.out.print(A[i]+ " ");
        }
        System.out.println();
    }

    private static int[] returnTableWithRandNumber(int [] table, int n) {

        Random random = new Random();
        System.out.println("Initial table");
        for(int i =0; i<n;i++)
        {
            table[i]=random.nextInt(2000)-1000;
            System.out.print(table[i]+ " ");
        }
        System.out.println();
        return table;
    }

    public static int[] solution(int[] A, int K)
    {
        int a;
        while(K>0)
        {
            a=A[A.length-1];
            for(int i =A.length-1; i>0;i--)
            {
                A[i]=A[i-1];
            }
            A[0]=a;
            System.out.println("For K= "+K);
            printTableAfterCyclicRotation(A);
            K--;
        }
        return A;
    }

}
