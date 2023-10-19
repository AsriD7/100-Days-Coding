package soal2;

public class Main {
    public static void main(String[] args) {
        int gaji,harga_pc,tabungan,total_tagihan,bln;
        double tahun;
        float bulan_tahun=12f;
        harga_pc = 150000000;
        gaji = 13000000;
        total_tagihan = 8000000;
        tabungan = gaji - total_tagihan;
        bln = harga_pc/tabungan;
        tahun = bln/bulan_tahun;
        System.out.println("Jadi Sambo harus menabung selama "+bln+" bulan atau setara dengan "+tahun+" tahun");
        
  }
}
