public class Question8 
{
    public static void dSort(int arr[],int left,int right)
    {
        if(left<right)
        {
            int p = partition(arr,left,right);
            dSort(arr,left,p-1);
            dSort(arr,p+1,right);
        }
    }

    public static int partition(int brr[],int l,int r)
    {
        int i=l-1;
        int pivot = brr[r];

        for(int j=l; j<r; j++)
        {
            if(brr[j] >= pivot)
            {
                i++;
                int temp = brr[i];
                brr[i] = brr[j];
                brr[j] = temp;
            }

        }
            int temp = brr[i+1];
            brr[i+1] = brr[r];
            brr[r] = temp;
            return (i+1);

    }
    public static void main(String[] args)
    {
         int nums[] = {5,1,3,7,9,12,99,0};

         for(int x:nums)
         {
             System.out.print(" "+x+" ");
         }

         System.out.println("\n");

         dSort(nums,0,7);

         for(int x:nums)
         {
             System.out.print(" "+x+" ");
         }

         System.out.println("\n\n");
    }
}
