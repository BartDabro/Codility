package co.uk.london.oca;

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
                    return 0;
                }
                else
                {
                    int diff = B-A;
                    int div = diff/K;
                    if(K>A)
                    {
                        div++;
                    }
                    if(B%K==0)
                    {
                        div++;

                    }
                    if(A%K==0)
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
        return 1;
    }
}

