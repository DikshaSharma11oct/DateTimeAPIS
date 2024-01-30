import java.time.LocalDateTime;

public class javaDateTime{

    public static void main(String[] args){

        LocalDateTime localDate =  LocalDateTime.now();
        LocalDateTime yesterday = localDate.minusDays(1);
        LocalDateTime nextDay = localDate.plusDays(1);

        System.out.println(yesterday); //in date timeApi time will also come
        System.out.println(nextDay);
        // for date time API


    }
}