public class sorting_exersice {

    public static void print(int[] array)
    {
       for(int i:array)
       {
        System.out.print("|"+i+"|");
       }
    }
 public static void main(String[] args) {
    int[] array={2,6,1,5,4,3};

   /*  for(int i=0;i<array.length-1;i++)
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
    print(array);*/

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
    print(array);
 }   
}
