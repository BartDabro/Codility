package co.uk.sda.london;



/*

A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

        For example, array A such that:
        A[0] = -3
        A[1] = 1
        A[2] = 2
        A[3] = -2
        A[4] = 5
        A[5] = 6

        contains the following example triplets:

        (0, 1, 2), product is −3 * 1 * 2 = −6
        (1, 2, 4), product is 1 * 2 * 5 = 10
        (2, 4, 5), product is 2 * 5 * 6 = 60

        Your goal is to find the maximal product of any triplet.

        Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A, returns the value of the maximal product of any triplet.

        For example, given array A such that:
        A[0] = -3
        A[1] = 1
        A[2] = 2
        A[3] = -2
        A[4] = 5
        A[5] = 6

        the function should return 60, as the product of triplet (2, 4, 5) is maximal.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [3..100,000];
        each element of array A is an integer within the range [−1,000..1,000].

*/


public class MaxProductOFThree {
    public static void main(String[] args) {
        int [] A = {-3,1,2,-2,5,6};
        System.out.println(solution(A));

    }
    public static int solution(int[] a) {
        int B[] = quicksort(a,0, (a.length-1));
        int C = B[0]*B[1]*B[B.length-1];
        int D = B[B.length-3]*B[B.length-2]*B[B.length-1];
        if(C>D)
        {
            return C;
        }
        else
        {
            return D;
        }
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
}
