public class recursion {
    
    //print sum of frist n natural number...
     /*public static void printsum(int i,int n,int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n, sum);
    }*/

    //print Factorial of a number n....

    /*public static void Factorial(int n,int fact)
    {
        if(n==1||n==0)
        {
            System.out.println(fact);
            return;
        }
        fact*=n;
        Factorial(n-1, fact);  

    }*/

    //print the fibonacci sequence till nath term.. //

    /*public static void printfib(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int sum=a+b;
        System.out.println(sum);
        printfib(b,sum,n-1);
        
    }*/

    //find x^n power

    public static int pow(int x,int n)
    {
        if(n==0)
        {
            return 1 ;
        }
        if (x==0) {
            return 0;
        }
        int total=pow(x, n-1);
        int xy=x*total;
        return xy;
    }

    public static void main(String[] args) {

        //printsum(1, 5, 0);
        //Factorial(6, 1);

        //Fibonacci sequnce calling
        // int a=0,b=1,n=5;
        // System.err.println(a);
        // System.out.println(b);
        // printfib(a,b,n-2);

        //x^n power fuction calling..
        /*int n=5;
        int store=pow(2, n);
        System.out.println(store);*/
    }
}
