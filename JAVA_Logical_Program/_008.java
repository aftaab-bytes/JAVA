package JAVA_Logical_Program;
class _008
{
    public static void main(String[] args)
    {
        int n=5,i,sum;
        for(sum=0,i=1;i<=n;sum+=i*i,i++);
        System.out.println("The sum of "+n+" Natural square numbers is : "+sum);
    }
}