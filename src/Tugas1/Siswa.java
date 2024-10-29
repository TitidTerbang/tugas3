package Tugas1;

class Siswa {
    private final String nis;  // NIS tetap final
    private String nama;     // Nama dan kelas sekarang bisa diubah
    private String kelas;

    public Siswa(String nis, String nama, String kelas) {
        this.nis = nis;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNis() {
        return nis;
    }

    public void setNama(String nama) { // Setter untuk nama
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }


    public void setKelas(String kelas) { // Setter untuk kelas
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    @Override
    public String toString() {
        return "NIS: " + nis + ", Nama: " + nama + ", Kelas: " + kelas;
    }
}
