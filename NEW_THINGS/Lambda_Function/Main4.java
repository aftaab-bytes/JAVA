// creating an own functional interface 
interface Tri <a,b,c,d>{
    d apply(a A,b B,c C);
}
public class Main4 {
   public static void main(String[] args)
    {
        Tri<Integer,Integer,Integer,Integer> SUM = (a,b,c) -> {return(a+b+c);};
        System.out.println("The sum is : "+ SUM.apply(1,2,3));
    }
}
