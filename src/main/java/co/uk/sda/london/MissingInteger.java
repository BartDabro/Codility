package co.uk.sda.london;


/*

This is a demo task.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].

*/




        import java.util.Random;

public class MissingInteger {
    public static void main(String[] args) {
        int N = 100;
        boolean a = checkRangeOfInteger(N);
        Random random = new Random();
        //int bound = 40;
        if(a)
        {
            int [] data = new int[N];
            int [] data1;
            for(int i =0; i<N;i++)
            {
                //data[i]=random.nextInt(bound)-20;
                data[i]=random.nextInt(2000001)-1000000;
                //System.out.println(data[i]);
            }
            int e =0;

            data1 = quicksort(data, e, (data.length-1));

            /*for(int i =0;i<N-1;i++)
            {
                for(int j =i+1;j<N;j++)
                {
                    if(data[i]>data[j])
                    {
                        e = data[i];
                        data[i]=data[j];
                        data[j]=e;
                    }
                }
            }*/
            for(int i =0; i<N;i++)
            {
                System.out.print(data1[i]+" ");
            }
            System.out.println();
            boolean g = checkTheValueInTheTable(N, data1);


            System.out.println(smallestPositiveIntegerInTable(N, data1,g));

        }
    }

    public static boolean checkTheValueInTheTable(int N, int [] data)
    {
        int counter = 0;
        for(int i =0;i<N;i++)
        {
            if(data[i]<1)
            {
                counter++;
            }
        }
        if(counter == N)
        {
            return true;
        }
        return false;
    }
    private static int smallestPositiveIntegerInTable(int n, int[] data, boolean g) {
        if(g)
        {
            return 1;
        }
        else{
            for(int i = 0; i< n -1; i++)
            {
                if(data[i]<0 && data[i+1]>1)
                {
                    return 1;
                }
                else if(data[0]>1)
                {
                    return 1;
                }
                    else if(data[i+1]-Math.abs(data[i])>1)
                    {
                        int c =data[i]+1;
                        return c;
                    }

            }
        }

        int f = data[data.length -1]+1;
        return f;
    }

    private static boolean checkRangeOfInteger(int n){
        if(n>0)
        {
            if(n<100001)
            {
                return true;
            }
        }
        return false;
    }
    private static int [] quicksort(int [] A, int left, int rigth)
    {
        int v = A[(left+rigth)/2];
        int i = left;
        int j = rigth;
        int x;
        do {
            while(A[i]<v)
            {
                i++;
            }
            while(A[j]>v)
            {
                j--;
            }
            if(i<=j)
            {
                x= A[i];
                A[i]=A[j];
                A[j]=x;
                i++;
                j--;
            }
        }while (i<=j);
        if(j>left)
        {
            quicksort(A, left, j);
        }
        if(i<rigth)
        {
            quicksort(A,i,rigth);
        }
        return A;
    }
}
