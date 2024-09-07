import java.util.HashSet;
class trial {
    public static void main(String[] args)
    {
        HashSet<String> obj = new HashSet<String>();
        obj.add("asdf");
        obj.add("Aftaab");
        obj.add("asdf");// this is not added since same is already added in the hashset we can make a duplicate member in it all the members are unique to each other
        for (String i : obj)
        {
            System.out.println(i);
        }
    }

}
