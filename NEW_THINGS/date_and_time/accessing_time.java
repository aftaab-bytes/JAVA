import java.time.LocalTime;
import java.time.LocalDateTime;
public class accessing_time
{
    public static void main(String[] args)
    {
        LocalTime c =  LocalTime.now();
        LocalDateTime d = LocalDateTime.now();
        System.out.printf("Time : %s Date : %s",c,d);
    }
}

