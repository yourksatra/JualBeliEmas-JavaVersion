import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variabel untuk memanggil class Beli dan Jual
        Beli alpa = new Beli();
        Jual beta = new Jual();

        // Tampilan utama program
        System.out.println("\t---------------------------------------");
        System.out.println("\t        Program Jual Beli Emas         ");
        System.out.println("\t---------------------------------------");
        System.out.println("\t Daftar Transaksi : ");
        System.out.println("\t     [1] Beli Emas");
        System.out.println("\t     [2] Jual Emas");
        System.out.println("\t---------------------------------------");
        System.out.println("\t     Beli Emas Min(0,05g) Max(80g)     ");
        System.out.println("\t     Jual Emas Min(1g)   Max(100g)     ");
        System.out.println("\t---------------------------------------");
        System.out.print("\t Pilih Transaksi                  : ");
        int pilih = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        // Control flow percabangan if else if untuk pilihan transaksi
        if (pilih == 1) {
            System.out.print("\t Apakah Anda Mempunya NPWP? (Y/T) : ");
            String npwp = sc.nextLine();
            System.out.print("\t Jumlah(g)                        : ");
            float jmlh_emas = sc.nextFloat();

            // Percabangan pengecekan jumlah emas
            if (jmlh_emas >= 0.05 && jmlh_emas <= 80.0) {
                // Pemanggilan fungsi transaksi beli
                alpa.transaksi(jmlh_emas, npwp);
            } else {
                fail("Pembelian Emas Tidak Diterima");
            }

        } else if (pilih == 2) {
            System.out.print("\t Apakah Anda Mempunya NPWP? (Y/T) : ");
            String npwp = sc.nextLine();
            System.out.print("\t Jumlah(g)                        : ");
            float jmlh_emas = sc.nextFloat();

            // Percabangan pengecekan jumlah emas
            if (jmlh_emas >= 1.0 && jmlh_emas <= 100.0) {
                // Pemanggilan fungsi transaksi jual
                beta.transaksi(jmlh_emas, npwp);
            } else {
                fail("Penjualan Emas Tidak Diterima");
            }

        } else {
            // Pernyataan jika salah memilih transaksi
            System.out.println("\t Daftar Transaksi Tidak Ada");
            System.out.print("\t Apakah Ingin Mengulang? (Y/T) : ");
            sc.nextLine(); // membersihkan buffer
            String ulang = sc.nextLine();

            if (ulang.equalsIgnoreCase("y")) {
                main(null); // panggil ulang fungsi main
                return;
            }
        }

        // Transaksi selesai
        System.out.println("\t---------------------------------------");
        System.out.println("\t          Transaksi Selesai            ");
        System.out.println("\t---------------------------------------");
        System.out.print("\t Apakah Anda Ingin Mengulang? (Y/T) : ");
        sc.nextLine(); // membersihkan buffer
        String loop = sc.nextLine();

        if (loop.equalsIgnoreCase("y")) {
            main(null);
        } else {
            exitProcess(999);
        }

        sc.close();
    }

    // Fungsi fail untuk exception
    public static void fail(String message) {
        throw new IllegalArgumentException(message);
    }

    // Fungsi exitProcess
    public static void exitProcess(int status) {
        System.exit(status);
        throw new RuntimeException("System.exit returned normally, TerimaKasih.");
    }
}