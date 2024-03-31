import java.util.List;

public class Iteration {
    static Iterable<String> names = List.of("Ujang", "Herlan", "Kamu");
    static java.util.Iterator<String> iterator = names.iterator();

    public static void demonstrateIterable() {
        System.out.println("Iterable");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    public static void demonstrateIterator() {
        System.out.println("Iterator");

        // Make sure to use the iterator instance correctly.
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println();
    }
}
