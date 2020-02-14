import java.time.*;

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

    }
}