import java.util.ArrayList;
public class add_remove_print {
    
    static void printl(ArrayList<Integer> obj)
    {
     for(int i : obj){
     System.out.printf("%d ",i);}
    }
    public static void main(String[] args)
    {
        
    ArrayList<Integer> obj = new ArrayList<Integer>();
    obj.add(10);
    obj.add(21);
    obj.add(26);// takes value as parameter
    obj.add(24);
    System.out.println("Size : "+obj.size());
    System.out.print("Accessing through general print statement : "+obj);
    System.out.print("\nElements in the ArrayList before remove : ");
    printl(obj);
    obj.remove(2);// takes index as parameter
    obj.remove(1);
    System.out.print("\nElements in the ArrayList after remove : ");
    printl(obj);

    System.out.println("\nThe element at 1 index : " + obj.get(1));

    obj.clear();// clears all the values of the array list
    System.out.println("The ArrayList after clear : "+obj);
    // using get method



}
    // Note : There is no indexing in the object accessing
   
    
}
