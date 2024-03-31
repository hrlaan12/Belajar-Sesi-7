import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Collection {
    static List<String> names = new ArrayList<>();

    static void addCollection() {
        System.out.println("Add Collection");

        names.add("eko");
        names.add("kurniawan");
        names.addAll(Arrays.asList("Robi", "Gunawan"));

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    static void removeCollection() {
        System.out.println("Remove Collection");

        // Assuming here that you want to show the removal operation separately
        // Clear the list to avoid confusion if this method is called after addCollection
        names.clear();

        names.add("eko");
        names.add("kurniawan");
        names.addAll(Arrays.asList("Robi", "Gunawan"));

        names.remove("eko");
        names.removeAll(Arrays.asList("Robi", "Gunawan"));

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    static void checkCollection() {
        System.out.println("Check Collection");

        // Clear the list to avoid confusion if this method is called after the others
        names.clear();

        names.add("eko");
        names.add("kurniawan");
        names.addAll(Arrays.asList("Robi", "Gunawan"));

        System.out.println(names.contains("eko"));
        System.out.println(names.containsAll(Arrays.asList("eko", "kurniawan")));

        names.remove("eko");
        names.removeAll(Arrays.asList("Robi", "Gunawan"));

        System.out.println(names.contains("eko"));
        System.out.println(names.containsAll(Arrays.asList("eko", "kurniawan")));

        System.out.println();
    }
}
