public class marge_sort {

    public static void mearge(int array[],int start,int mid,int end)
    {
        int n1=mid-start+1;
        int n2=end-mid;

        int[] left=new int[n1];
        int[] right=new int[n2];
       
        int i,j,k;
        for(i=0;i<n1;i++)
        {
            left[i]=array[start+i];
        }
        for(j=0;j<n2;j++)
        {
            right[j]=array[mid+1+j];
        }
        i=0;
        j=0;
        k=start;
        while (i<n1&&j<n2) {
            if(left[i]<right[j])
            {
                array[k++]=left[i++];
            }else{
                array[k++]=right[j++];
            }
        }
        while (i<n1) {
            array[k++]=left[i++];
        }
        while (j<n2) {
            array[k++]=right[j++];
        }

    }

    public static void display(int[] array)
    {
        for(int i :array)
        {
            System.err.println("|"+i+"|");
        }
    }
    public static void dived(int[] array,int start,int end)
    {
        if(start>=end)
        {
            return;
        }
       int mid=(start+end)/2;

        dived(array, start, mid);
        dived(array,mid+1, end);
        mearge(array, start, mid, end);

    }
    public static void main(String[] args) {
        int[] array1={1,5,3,2,6,4};
        int n=array1.length;
        System.out.println("before Sorting array:");
        display(array1);
        dived(array1, 0, n-1);
        // System.out.println("After Sorting array:");
        display(array1);

    }
}
