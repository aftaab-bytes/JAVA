import java.util.ArrayList;
import java.util.function.BiFunction;
public class Main {
    public static void main(String[] args)
    {
        BiFunction<Integer, Integer, Integer> sum = (a,b) -> {return (a+b);};
        // we should use a functional interface to store the lambda function of to the name of the variable
        System.out.println(sum.apply(4,5));

    }
}
