package kunal;

public class Array
    {
        public static void main(String[] args)
        {
            System.out.println("///////////////////////////start//////////////////////");
            int[] IntArry = new int[5];
            System.out.println("Arry Name"+IntArry);
            System.out.println("Total Element"+IntArry.length);
            System.out.println("2nd Element"+IntArry[1]);
            System.out.println("Arry Element Are");
            // Normal for loop
            for(int i=0;i<IntArry.length;i++)
            {
                System.out.println(i+"st Element is = " +IntArry[i]);
            }
            System.out.println("------------------------------------------------------");
            // for each loop
            for (int k : IntArry)
            {
                System.out.println("Element"+k);
            }
            System.out.println("///////////////////End//////////////////////");
        }
    }
