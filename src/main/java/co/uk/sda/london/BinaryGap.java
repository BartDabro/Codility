package co.uk.sda.london;


/*

A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

        For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

        Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

        For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..2,147,483,647].

*/

//My result -93%
class BinaryGap {

    public static void main(String[] args)
    {
        solution(529);
    }

    public static void solution(int N) {

        String str1 = convertNumbetIntoBinaryString(N);
        String str2 = reverseString(str1);
        int[] data = countNumberOfGapWithZero(str2);
        int number = displayTheBiggestNumbersOfGapInBinaryNumber(data);
        System.out.println("The Biggest zero-gap in the binary number is: "+number);
        boolean c = positiveOrNegativeFlagOfZeroGaps(number);
        System.out.println(c);

    }

    private static boolean positiveOrNegativeFlagOfZeroGaps(int number) {
        if(number == 0)
        {
            System.out.println("we don't have any zero gaps in the binary version of number");
            return false;

        }
        else
        {
            System.out.println("we have the binary zero-gap in the binary version of number");
            return true;

        }
    }

    private static int displayTheBiggestNumbersOfGapInBinaryNumber(int[] data) {
        for(int i= 0; i<data.length;i++)
        {
            for(int j=i+1; j<data.length;j++)
            {
                if(data[i]<data[j])
                {
                    int k = data[i];
                    data[i]=data[j];
                    data[j]=k;
                }
            }

        }
        return data[0];
    }

    private static int[] countNumberOfGapWithZero(String str2) {
        char[] input = str2.toCharArray();
        int help = 0;
        int [] data = {0,0,0,0};
        for (int i = 0; i < input.length; i++) {
            if (i + 1 != input.length) {
                if (input[i] == '1') {
                    int counter = 0;

                        try{
                            while (input[i + 1] != '1') {
                                counter++;
                                i++;
                            }
                            help++;
                            System.out.println(help);
                            for(int j=help-1;j<help;j++)
                            {
                                data[j] = counter;
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("This gap it isn't the proper gap!");
                            counter = 0;
                            help=0;
                        }
                }

            }
        }
        System.out.println("We have: "+help+" gaps of zero in binary number");
        return data;
    }

    private static String convertNumbetIntoBinaryString(int N) {
        String str1 = "";
        for (int i = N; i > 0; i /= 2) {
            int a = i % 2;
            String str = Integer.toString(a);
            str1 = str1.concat(str);
        }
        //System.out.println(str1);
        return str1;
    }
    private static String reverseString(String a)
    {
        StringBuilder output = new StringBuilder();
        output.append(a);
        output = output.reverse();
        String b = output.toString();
        System.out.println(b);
        return b;
    }
}
