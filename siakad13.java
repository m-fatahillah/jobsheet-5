import java.util.Scanner;

public class siakad13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai_setara = 0;
        String nilai_huruf = "";
        String kualifikasi = "";

        System.out.println("=========================================");
        System.out.println("=============Aplikasi SiAkad=============");
        System.out.println("=========================================");

        System.out.println("");

        System.out.print("Masukkan nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Masukkan nim: ");
        String nim = input.nextLine();

        System.out.print("Masukkan kelas : ");
        char kelas = input.next().charAt(0);

        System.out.print("Masukkan no. absen : ");
        byte absen = input.nextByte();

        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");

        System.out.print("Masukkan nilai kuis : ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan nilai tugas : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        double nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            nilai_huruf = "A";
            nilai_setara = 4;
            kualifikasi = "Sangat Baik";
        }
        else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            nilai_huruf = "B+";
            nilai_setara = 3.5;
            kualifikasi = "Lebih dari Baik";
        }
        else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            nilai_huruf = "B";
            nilai_setara = 3;
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            nilai_huruf = "C+";
            nilai_setara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        }
        else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            nilai_huruf = "C";
            nilai_setara = 2;
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            nilai_huruf = "D";
            nilai_setara = 1;
            kualifikasi = "Kurang";
        }
        else if (nilaiAkhir <= 39) {
            nilai_huruf = "E";
            nilai_setara = 0;
            kualifikasi = "Gagal";
        }

        System.out.println("");
        System.out.println("==================Hasil==================");
        System.out.println("");

        System.out.println("Nama : " + nama + " NIM : " + nim);
        System.out.println("Kelas : " + kelas + " Absen : " + absen);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilai_huruf);
        System.out.println("Nilai Setara : " + nilai_setara);
        System.out.println("Kualifikasi : " + kualifikasi);

    }
    
}
