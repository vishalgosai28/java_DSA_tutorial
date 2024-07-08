/**
 * sorting_program
 */
public class sorting_program {

    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("|"+arr[i]+"|"+"\n");
        }
    }
    public static void main(String[] args) {
        int[] array={7,8,3,1,2};

        //bubble sort acending order...
        /*for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
        System.out.println("Acending Order in bubble sort:");
        print(array);

        //bubble sort decending order....

        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]<array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
        System.out.println("Desending Order in bubble sort:");
        print(array);
        */

        //Selection Sort

        for(int i=0;i<array.length;i++)
        {
            int smallest=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[smallest]>array[j])
                {
                    smallest=j;
                }
            }
            int temp=array[smallest];
            array[smallest]=array[i];
            array[i]=temp;
        }
        System.out.println("Selection sort:");
        print(array);
    }
}