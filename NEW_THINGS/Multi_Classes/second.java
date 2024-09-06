public class second {
    public static void main(String[] args)
    {
        //declaring object for using a public class method
        first pr = new first();
        // ACCESING THE METHOD OF PUBLIC CLASS USING OBJECT
        pr.print();
        System.out.println("This is second program");
        // ACCESSING THE METHOD OF STATIC CLASS
        first.stat();
    }
}