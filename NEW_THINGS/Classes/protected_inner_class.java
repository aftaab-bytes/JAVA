class Outer
{
    int x=20;
    protected class inner_class{
        int y=10;
        void innerMethod()
        {
            System.out.println("This is innner class");
        }
    }
}
public class protected_inner_class {
    public static void main(String[] args)
    {
        Outer out = new Outer();
        Outer.inner_class in=out.new inner_class();// creating the object of inner class using the object of the inner class
        System.out.println(out.x+" "+in.y);
    }    
}
