import java.util.*;

class NullCollection {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add(null);

        // ArrayDeque does nog allow null elements
        ArrayDeque<String> ad = new ArrayDeque<>();
        //ad.push(null);

        HashMap<String, Object> hm = new HashMap<>();
        hm.put("1", null);
        hm.put(null, new Object());

        Set<String> s = new HashSet<>();
        s.add(null);

        // Hashtable does not allow null keys or values
        Hashtable<String, Object> ht = new Hashtable<>();
        //ht.put("1", null);
        //ht.put(null, new Object());

        LinkedList<String> ll = new LinkedList<>();
        ll.add(null);

        Stack<String> stack = new Stack<>();
        stack.push(null);

        // TreeMap does not allow null keys
        Map<String, Object> tm = new TreeMap<>();
        tm.put("1", null);
        //tm.put(null, new Object());

        // TreeSet does not allow null elements
        Set<String> ts = new TreeSet<>();
        //ts.add(null);

        Vector<String> v = new Vector<>();
        v.add(null);
    }
}