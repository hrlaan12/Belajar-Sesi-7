public class App {
    public static void main(String[] args) {
        // Assuming Mahasiswi is defined correctly elsewhere with a matching constructor
        Mahasiswi<String, Integer> mhs = new Mahasiswi<>("Amira", "Jl. Kedungadem", 2022004002); // Assuming constructor Mahasiswi<String, String, Integer>
        mhs.print();

        Limbath<Integer, Double> math = new Limbath<>(10, 5.5);
        System.out.println("Hasil penambahan: " + math.add());

        Limbath<Integer, Double> math2 = new Limbath<>(10, 5.5);
        System.out.println("Hasil pengurangan: " + math2.sub());

        Trianggle.calculateLuas(10, 20);
        System.out.println(Trianggle.hitungKeliling(10, 20));
    }
}
