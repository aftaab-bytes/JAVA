class fruit
{
    protected int x=10;
    public void taste(){
    System.out.println("It tastes good...");
}}
class apple extends fruit{
    private int y=20;
    public static void main(String args[])
    {
        apple ap = new apple();
        ap.taste();// accessing the method of parent class using child class 
        System.out.printf("THE VALUE OF X IN THE PARENT CLASS %d AND THE VALUE OF Y IN CHILD CLASS IS %d",ap.x,ap.y);//accessing the variables of the parent class and the child class
        // note only the protected variables can be accessed by the child class and not the "private" ones
        //final class cannot be inherited
        
    }
}