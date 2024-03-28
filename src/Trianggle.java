public class Trianggle {
    public static <T> void calculateLuas(T alas, T tinggi){
        double Luas = 0.5 * Double.parseDouble(alas.toString()) * Double.parseDouble(tinggi.toString());
        System.out.println("Luas Segitiga:"+Luas);
    }

    public static <T,U> double hitungKeliling(T alas, U tinggi){
        double sisiMiring = Math.sqrt(Math.pow(0.5 * Double.parseDouble(alas.toString()), 2) + Math.pow(Double.parseDouble(tinggi.toString()), 2));
        double Keliling = Double.parseDouble(alas.toString()) + Double.parseDouble(tinggi.toString()) + sisiMiring;
        return Keliling;
    }
}
