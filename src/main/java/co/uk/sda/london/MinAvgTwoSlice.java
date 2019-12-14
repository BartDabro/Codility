package co.uk.sda.london;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int A [] = {4,2,2,5,1,5,8};
        System.out.println(solution(A));

    }
    public static int solution(int [] a)
    {
        int N = a.length;
        int l = simbolNewtona(N);
        double [] P = new double[l];
        double [] R = new double[l];
        int i =0;
        int p =0;
        int w = 0;
        while(i<P.length)
        {
            for(int k = p; k<a.length-1;k++)
            {
                if(k==w)
                {
                    P[i] = a[k]+a[k+1];
                    R[i] = P[i]/2;
                }
                else
                {
                    P[i]=P[i-1]+a[k+1];
                    R[i]=P[i]/(k-w+2);
                }
                i++;
            }
            p++;
            w++;
        }
        double [] table = new double[R.length];
        System.arraycopy(R,0,table,0,table.length);
        double d = quicksort(table,0,(table.length-1));
        int m =0;
        for(int c =0; c<R.length;c++)
        {
            if(d==R[c])
            {
                m=c+1;
            }
        }
        int f =-1;
        if(m==0)
        {
            return 1;
        }
        else{
            while(m>0){
                m -= (N-1);
                N--;
                f++;
            }
        }

        return f;
    }
    public static int simbolNewtona(int n)
    {
        return n*(n-1)/2;
    }
    public static double quicksort(double [] a, int left, int right)
    {
        double v= a[(left+right)/2];
        int i,j;
        double x;
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
                x= a[i];
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
        return a[0];
    }
}
