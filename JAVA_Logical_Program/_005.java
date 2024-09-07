package JAVA_Logical_Program;
class _005 {
    public static void main (String[] args)
    {
        int n=5,i,fact;
        for(fact=1,i=1;i<=n;fact*=i,i++);
        System.out.println("The factorial of 5 is : "+fact);
    }
}
