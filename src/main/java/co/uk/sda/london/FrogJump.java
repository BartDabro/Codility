package co.uk.sda.london;

/*

A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

        Count the minimal number of jumps that the small frog must perform to reach its target.

        Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

        For example, given:
        X = 10
        Y = 85
        D = 30

        the function should return 3, because the frog will be positioned as follows:

        after the first jump, at position 10 + 30 = 40
        after the second jump, at position 10 + 30 + 30 = 70
        after the third jump, at position 10 + 30 + 30 + 30 = 100

        Write an efficient algorithm for the following assumptions:

        X, Y and D are integers within the range [1..1,000,000,000];
        X ≤ Y.

*/


public class FrogJump {
    public static void main(String[] args) {

        int D = 25;
        int d = 1000000000;
        int X = 100;
        int Y = 300;
        boolean c = compareXY(X,Y);
        boolean e = checkVariables(X,Y,D);
        boolean f = checkMaxNumber(X,Y,D,d);
        if(c && e && f)
        {
            System.out.println(solution(X,Y,D));
        }
        else{
            System.out.println("Remember you have to set up X bigger or equal Y. Otherwise you won't be able to count how many jumps frog did!");
        }
    }

    public static int solution(int X, int Y, int D)
    {
        int dist = Y-X;
        int numberJumps = dist/D;
        double addDist = (double)dist/D;
        if(numberJumps==addDist)
        {
            return numberJumps;
        }
        else
        {
            return ++numberJumps;
        }
    }

    private static boolean checkMaxNumber(int X, int Y, int D, int d)
    {
        if(X<d)
        {
            if(Y<d)
            {
                if(D<d)
                {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean checkVariables(int X, int Y, int D)
    {
        if(X<1)
        {
            if(Y<1)
            {
                if(D<1)
                {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean compareXY(int X, int Y)
    {
        if(X<=Y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
