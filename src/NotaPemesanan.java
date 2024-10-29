import java.util.ArrayList;
import java.util.Scanner;

public class NotaPemesanan {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

    public static void main(String[] args) {
        tampilkanMenu();
    }

    static void tampilkanMenu() {
        int pilihan;

        do {
            System.out.println("\n=== Restoran Sederhana ===");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Bayar");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahPesanan();
                    break;
                case 2:
                    lihatPesanan();
                    break;
                case 3:
                    bayar();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }


    static void tambahPesanan() {
        System.out.print("Nama Makanan: ");
        String namaMakanan = input.nextLine();
        System.out.print("Harga: ");
        double harga = input.nextDouble();
        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();
        input.nextLine();


        // Custom Live Template: hitungTotal (alt+enter untuk memunculkannya setelah mengetik "hitungTotal")
        double total = harga * jumlah;


        Pesanan pesanan = new Pesanan(namaMakanan, harga, jumlah, total);
        daftarPesanan.add(pesanan);

        System.out.println("Pesanan ditambahkan!");
    }

    static void lihatPesanan() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        System.out.println("\nDaftar Pesanan:");
        for (Pesanan pesanan : daftarPesanan) {
            pesanan.tampilkanDetail();
        }
    }

    static void bayar() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        double totalBayar = 0;
        for (Pesanan pesanan : daftarPesanan) {
            totalBayar += pesanan.getTotal(); // Live Template 'pesanan.getTotal()' (Ctrl+Space atau ketik 'getTotal' dan tekan Enter)
        }

        System.out.println("\nTotal Bayar: Rp " + totalBayar);
        System.out.print("Uang Tunai: Rp ");
        double uangTunai = input.nextDouble();


        // Custom Live Template: hitungKembalian
        double kembalian = uangTunai - totalBayar;


        if (kembalian >= 0) {
            System.out.println("Kembalian: Rp " + kembalian);
            daftarPesanan.clear(); // Kosongkan daftar pesanan setelah bayar
        } else {
            System.out.println("Uang tunai kurang!");
        }
    }
}
