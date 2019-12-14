package co.uk.sda.london;


/*

Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

        { i : A ≤ i ≤ B, i mod K = 0 }

        For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

        Write an efficient algorithm for the following assumptions:

        A and B are integers within the range [0..2,000,000,000];
        K is an integer within the range [1..2,000,000,000];
        A ≤ B.

*/



public class CountDiv {

    public static void main(String[] args) {

        System.out.println(solution(11,345,17));

    }
    public static int solution(int A, int B, int K)
    {
        long timeStart= System.nanoTime();
        if(K>=1)
        {
            if(B>=A)
            {
                if(B==A)
                {

                    if(K>A) {
                        if(A%K==0)
                        {
                            if(A==0)
                            {
                                return 1;
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        else
                        {
                            if(A!=0)
                            {
                                return 0;
                            }
                            else
                            {
                                return 1;
                            }
                        }


                    }
                    else{
                        if(A%K==0)
                        {
                            if(A==0)
                            {
                                return 0;
                            }
                            else
                            {
                                return 1;
                            }
                        }
                        else
                        {
                            if(A!=0)
                            {
                                return 0;
                            }
                            else
                            {
                                return 1;
                            }
                        }
                    }

                }
                else
                {
                    int diff = B-A;
                    int div = diff/K;
                    if(K>A)
                    {
                        if(A==0)
                        {
                            return (B/K+1);
                        }
                        else{
                            if(K>2*A)
                            {
                                return div;
                            }
                            div++;
                        }
                    }
                    if(B%K==0)
                    {
                        div++;
                    }
                    else if(A%K==0)
                    {
                        div++;
                    }
                    //ystem.out.println(div);
                    long endTime = System.nanoTime();
                    long finalTime = endTime-timeStart;
                    System.out.println("Execution time in seconds: "+finalTime);
                    return div;

                }
            }
        }
        return 0;

    }
}

