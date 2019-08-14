import java.math.BigDecimal;

public class DivideByZero {
    public static void main(String[] args) {
        float f = 1.0f / 0;
        System.out.println(f);

        double d = 1.0d / 0;
        System.out.println(d);

        BigDecimal bd = BigDecimal.valueOf(1.0d).divide(BigDecimal.ZERO);
        System.out.println(bd);

        //int i = 1 / 0;
        //System.out.println(i);

        //long l = 1l / 0;
        //System.out.println(l);
    }
}