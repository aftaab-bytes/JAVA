package Constructors;
public class constructors
{
    int x;
    String name;
    // constructors
    public constructors()//basic constructors
    {
        x=45;
        // name = "asd";
    }
    
    constructors(String name)//parameterised constructors
    {
        this.name =  name;
        
    }
    
    public static void main(String[] args)
    {
        constructors v = new constructors(), obj = new constructors("AFTAAB");
        System.out.println(v.x);
        System.out.println(obj.name);
    }
}