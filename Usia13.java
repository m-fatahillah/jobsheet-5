import java.util.Scanner;

public class Usia13 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String kategori = "";

        System.out.print("Masukkan usia\t : ");
        int usia = input.nextInt();

        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
            System.out.println("Kategori usia\t : " + kategori);
        }
        else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
            System.out.println("Kategori usia\t : " + kategori);
        }
        else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
            System.out.println("Kategori usia\t : " + kategori);
        }
        else if (usia >= 65) {
            kategori = "Lansia";
            System.out.println("Kategori usia\t : " + kategori);
        }
        else {
            System.out.println("input tidak valid");
        }

    }

}
