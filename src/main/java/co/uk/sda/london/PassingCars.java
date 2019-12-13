package co.uk.sda.london;

public class PassingCars {

    public static void main(String[] args) {
        int A [] = {0,1,0,1,1};
        System.out.println(passingCars(A));

    }
    public static int passingCars(int[] a) {

        int sum = 0;
        for(int i =0; i<a.length;i++)
        {
            if(a[i]==0)
            {
                int j =i;
                while(j<a.length)
                {
                    if(a[j]==1)
                    {
                        sum++;
                    }
                    j++;
                }
            }
        }

        if(sum>1000000000)
        {
            return -1;
        }
        else
        {
            return sum;
        }

    }
}
