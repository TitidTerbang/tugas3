package Tugas1;

import java.util.ArrayList;
import java.util.Scanner;

public class PengelolaanDataSiswa {

    private static final ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahSiswa();
                    break;
                case 2:
                    tampilkanSemuaSiswa();
                    break;
                case 3:
                    hapusSiswa();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan sangat tidak valid.");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("\n=== Pengelolaan Data Siswa ===");
        System.out.println("1. Tambah Siswa");
        System.out.println("2. Tampilkan Semua Siswa");
        System.out.println("3. Hapus Siswa");
        System.out.println("4. Keluar");
        System.out.print("Pilihan: ");
    }

    private static void tambahSiswa() {
        System.out.print("NIS: ");
        String nis = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Kelas: ");
        String kelas = scanner.nextLine();

        Siswa siswa = new Siswa(nis, nama, kelas);
        daftarSiswa.add(siswa);

        System.out.println("Siswa berhasil ditambahkan.");
    }

    private static void tampilkanSemuaSiswa() {
        if (daftarSiswa.isEmpty()) {
            System.out.println("Belum ada data siswa.");
            return;
        }

        System.out.println("\nDaftar Siswa:");
        for (Siswa siswa : daftarSiswa) {
            System.out.println(siswa);
        }
    }

    private static void hapusSiswa() {
        System.out.print("Masukkan NIS siswa yang akan dihapus: ");
        String nisHapus = scanner.nextLine();

        for (var iterator = daftarSiswa.iterator(); iterator.hasNext(); ) {
            Siswa siswa = iterator.next();
            if (siswa.getNis().equals(nisHapus)) {
                iterator.remove();
                System.out.println("Siswa dengan NIS " + nisHapus + " berhasil dihapus.");
                return;
            }
        }


        System.out.println("Siswa dengan NIS " + nisHapus + " tidak ditemukan.");

    }
}

