import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long a=1L, b=1L, sum=0L,c=1L;
            for(long i=a;c<n;i++){
            
             c=a+b;
                a=b;
                b=c;
                if(c%2==0&&c<n){
                    sum=sum+c;
                   // System.out.println(c);
                    }
        }
            System.out.println(sum);
    }
}
}
