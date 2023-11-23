import java.util.Scanner;

public class FungsiKel05_26 {

    public static void inputDataPengiriman() {
        Scanner inputDataPengiriman = new Scanner(System.in);

        String  NamaPengirim, AlamatPengirim,
                NamaPenerima, AlamatPenerima,
                JenisBarang, TanggalPengiriman,
                JenisLayanan;
        long NomorTeleponPengirim, NomorTeleponPenerima;
        int KodePos, NomorResi;
        double BeratBarang = 0.0;

        System.out.println("\n============= Informasi Pengiriman =============");
        System.out.print("\nNama Pengirim             : ");
        NamaPengirim = inputDataPengiriman.next();
        System.out.print("Nomor Telepon Pengirim    : ");
        NomorTeleponPengirim = inputDataPengiriman.nextLong();
        System.out.print("Alamat Pengirim           : ");
        AlamatPengirim = inputDataPengiriman.next();
        System.out.print("Tanggal Pengiriman        : ");
        TanggalPengiriman = inputDataPengiriman.next();
        System.out.print("Nama Penerima             : ");
        NamaPenerima = inputDataPengiriman.next();
        System.out.print("Nomor Telepon Penerima    : ");
        NomorTeleponPenerima = inputDataPengiriman.nextLong();
        System.out.print("Alamat Penerima           : ");
        AlamatPenerima = inputDataPengiriman.next();
        System.out.print("Kode Pos                  : ");
        KodePos = inputDataPengiriman.nextInt();
        System.out.print("Jenis Layanan             : ");
        JenisLayanan = inputDataPengiriman.next();
        System.out.print("Jenis Barang              : ");
        JenisBarang = inputDataPengiriman.next();
        System.out.print("Nomor Resi                : ");
        NomorResi = inputDataPengiriman.nextInt();
        System.out.print("Berat Barang              : ");
        BeratBarang = inputDataPengiriman.nextDouble();
    }

    public static void main(String[] args) {
        inputDataPengiriman();
    }
}
