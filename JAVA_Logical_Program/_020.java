package JAVA_Logical_Program;
public class _020 {
    public static void main(String[] args)
    {
        int f,i,n=2,org=n,sum=0,d;
        while(org!=0)
        {
            d=org%10;
            for(f=1,i=1;i<d;i++,f*=i);
            sum+=f;
            org/=10;
        }
        if(sum==n)
        System.out.println("The given number is a strong number....");
        else
        System.out.println("The given number is not a strong number....");

    }
}
