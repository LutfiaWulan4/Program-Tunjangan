
package latihan_pertemuan_6;
import java.util.Scanner;
/**
 * NAMA              : Lutfia Wulandari
 * KELAS             : PBO12
 * NIM               : 23176008
 * PRODI             : Sistem Informasi
 * SEMESTER          : 3
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program           : Tunjangan
 */
public class Latihan_17 {

        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                Scanner input = new Scanner(System.in);
                
                System.out.println("=====Program Tunjangan=====");
                System.out.print("Nama Anda: ");
                String nama = input.nextLine();
                
                System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
                double gajiPokok = scanner.nextDouble();
                
                System.out.print("Status Anda? (Menikah/Belum): ");
                String status = scanner.next();
                
                double tunjangan = 0;
                
                if (status.equalsIgnoreCase("Menikah")) {
                    tunjangan = gajiPokok * 0.35;
                }
                
                double totalGaji = gajiPokok + tunjangan;
                
                System.out.println("========Hasil Perhitungan Gaji Anda=========");
                System.out.println("Nama  : " + nama);
                System.out.println("Gaji Pokok   : Rp " + gajiPokok);
                System.out.println("Tunjangan    : Rp " + tunjangan);
                System.out.println("Total Gaji  : Rp " + totalGaji);
            }
    }
}
  
