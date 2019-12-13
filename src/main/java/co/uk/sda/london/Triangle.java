package co.uk.sda.london;

/*
An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

        A[P] + A[Q] > A[R],
        A[Q] + A[R] > A[P],
        A[R] + A[P] > A[Q].

        For example, consider array A such that:
        A[0] = 10    A[1] = 2    A[2] = 5
        A[3] = 1     A[4] = 8    A[5] = 20

        Triplet (0, 2, 4) is triangular.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

        For example, given array A such that:
        A[0] = 10    A[1] = 2    A[2] = 5
        A[3] = 1     A[4] = 8    A[5] = 20

        the function should return 1, as explained above. Given array A such that:
        A[0] = 10    A[1] = 50    A[2] = 5
        A[3] = 1

        the function should return 0.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].*/

//My result is 100%

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int [] A = {10,2,5,1,8,20};
        System.out.println(solution(A));
        
    }
    public static int solution(int []a)
    {
        Arrays.sort(a);

        for(int i = 0; i<a.length-2;i++)
        {
            if(a[i]>=0 && a[i]>a[i+2]-a[i+1] && a[i+1]+a[i+2]>a[i] && a[i+2]+a[i]>a[i+1])
            {
                return 1;
            }
        }
        return 0;
    }
}
