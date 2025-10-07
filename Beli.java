import java.util.Scanner;

public class Beli extends JualBeliEmas {
    @Override
    public void transaksi(float jumlah, String NPWP){
        int harga = 1200000;
        int hrg_beli;
        int pajak;
        double[] pjk = {0.45, 0.9};
        int i;
        double bsr_pjk;
        int total;

        hrg_beli = (int) (harga * jumlah);

        if(NPWP.equalsIgnoreCase("Y")){
            i=0;
        }else{
            i=1;
        }

        bsr_pjk = pjk[i] / 100;
        pajak = (int) (hrg_beli * bsr_pjk);
        total = hrg_beli + pajak;
        //Output Nota
            System.out.println("\t---------------------------------------");
            System.out.println("\t           Nota Transaksi              ");
            System.out.println("\t---------------------------------------");
            System.out.println("\t Harga Beli             : Rp. " + harga + " /g");
            System.out.println("\t Jumlah Pembelian       : " + jumlah + " g");
            System.out.println("\t Total Harga Beli       : Rp. " + hrg_beli);
            System.out.println("\t Besaran Pajak(%)       : " + pjk[i]);
            System.out.println("\t Pajak                  : Rp. " + pajak);
            System.out.println("\t Total Pembelian        : Rp. " + total);
            System.out.print("\t Pembayaran             : Rp. ");
            Scanner sc = new Scanner(System.in);
            int bayar = sc.nextInt();
            int kembalian = bayar - total;
            System.out.println("\t Kembalian              : Rp. " + kembalian);
    }
}
