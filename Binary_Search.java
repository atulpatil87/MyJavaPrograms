public class Binary_Search {
    /* Time Complexity is O(logN)
       1. For Binary Search first find the middle element of the array. if the arry is sorted
       2. Check the target > mid, then search in right
          else search in left
          Error: If int mid= (start + end)/2 then
                    int mid= start + (end-start)/2;
     */
    public static void main(String[] args) {
        int arr[]= {0,1,3,5,6,8,9,10,12}; // Array Example
        int target = 5; // your target element
        int result=Search1(arr , target); // function called and stored in result
        System.out.println(result);
    }
    public static int Search1(int arr[], int target) //fuction to find the target element in given array.
    {
        int start= 0;
        int end= arr.length -1;
        int middle= 0;
        while (start<=end)
        {
            middle = start+(end-start)/2;
            if (target<middle) //if target in right side
            {
                end=middle-1;
            }
            else if (target>middle) //if target in left side
            {
                start=middle+1;
            }
            else
                return middle; // target found then return index
        }
        return -1;
    }

}
