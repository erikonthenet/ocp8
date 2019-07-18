import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetResearch {
    public static void main(String[] args) {
        String a = "DSP";
        String b = "DSO";
        String c = "DSF";
        Set set = new HashSet(Arrays.asList(a, b, c));

        System.out.println(set.contains("DSP"));

        System.out.println(a.hashCode());
        System.out.println("DSP".hashCode());
    }
}