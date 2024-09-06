package Constructors;
import java.util.Scanner;
class ParamConstructor
{
    int id;
    String name;
    ParamConstructor()
    {
        id = 125;
        name = "Sidhu";
        System.out.println("Sname: "+this.name);
    }
    void print1()
    {
        System.out.println("Sid: "+id);
    }
    public ParamConstructor(int roll,String n)
    {
        String[] s = n.split(" "),y={"firstname ","middlename " ,"lastname "};
        id = roll;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        ParamConstructor obj = new ParamConstructor(y,a);
        obj.print1();
    }
}
