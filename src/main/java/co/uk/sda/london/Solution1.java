package co.uk.sda.london;


import java.util.Random;

public class Solution1 {
    public static void main(String[] args) {

        int [] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));


    }

    public static int solution(int [] A) {
        //int N = 100;
        int N = A.length;
        boolean a = checkRangeOfInteger(N);
        //Random random = new Random();
        //int bound = 40;
        if (a) {
            //int [] A = new int[N];
            /*for(int i =0; i<A.length;i++)
            {
                //A[i]=random.nextInt(bound)-20;
                A[i]=random.nextInt(2000001)-1000000;
                //System.out.println(A[i]);
            }*/

            int e;
            for (int i = 0; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] > A[j]) {
                        e = A[i];
                        A[i] = A[j];
                        A[j] = e;
                    }
                }
            }
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();



        }
        boolean g = checkTheValueInTheTable(A);
        int z = smallestPositiveIntegerInTable(A, g);
        return z;
    }
        public static boolean checkTheValueInTheTable(int [] data)
        {

            int counter = 0;
            for(int i =0;i<data.length;i++)
            {
                if(data[i]<1)
                {
                    counter++;
                }
            }
            if(counter == data.length)
            {
                return true;
            }
            return false;
        }
        private static int smallestPositiveIntegerInTable(int[] data, boolean g) {
        if(g)
        {
            return 1;
        }
        else{
            for(int i = 0; i< data.length -1; i++)
            {
                if(data.length == 1)
                {
                    return 1;
                }
                else
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
    }

