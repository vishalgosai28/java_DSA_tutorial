public class advance_recursion {

    //Reverse a String by using recursion...
    /*public static void reversestring(int indx,String s)
    {
        if(indx==0)
        {
            System.out.print(s.charAt(indx));
            return;
        }
        char c=s.charAt(indx);
        System.out.print(c);
        reversestring(indx-1, s);

    }*/

    //find a frist and last charector occurance in the string...

    /*public static int frist=-1;
    public static int last=-1;

    public static void findchar(String s,int indx,char c)
    {

        if(indx==s.length())
        {
            System.out.println(frist);
            System.out.println(last);
            return;
        }
        char c1=s.charAt(indx);
        if(c1==c)
        {
            if(frist==-1)
            {
                frist=indx;
            }else{
            last=indx;
        }
    }
        findchar(s, indx+1, c);
    }*/

    //Check if array is sorted or not sorted...
    /*public static boolean checkarray(int[] array,int indx)
    {

        if(indx==array.length-1)
        {
            return true;
        }
        if(array[indx]<array[indx+1])
        {
            return checkarray(array, indx+1);
        }else{
            return false;
        }
    }*/

    /*public static void move(String s,int indx,char c,int count,String newString)
    {
        if(indx==s.length())
        {
            for(int i=0;i<count;i++)
            {
                newString+=c;
            }
            System.out.println(newString);
            return;
        }

        char c1=s.charAt(indx);
        if(c1==c)
        {
         count++;
         move(s, indx+1, c, count, newString);
        }else{
            newString+=c1;
            move(s, indx+1, c,count,newString);
        }
    }*/

    public static void removeduplicate(String s,int indx,String newString)
    {
        if(indx==s.length())
        {
            System.out.println(newString);
            return;
        }
        char c=s.charAt(indx);
        int asci1=c;
        char c1=s.charAt(indx);
        int asci2=c1;
        if(asci1<asci2)
        {
            removeduplicate(s, indx+1, newString);
        }else{
            newString+=c;
            removeduplicate(s, indx+1, newString);
        }
    }
    public static void main(String[] args) {
        //Reverse string function calling....
        // String s="abcd";
        // reversestring(s.length()-1, s);

        //find a frist and last occurance of charector
        /*String s="RambhaiModi";
        findchar(s, 0, 'i');*/

        //Calling a chech array is sorted or not....
        /*int[] a={10,5,7,9,10};
        boolean c=checkarray(a, 0);
        System.err.println(c);*/


        // String s1="axbcxxd";
        // move(s1, 0, 'x',0,"");
        removeduplicate("abbccda", 0,"");
    }
}
