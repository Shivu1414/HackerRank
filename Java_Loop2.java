import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    
    public static int calcPow(int a, int b){
        if (b == 0)
            return 1;
        else
            return a * calcPow(a, b - 1);
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int eq=a;
            for(int j=0;j<n;j++){
                int power=calcPow(2,j);
                 eq=eq+power*b;
                 System.out.print(eq+" ");
            }
            System.out.println();
        }
        in.close();
    }
}