import java.util.*;
import java.io.*;



class Solution{
    public static void main(String[] args)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= -Math.pow(2,7) && x < Math.pow(2,7))
                    System.out.println("* byte");
                if(x >= -32768 && x <= 32767)
                    
                    
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



