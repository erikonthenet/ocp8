class ReviewQuestion11 {

    public interface Secret {
        String magic(double d);
    }

    public class MySecret implements Secret {
        public String magic(double d) {
            return "Poof";
        }
    }

    public String caller(Secret secret) {
        return secret.magic(5d);
    }

    public static void main(String[] args) {
        ReviewQuestion11 rq = new ReviewQuestion11();
        System.out.println(rq.caller((e) -> {String e = ""; return "Poof";}));
    }
}