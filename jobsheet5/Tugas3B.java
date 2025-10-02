
import java.util.Scanner;

public class Tugas3B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengguna;
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        pengguna = sc.nextLine().trim();

        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.print("Akses wifi diberikan");
        } else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses wifi diberikan (mahasiswa)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
    }
}