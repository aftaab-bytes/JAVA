//creating a functional interface

interface StringFunction
{
    String apply(String str);//returns a string "str"
}
public class Main3 {
    
    public static void main(String[] args)
    {
        StringFunction ADD = (s) -> s + "%";// accepts the string and adds the character to it
        StringFunction add = (s)-> s+"#";
        print1("Aftaab ",ADD);
        print1("Aftaab ",add);
    }
    static void print1(String str,StringFunction format)
    {
        String result = format.apply(str);
        System.out.println(result);        
    }
    
}
