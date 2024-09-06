import java.util.Scanner;
public class encapsulation1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        encapsulation obj = new encapsulation();
        System.out.printf("Enter a name of the user : ");
        String name = sc.nextLine();
        sc.close();
        obj.setName(name);
        System.out.println("The name is setted successfully!! \n Name : "+ obj.getName());
    }
}