import java.util.Scanner;

public class Jual extends JualBeliEmas {
    @Override
    public void transaksi(float jumlah, String NPWP) {
        int harga = 1100000; // harga jual per gram
        int hrg_jual;
        int pajak;
        double[] pjk = {1.5, 3.0};
        int i;
        double bsr_pjk;
        int total_diterima;

        hrg_jual = (int) (harga * jumlah);

        // Percabangan untuk menentukan pajak berdasarkan NPWP
        if (NPWP.equals("Y") || NPWP.equals("y")) {
            i = 0;
        } else {
            i = 1;
        }

        bsr_pjk = pjk[i] / 100.0;
        // Hitung pajak dan total diterima
        pajak = (int) (hrg_jual * bsr_pjk);
        total_diterima = hrg_jual - pajak;

        // Output Nota
        System.out.println("\t---------------------------------------");
        System.out.println("\t           Nota Penjualan              ");
        System.out.println("\t---------------------------------------");
        System.out.println("\t Harga Jual             : Rp. " + harga + " /g");
        System.out.println("\t Jumlah Emas Dijual     : " + jumlah + " g");
        System.out.println("\t Total Nilai Jual       : Rp. " + hrg_jual);
        System.out.println("\t Besaran Pajak(%)       : " + pjk[i]);
        System.out.println("\t Pajak Penjualan        : Rp. " + pajak);
        System.out.println("\t Total Uang Diterima    : Rp. " + total_diterima);

        // Konfirmasi penerimaan uang
        Scanner sc = new Scanner(System.in);
        System.out.print("\t Apakah uang sudah diterima? (Y/T): ");
        String konfirmasi = sc.next();

        if (konfirmasi.equalsIgnoreCase("Y")) {
            System.out.println("\t Transaksi penjualan berhasil. Terima kasih!");
        } else {
            System.out.println("\t Transaksi dibatalkan.");
        }
    }
}