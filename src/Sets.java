import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void heshSet(){
        System.err.println("Hesh Set");

        java.util.Set<String> names = new HashSet<>();
        names.add("eko");
        names.add("Kurniawan");
        names.add("Khendy");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

    }

    public static void LinkedHashSet(){
        System.out.println("Linked Hash Set");

        Set<String> names = new java.util.HashSet<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khendy");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
}
