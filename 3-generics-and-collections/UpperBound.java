import java.util.*;

class UpperBound {
    static class Sparrow extends Bird {}
    static class Bird {}

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
        //birds.add(new Sparrow());
        birds.add(new Bird());
        exbirds = birds;
    }
}