import java.util.Scanner;

public class Kubus26 {
    // Fungsi Hitung Luas Persegi
    static int hitungLuas(int s) {
        return s * s;
    }

    // Fungsi Hitung Volume Kubus
    static int hitungVolume(int s) {
        return s * s * s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sisi untuk kubus
        System.out.println("Masukkan Sisi Kubus");
        int s = input.nextInt();

        // Menghitung dan menampilkan luas persegi kubus
        int luasPersegi = hitungLuas(s);
        System.out.println("Luas Persegi Kubus adalah " + luasPersegi);

        // Menghitung dan menampilkan volume kubus
        int volumeKubus = hitungVolume(s);
        System.out.println("Volume Kubus adalah " + volumeKubus);
    }
}
