import java.util.ArrayList;
import java.util.Collections;
public class collection {
    public static void main(String[] args)
    {
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(24);
        obj.add(10);
        obj.add(2,21);
        obj.add(26);// takes value as parameter
        System.out.println("ArrayList before sort : "+obj);
        Collections.sort(obj);
        System.out.println("ArrayList after sort  : "+obj);
    }
}
