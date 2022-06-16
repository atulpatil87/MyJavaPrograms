package kunal;

import java.security.DrbgParameters;
import java.util.Scanner;

import static java.lang.System.*;

public class SwapTheNumber {

    public SwapTheNumber(int a, int b,int c)
    {
        System.out.println(+a+"\n"+b);
        int temp;
        temp=a;
        a=b;
        b=c;
        c=temp;
        System.out.println("***************************");
        System.out.println(+a+"\n"+b+"\n"+c);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        new SwapTheNumber(10,20,30);

    }
}
