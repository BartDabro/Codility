package co.uk.sda.london;

public class Brackets {
    public static void main(String[] args) {
        String s = "{[()()]}";
        int d = isProperlyNested(s);
        System.out.println(d);
    }

    public static int isProperlyNested(String s) {
        char [] str = new char[s.length()];
        int i =0;
        int end = str.length-1;
        int div = str.length/2;
        if(str.length%2==0)
        {

             while(Character.valueOf(str[i]).compareTo(Character.valueOf(str[end]))==0)
             {
                 if(div == i || div == end)
                 {
                     return 1;
                 }
                 i++;
                 end--;
             }
        }
        else
        {
            return 0;
        }
        return 0;
    }
}
