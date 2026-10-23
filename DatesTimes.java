import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesTimes {
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDate date2 = LocalDate.of(2024, 12, 25);
        System.out.println(date2);

        LocalDateTime dateTime2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        System.out.println(dateTime2);

        if(dateTime.isBefore(dateTime2)){
            System.out.println(dateTime + " is earlier than " + dateTime2);
        }
        else if(dateTime.isAfter(dateTime2)){
            System.out.println(dateTime + " is later than " + dateTime2);
        }
        else if(dateTime.isEqual(dateTime2)){
            System.out.println(dateTime + " is equal to " + dateTime2);
        }


    }
    
}
