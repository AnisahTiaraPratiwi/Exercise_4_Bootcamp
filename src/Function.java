import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Function {
    public static void selamatAnonymous (){
        System.out.println("Selamat Hari Raya Idul Fitri, mohon maaf lahir dan batin");
    }
    public static void ucapanSelamat(String nama){
        System.out.println(  "Di Ucapkan Untuk " +nama + ", Selamat Hari Raya Idul Fitri, mohon maaf lahir dan batin.");
    }

    public static long hitungHari (LocalDate tanggal1, LocalDate tanggal2 ){
        long dayPeriod = ChronoUnit.DAYS.between(tanggal1,tanggal2);
        return dayPeriod;
    }

    public static double kecepatan( double jarak, double waktu ){
        double kecepatan = jarak / waktu;
        if (kecepatan == jarak/0) {
            System.out.print("Dimohon inputkan waktu yang sesuai\n");
        } else if (waktu < 0){
            System.out.print("Dimohon inputkan waktu yang sesuai\n");
        } else if (kecepatan < 0){
            System.out.print("Dimohon inputkan waktu yang sesuai\n");
        } else
            System.out.print("Kecepatanya adalah " +kecepatan +" km/jam\n");
        return kecepatan;
    }

    public static int tahunKabisat(int tahun){
        if (tahun % 4 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else
            System.out.print(tahun + " Bukan Tahun Kabisat\n");
        return tahun;

    }

    public static  long hitungTahun (LocalDate umur1, LocalDate umur2){
        long yearPeriod = ChronoUnit.YEARS.between(umur2,umur1);
        return yearPeriod;
    }

    public static boolean getYesorno (String massage)  {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\n" + massage + "(y/n)");
        String input = inputUser.next();

        while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")){
            System.err.println("pilihan tidak ada ");
            System.out.print("\n" + massage + "(y/n)");
            input = inputUser.next();
        }
        return input.equalsIgnoreCase("y");
    }
}
