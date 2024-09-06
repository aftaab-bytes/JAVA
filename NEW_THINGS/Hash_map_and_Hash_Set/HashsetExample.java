import java.util.HashSet;
public class HashsetExample {
    public static void main(String[] args)
    {
        HashSet<String> obj = new HashSet<String>();
        obj.add("boy");
        obj.add("Aftaab");
        obj.add("boy");
        // this is not added since same is already added in the hashset we can make a duplicate member in it all the members are unique to each other
        obj.add("This is JAVA");
        for (String i : obj)
        {
            System.out.println(i);
        }
        boolean f = obj.remove("boy");//returns a boolean
        System.out.println(f);
        System.out.println(obj.contains("This is JAVA"));

    }

}
