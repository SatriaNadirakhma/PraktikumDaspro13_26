import java.util.Scanner;

public class Percobaan626 {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan Panjang");
        p=input.nextInt();
        System.out.println("Masukkan Lebar");
        l=input.nextInt();
        System.out.println("Masukkan Tinggi");
        t=input.nextInt();

        L=p*l;
        System.out.println("Luas Persegi Panjang adalah " +L);

        vol=p*l*t;
        System.out.println("Volume balok adalah " +vol);
    }
    //Fungsi Hitung Luas
    static int hitungLuas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    }
    //Fungsi Hitung Volume
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) *tinggi;
        return volume;
    }
    //Fungsi Main
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int p,l,t,L,vol;
        System.out.println("Masukkan Panjang");
        p=input.nextInt();
        System.out.println("Masukkan Lebar");
        l=input.nextInt();
        System.out.println("Masukkan Tinggi");
        t=input.nextInt();

        L=hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " +L);
        vol=hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " +vol);
    }
}
