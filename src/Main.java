class Pesanan {
    String namaMakanan;
    double harga;
    int jumlah;
    double total;


    // Constructor Live Template (ketik 'ctor' + Enter)
    public Pesanan(String namaMakanan, double harga, int jumlah, double total) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }


    public double getTotal() {
        return total;
    }

    public void tampilkanDetail() {
        System.out.println(namaMakanan + " x " + jumlah + " (@Rp " + harga + ") = Rp " + total);
    }
}