package kunal;
// Find The Given Number Is Odd or Even
public class FindOddEven
{
    public static void main(String[] args)
    {
        int n=68;
        System.out.println(FOV(n));
    }
    private static boolean FOV(int n)
    {
        return (n&1)==1;
    }
}
