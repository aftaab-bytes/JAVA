package Exception_handling;
public class try_catch{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        try{
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println("Something went wrong... :(");
        }
        finally
        {
            System.out.println("Exitting.....");
        }
    }
}