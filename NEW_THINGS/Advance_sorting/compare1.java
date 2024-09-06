import java.util.*;
class Student
{
    int roll;
    float marks;
    String name;
    public Student(int r, float m, String n)
    {
        roll = r;
        marks = m;
        name = n;
    }
}
class SortByMarks implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Student  a = (Student) obj1,b=(Student)obj2;
        if (a.marks<b.marks)return -1;
        if (a.marks>b.marks)return 1;
        return 0;
    }
}

public class compare1 {
    public static void main(String[] args)
    {
        ArrayList<Student> obj = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // sc.close();
        for(int i=1;i<=n;i++)
        {   System.out.println("Enter the details of student "+i);
            System.out.print("Enter Roll no. : ");
            int a=sc.nextInt();
            System.out.print("Enter Marks : ");
            float b=sc.nextFloat();
            sc.nextLine();
            System.out.print("Enter Name : ");
            String c=sc.nextLine();
            obj.add(new Student(a,b,c));
            System.out.println();
        }
        Comparator comp = new SortByMarks();
        Collections.sort(obj,comp);
        System.out.println("Sorted details of the students:");
        for(Student c : obj)
        {
            System.out.printf("Roll no.:%d\nMarks: %.2f\nName: %s\n",c.roll,c.marks,c.name);
            System.out.println();
        }
        sc.close();
    }
}
