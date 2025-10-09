
import java.util.Scanner;

public class CM1_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Input Data Mahasiswa (Nama & NIM) */
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama\t: ");
        String nama = sc.nextLine();
        System.out.print("NIM\t: ");
        double NIM = sc.nextDouble();

        /* Input Nilai UTS, nilai UAS, dan nilai tugas pada mata kuliah 1 */
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman --- ");
        System.out.print("Nilai UTS\t: ");
        double nilaiUts1 = sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double nilaiUas1 = sc.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double nilaiTugas1 = sc.nextDouble();

        /* Input Nilai UTS, nilai UAS, dan nilai tugas pada mata kuliah 2 */
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        double nilaiUts2 = sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double nilaiUas2 = sc.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double nilaiTugas2 = sc.nextDouble();

        /* HITUNG NILAI AKHIR */
        double nilaiAkhir1 = (nilaiUts1 * 0.3) + (nilaiUas1 * 0.4) + (nilaiTugas1 * 0.3);
        double nilaiAkhir2 = (nilaiUts2 * 0.3) + (nilaiUas2 * 0.4) + (nilaiTugas2 * 0.3);
        double nilaiRataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;

        /* Status nilai akhir 1 dan 2 (lulus/tidak lulus) */
        String status1 = (nilaiAkhir1 >= 60) ? "Lulus" : "Tidak Lulus";
        String status2 = (nilaiAkhir2 >= 60) ? "Lulus" : "Tidak Lulus";

        /* Konversi nilai huruf (Switch Case) */
        String huruf1, huruf2, kualifikasi;
        double nilaiSetara;

        /* Kategori Nilai Huruf Matkul 1 */
        if (80 < nilaiAkhir1 && nilaiAkhir1 <= 100) {
            huruf1 = "A";
            nilaiSetara = 4.0;
            kualifikasi = "Sangat baik";
        } else if (73 < nilaiAkhir1 && nilaiAkhir1 <= 80) {
            huruf1 = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Baik";
        } else if (65 < nilaiAkhir1 && nilaiAkhir1 <= 73) {
            huruf1 = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (60 < nilaiAkhir1 && nilaiAkhir1 <= 65) {
            huruf1 = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Baik";
        } else if (50 < nilaiAkhir1 && nilaiAkhir1 <= 60) {
            huruf1 = "C";
            nilaiSetara = 2;
            kualifikasi = "Baik";
        } else if (39 < nilaiAkhir1 && nilaiAkhir1 <= 50) {
            huruf1 = "D";
            nilaiSetara = 1;
            kualifikasi = "Baik";
        } else if (nilaiAkhir1 >= 0 && nilaiAkhir1 <= 39) {
            huruf1 = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }
        else { 
            huruf1 = "Invalid";
        }

        /* Kategori Nilai Huruf Matkul 2 */
        if (80 < nilaiAkhir2 && nilaiAkhir2 <= 100) {
            huruf2 = "A";
            nilaiSetara = 4.0;
            kualifikasi = "Sangat baik";
        } else if (73 < nilaiAkhir2 && nilaiAkhir2 <= 80) {
            huruf2 = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Baik";
        } else if (65 < nilaiAkhir2 && nilaiAkhir2 <= 73) {
            huruf2 = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (60 < nilaiAkhir2 && nilaiAkhir2 <= 65) {
            huruf2 = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Baik";
        } else if (50 < nilaiAkhir2 && nilaiAkhir2 <= 60) {
            huruf2 = "C";
            nilaiSetara = 2;
            kualifikasi = "Baik";
        } else if (39 < nilaiAkhir2 && nilaiAkhir2 <= 50) {
            huruf2 = "D";
            nilaiSetara = 1;
            kualifikasi = "Baik";
        } else if (nilaiAkhir2 >= 0 && nilaiAkhir2 <= 39) {
            huruf2 = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }
        else {
            huruf2 = "Invalid";
        }

        if (nilaiAkhir1 >= 60) {
            status1 = "Lulus";
        } else {
            status1 = "Tidak Lulus";
        }

        if (nilaiAkhir2 >= 60) {
            status2 = "Lulus";
        } else {
            status2 = "Tidak Lulus"; 
        }
        
        /* Rata-rata dan Status Semester (Nested if) */
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) /2;
        String statusSemester;
        
        if (status1.equals("Lulus") && status2.equals("Lulus")) {
            if (rataRata >= 70) {
                statusSemester = "Lulus";
            } else {
                statusSemester = " Tidak Lulus";
            }
        } else {
            statusSemester = "Tidak Lulus";
        }

        /* Output */
        System.out.println("\n==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + NIM);
        System.out.println("\nMata Kuliah\t\t\t\tUTS\tUAS\tTugas\tNilai Akhir\t\tNilai Huruf\t\tStatus");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t\t\t" + nilaiUts1 + "\t" + nilaiUas1 + "\t" + nilaiTugas1 + "\t" + nilaiAkhir1 + "\t\t\t" + huruf1 + "\t\t" + status1);
        System.out.println("Struktur Data\t\t\t\t" + nilaiUts2 + "\t" + nilaiUas2 + "\t" + nilaiTugas2 + "\t" + nilaiAkhir2 + "\t\t\t" + huruf2 + "\t\t" + status2);
        System.out.println("\nRata-rata Nilai Akhir: " + rataRata);
        System.out.println("Status Semester: " + statusSemester);
    } 
}
