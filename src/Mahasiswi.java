public class Mahasiswi <A,B> {
    A name;
    A alamat;
    B nim;

    public Mahasiswi (A name, A alamat, B nim){
        this.name = name;
        this.alamat = alamat;
        this.nim = nim;
    }

    public void print(){
        System.out.println("NAMA : "+name);
        System.out.println("ALAMAT : "+alamat);
        System.out.println("nim : "+nim);
    }
}
