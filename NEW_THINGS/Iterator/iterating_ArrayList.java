import java.util.*;
public class iterating_ArrayList
{
    public static void main(String[] args)
    {ArrayList<Integer> obj = new ArrayList<Integer>();
    for(int i=1;i<=10;i++)
    obj.add(i);//adding elements to ArrayList
    Iterator<Integer> it=obj.iterator();
    
    // System.out.println(obj);
    while(it.hasNext())
    {
        Integer i = it.next();
        // System.out.print(it.next()+" ");
        if(i==6)
        {
            it.remove();
        }
    }
    Iterator<Integer> it2=obj.iterator();
    while(it2.hasNext())//accessing elements through while loop
    // hasNext method checks if the object is having the next value
    {
        System.out.print(it2.next()+" ");
    }
    
    // System.out.println("\n"+obj);
}
}