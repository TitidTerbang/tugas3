package Tugas1;

class Siswa {
    final private String nis;
    final private String nama;
    final private String kelas;

    public Siswa(String nis, String nama, String kelas) {
        this.nis = nis;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNis() {
        return nis;
    }

    @Override
    public String toString() {
        return "NIS: " + nis + ", Nama: " + nama + ", Kelas: " + kelas;
    }
}
