import java.util.function.Consumer;
import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args)
    {
        ArrayList <Integer> obj= new ArrayList<Integer>();
        for(int i=1;i<=10;i++)
        obj.add(i);
        Consumer<Integer> print1 = (n)->{System.out.println(n);};
        obj.forEach(print1);
    }
}
