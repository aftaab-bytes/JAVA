package JAVA_Logical_Program;
    public class _022 {
    public static void main(String[] args)
    {
        int x=10,y=20,z=0;
        for(int i=x;i<=y;i++)
        {
            z=0;
            for(int j=1;j<=i;j++)
            if(i%j==0)
            z++;
            if(z==2)
            System.out.print(i + " ");
        }
    }
}
