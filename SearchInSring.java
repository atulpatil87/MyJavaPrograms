public class SearchInSring
{
    public static void main(String[] args)
    {
      String str = "Atul";
      char target;
        target = 'u';
        System.out.println(Search1(str,target));
        System.out.println(Search2(str,target));
    }
    public static boolean Search1(String str, char target)
    {
        for (int i=0;i<str.length();i++)
        {
            if(target == str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean Search2(String str, char target)
    {
        for ( char ch: str.toCharArray()
             ) {
            if (ch == target)
            {
                return true;
            }

        }
        return false;
    }
}
