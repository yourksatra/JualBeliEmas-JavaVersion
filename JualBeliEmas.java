import java.util.Scanner;

public class JualBeliEmas {
    Scanner sc = new Scanner(System.in);
    public void transaksi(float jumlah, String NPWP){
    }

    public static void exitProcess(int status){
        System.exit(status);
        throw new RuntimeException("System.exit returned normally, Terimakasih.");
    }

    public static void fail(String message){
        throw new IllegalArgumentException(message);
    }
}