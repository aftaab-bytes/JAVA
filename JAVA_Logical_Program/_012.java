package JAVA_Logical_Program;
import java.util.Scanner;
public class _012 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int y = days/365,w = (days-y*365)/7,rd=(days-(y*365+w*7));
        System.out.println("Years : "+y+" Weeks : " +w+" Days : "+rd);
        sc.close();
    }
}
