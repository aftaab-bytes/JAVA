class Outer
{
    int x=20;
    private class inner_class{
        int y=10;
        void innerMethod()
        {
            System.out.println("This is innner class");
        }
    }
}
public class private_innner_class {
    public static void main(String[] args)
    {
        Outer out = new Outer();
        Outer.inner_class in=out.new inner_class();
        // System.out.println(out.x+" "+in.y);
    }    
}
