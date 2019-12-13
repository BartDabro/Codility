package co.uk.sda.london;

import java.util.Arrays;

public class Dominator {
    public static void main(String[] args) {
        int [] A = {3,4,3,2,3,-1,3,3};
        //System.out.println(tableLeader(A));
        int d = tableLeader(A);
        //System.out.println(howMantTimes(A,d));
        int c = howMantTimes(A,d);
        solution1(solution(A,d,c));
    }
    public static int tableLeader(int [] a)
    {
        int B[] = quicksort(a,0, (a.length-1));
        int N = a.length;
        int leader = -1;
        int candidate = a[N/2];
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            if(B[i]==candidate)
            {
                count++;
            }
        }
        if(count>N/2)
        {
            leader=candidate;
        }
        return leader;
    }
    public static int [] quicksort(int [] a, int left, int right)
    {
        int v= a[(left+right)/2];
        int i,j,x;
        i=left;
        j=right;
        do{
            while(a[i]<v)
            {
                i++;
            }
            while(a[j]>v)
            {
                j--;
            }
            if(i<=j)
            {
                x=a[i];
                a[i]=a[j];
                a[j]=x;
                i++;
                j--;
            }
        }while(i<=j);
        if(j>left)
        {
            quicksort(a,left,j);
        }
        if(i<right)
        {
            quicksort(a,i,right);
        }
        return a;
    }
    public static int howMantTimes(int [] a,int d)
    {
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==d)
            {

                k++;
            }
        }
        return k;
    }
    public static int[] solution(int []a,int d,int c)
    {
        //int d= tableLeader(a);

        int [] table = new int[c];
        int e=0;
        for(int i =0; i<a.length;i++)
        {
            if(a[i]==d)
            {
                table[e]=i;
                e++;
            }
        }
        return table;
    }
    public static void solution1(int [] a)
    {
        for (int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
