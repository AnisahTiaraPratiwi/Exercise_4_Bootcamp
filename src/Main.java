import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner inputUser = new Scanner(System.in);
        String input;
        boolean next = true;

        while (next) {
            System.out.println("Pilih lah salah satu menu pada aplikasi ini:");
            System.out.println("1. Membuat ucapan idul fitri untuk anonymous");
            System.out.println("2. Membuat kartu ucapan idul fitri untuk seseorang");
            System.out.println("3. Menghitung lama hari dari jarak 2 tanggal");
            System.out.println("4. Menghitung kecepatan sebuah mobil");
            System.out.println("5. Menentukan apakah sebuah tahun merupakan tahun kabisat atau bukan");
            System.out.println("6. Menghitung perbedaan umur 2 orang pada hari ini.");
            System.out.print("Masukan Pilihan Anda :");
            input = inputUser.nextLine();

            String date;

            switch (input) {
                case "1":
                    Function.selamatAnonymous();
                    break;

                case "2":
                    System.out.print("Di ucapkan Untuk : ");
                    String nama = inputUser.nextLine();
                    Function.ucapanSelamat(nama);
                    break;

                case "3":
                    while(true) {
                    try {
                        System.out.print("Masukan tanggal awal dengan Format (d/M/yyyy) : ");
                        date = inputUser.next();

                        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/yyyy");
                        LocalDate localDate1 = LocalDate.parse(date, format);

                        System.out.print("Masukan Tanggal Akhir dengan Format (d/M/yyyy) : ");
                        date = inputUser.next();
                        LocalDate localDate2 = LocalDate.parse(date, format);
                        System.out.println("Jarak dari " + localDate1 + " sampai " + localDate2 + " adalah "
                                + Function.hitungHari(localDate1, localDate2) + " hari");
                        break;
                    } catch (Exception e) {
                        System.err.println("Masukan Format dengan Benar");
                    }
                }
                    break;

                case "4" :
                    System.out.print("Masukan Jarak yang di Tempuh (dalam Satuan Km) :");
                    double jarak = inputUser.nextDouble();
                    System.out.print("Masukan Waktu yang di Tempuh (dalam Satuan Jam) :");
                    double waktu = inputUser.nextDouble();
                    double kecepatan = Function.kecepatan(jarak,waktu);
                    break;

                case "5":
                    System.out.print("Masukan Tahun yang Ingin di check : ");
                    int tahun = inputUser.nextInt();
                    Function.tahunKabisat(tahun);
                    break;

                case "6":
                    while (true) {
                        try {
                            System.out.print("Masukan Nama Orang Pertama :");
                            String people1 = inputUser.next();
                            System.out.print("Masukan Tanggal Lahir dengan Format (d/M/yyyy) : ");
                            date = inputUser.next();

                            DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/yyyy");
                            LocalDate localDate1 = LocalDate.parse(date, format);

                            System.out.print("Masukan Nama Orang Kedua :");
                            String poeple2 = inputUser.next();
                            System.out.print("Masukan Tanggal Lahir dengan Format (d/M/yyyy) : ");
                            date = inputUser.next();
                            LocalDate localDate2 = LocalDate.parse(date, format);
                            System.out.println("Perbedaan Umur " + people1 + " dan " + poeple2 + " adalah " + Function.hitungTahun(localDate1, localDate2) + " Tahun pada hari ini");
                            break;
                        } catch (Exception e) {
                            System.err.println("Masukan Format dengan Benar");
                        }
                    }
                    break;

                default:
                    System.out.println("Pilihan Anda Tidak Ada");
            }


            next = Function.getYesorno("Apakah Anda Ingin Melanjutkan?");



        }


    }
}



