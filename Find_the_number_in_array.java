public class Find_the_number_in_array
{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,45,52,68,256,4,5,1};
        int target = 256;
        int ans = Search(arr,target);
        System.out.println(ans);
        System.out.println(Search2(arr,target));
        System.out.println(Search3(arr,target));

    }
    public static int Search(int[] arr, int target)
    {
        if (arr.length <= 0)
        {
         return -1;
        }

        for (int i = 0; i < arr.length; i++)
        {
            int element = arr[i];
            if (element == target)
            {
                return i;
            }
        }
        return -1;
    }
    public static int Search2(int arr[],int target)
    {
        for (int element : arr)
        {
            if (element==target)
            {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    public static boolean Search3(int arr[],int target)
    {
        for (int element:arr)
        {
         if (element==target)
         {
             return true;
         }
        }
        return false;
    }
}
