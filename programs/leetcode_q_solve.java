import java.util.*;

public class leetcode_q_solve {


    //Q.1 find length of last word in the string....

    /*public static int findlength(String s)
    {
        int count=0;
        
       for(int i=0;i<s.length();i++)
       {

        if(s.charAt(i)==' ')
        {
            count=0;
        }
        else
        {
            count++;
        }
       }
       return count;
       
    }*/

    //Q.2 find median in array....

    /*public static void findmedian(int[] array1,int[] array2,int[] array3,int n,int m)
    {

        // Step_1:= Mearge two array in new arrray......
        int i=0,j=0,k=0;
        while (i<n) {
            array3[k]=array1[i];
            i++;
            k++;
        }
        while (j<m) {
            array3[k]=array2[j];
            j++;
            k++;
        }
        //Step_2:= Sorted new arrray in acending order...
        for(i=0;i<array3.length-1;i++)
        {
            for(j=0;j<array3.length-i-1;j++)
            {
                if(array3[j]>array3[j+1])
                {
                    int temp=array3[j];
                    array3[j]=array3[j+1];
                    array3[j+1]=temp;
                }
            }
        }
        //Step_3:= print this array....
        for(int a:array3)
        {
            System.out.println(a);
        }

        //Step_4:= Calculate median int array...
        int mid=array3.length/2;
            
        if(array3.length%2==0)
            {
                int sum=array3[mid]+array3[mid-1];
                System.out.println("The median is:"+sum/2);
            }else{

                System.out.println("The median is:"+array3[mid]);
            }
        
    }*/

    //Q.3 Remove the duplicate etement from array...


    /*public static int removeduplicate(int[] array,int[] newarray)
    {
        boolean flag=false;
        int i,j,k=0;
        for(i=0;i<array.length;i++)
        {
            for(j=0;j<newarray.length;j++)
            {
                if(array[i]==newarray[j])
                {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                newarray[k] = array[i];
                k++;
            }
            flag = false;            
        }
        
        return k;
        //{1,1,2,3,4,4,1,5};
    }*/

    //Q.4 check array is sorted or not.

    /*public static boolean check(int[] array,int index)
    {
        if(index==array.length-1)
        {
            return true;
        }
        if(array[index]<array[index+1])
        {
            return check(array, index+1);
        }
        return false;
    }*/

    public static void checkpalindrom()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int number=sc.nextInt();

        int temp=number;
        int sum=0;
        boolean result;
        while (number>0) {
            int r=number%10;
            sum=sum*10+r;
            number=number/10;   
        }

        if(temp==sum)
        {
            result=true;
            System.out.println(result);
        }
        else{
            result=false;
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        //Q1. call
        //String s="Hello World vishal";
        // System.out.println("The length is:"+findlength(s));
 

        //Q.2 is call
        /*int[] ar1={1,3,5};
        int[] ar2={2,7};
        int len1=ar1.length;
        int len2=ar2.length;
        int[] ar3=new int[len1+len2];
        findmedian(ar1, ar2,ar3,len1,len2);*/


        //Q.3 is call

        /*int[] arr={1,1,2,3,4,4,1,5,3};
        int[] arr1=new int[arr.length];
        int k = removeduplicate(arr,arr1);
        for(int i=0;i<k;i++)
        {
            System.out.print(arr1[i]);
        }*/

        //Q.4 Check array is sorted or not.

        // int[] arr={1,2,3,4,7,5,6};
        // System.out.println(check(arr, 0));
       
        //Q.5 check palindrom or not.
       checkpalindrom();
    }
}