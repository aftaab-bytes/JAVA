import java.util.HashMap;
public class hash_map {
    public static void main(String[] args)
    {
        HashMap<String,String> obj = new HashMap<String,String>();
        obj.put("Strength" , "Limited");
        obj.put("Abilities","To be unlocked");
        obj.put("Skills","Java developer");
        for(String i : obj.keySet())//for accessing the keys  of the hash map
        {
            System.out.printf("KEY : %s\tValue : %s\n",i,obj.get(i));
        }
        String f=obj.remove("Skills");
        System.out.println("THE REMOVED ELEMENT : "+f);
        obj.clear();//Hashmap is cleared here
        System.out.println(obj);
    }
}
