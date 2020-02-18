import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Properties;

class Test {
    public static void main(String[] args) {
        LocalDate.of(2015, Month.JANUARY, 20);

        System.out.println(ZoneId.systemDefault());

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Period p = Period.ofWeeks(2);
        System.out.println(date.plus(p));
        Duration d = Duration.ofNanos(1000000000);
        System.out.println(dateTime);
        System.out.println(dateTime.plus(d));

        System.out.println(Duration.of(1, ChronoUnit.MINUTES).toString());
        System.out.println(Duration.ofMinutes(1).toString());
        System.out.println(Duration.ofSeconds(60).toString());

        Properties props = new Properties();
        props.put("a", "aap");
        props.put("b", "noot");
        props.put("c", "mies");
    }
}