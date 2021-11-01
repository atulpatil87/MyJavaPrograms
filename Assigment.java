package com.javapro;

public class Assigment {
    public static int reverseNumber()
    {
        System.out.println("this is the method if reverse Number");
        int n=51;
        int rev = 0;
        int temp=n;
        while(n>0)
        {
            temp=temp % 10;
            rev = rev * 10 + temp;
            temp=temp/10;
            System.out.println(temp);
            return temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        reverseNumber();

    }
}

