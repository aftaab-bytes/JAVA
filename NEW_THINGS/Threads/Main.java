
public class Main extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        x++;
    }
    public static int x= 0;
    public static void main(String[] args)
    {
        Main thread = new Main();
        thread.start();
        x++;
        System.out.println(x);
        while(thread.isAlive())
        System.out.println("thread is working.....");
        x++;
        System.out.println(x);
        // it may give different output because of the  thread are working parallely to the main method
}
}