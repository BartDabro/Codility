package co.uk.sda.london;


/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

        Your goal is to find that missing element.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

        For example, given array A such that:
        A[0] = 2
        A[1] = 3
        A[2] = 1
        A[3] = 5

        the function should return 4, as it is the missing element.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].

*/



//My resault is 100%
import java.util.*;

public class PermMissingElem {
    public static void main(String[] args) {
        int A[] = {2,3,1,5};

        System.out.println(permMissingCheck(A));

    }
    public static int permMissingCheck(int[] a) {
        int N=a.length;
        Set<Integer> unique = new HashSet<Integer>();

        for(int i=1;i<=N+1;i++)
        {
            unique.add(i);
        }
        for(int j = 0; j< a.length; j++)
        {
            if(unique.contains(a[j]))
            {
                unique.remove(a[j]);
            }
        }

       Iterator<Integer> i = unique.iterator();
        int d = i.next();
        return d;
    }
}
