package JAVA_Logical_Program;
    public class _017 {
        public static void main(String[] args)
        {
            char ch = '*';
            float z=0;
            int a=20,b=24;
            switch(ch)
            {
                case '+':z=a+b;break;
                case '/':z=a/(float)b;break;
                case '*':z=a*b;break;
                case '-':z=a-b;break;
                default: System.out.println("Invalid choice..");
            };
            System.out.printf("The Answer of %d %c %d is : %f",a,ch,b,z);
        }
        
    }
