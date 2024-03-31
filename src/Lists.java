public class Lists {
    public static void list(){
        System.out.println("List");

        java.util.List<String> names = new java.util.ArrayList<>();
        names.add("eko");
        names.add("Kurniawan");
        names.add("Khendy");

        names.set(0, "Rifki");
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println();
    }
}
