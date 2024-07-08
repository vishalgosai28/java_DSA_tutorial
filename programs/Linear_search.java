public class Linear_search {

    //Q.1 find the index of element is exist or not.....
    /*public static int linearserach(int[] array,int element)
    { 
        
        if(array.length==0)
        {
            return -1;
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==element)
            {
                return i;
            }
        }
        return -1;
    }*/
    //Q.2 write a program to find element is exist or not if element is exist then retun true or not retun false.....
    /*public static boolean linearserach(int[] array,int element)
    { 
        
        if(array.length==0)
        {
            return false;
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==element)
            {
                return true;
            }
        }
        return false;
    }*/
    //Q.3 write a program to find element is exist or not.....
    /*public static int linearserach(int[] array,int element)
    { 
        
        if(array.length==0)
        {
            return -1;
        }
        for(int i:array)
        {
            if(i==element)
            {
                return i;
            }
        }
        return -1;
    }*/
    //Q.4 write a program to find charector is exist or not in the String.....
    /*public static boolean linearserach(String s,char element)
    { 
        
        if(s.length()==0)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==element)
            {
                return true;
            }
        }
        return false;
    }*/
    //Q.5 write a program to Search for element in the range of index.....
    /*public static boolean linearserach(int[] array,int element,int start,int end)
    {  
        if(array.length==end)
        {
            return false;
        }
        for(int i=start;i<=end;i++)
        {
            if(array[i]==element)
            {
                return true;
            }
        }
        return false;
    }*/
    //Q.6 write a program Minimum element from array.....
    /*public static int linearserach(int[] array)
    {  
        int min=array[0];
        for(int i=0;i<array.length;i++)
        {
                if(array[i]<min)
                {
                    min=array[i];
                }
            
        }
        return min;
    }*/
      //Q.7 write a program Minimum element from array.....
      public static int linearserach(int[] array)
      {  
          int max=array[0];
          for(int i=0;i<array.length;i++)
          {
                  if(array[i]>max)
                  {
                      max=array[i];
                  }
              
          }
          return max;
      }
    public static void main(String[] args) {
        int[] arr={4,7,11,20,30,33,200,10,22,190,1};
        String name="vishal";
        //Q.1 call
        // int k=linearserach(arr, 30);
        // System.out.println(k);

        //Q.2 call
        //System.out.println(linearserach(arr, 10));

        //Q.3 call
        //int k=linearserach(arr, 30);
        //System.out.println(k);

        //Q.4 call
        //System.out.println(linearserach(name, 'v'));

        //Q.5 call
        //System.out.println(linearserach(arr, 10,2,8));

         //Q.6 and 7 call
        int k=linearserach(arr);
        System.out.println(k);
    }
}
