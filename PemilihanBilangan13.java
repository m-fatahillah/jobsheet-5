import java.util.Scanner;

public class PemilihanBilangan13 {
public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);    
    System.out.print("Masukkan sebuah angka: ");
    int angka = sc.nextInt();
    //if (angka % 2 == 0 )
    //{
     //   System.out.println("Angka " + angka +  "termasuk bilangan genap");
    //} 
    //else
    //{
    //    System.out.println("Angka " + angka + "termasuk bilangan ganjil");
    //}
    //modifikasi tenary
    String tenary = (angka % 2 == 0) ? "genap" :  "ganjil";
    System.out.println(tenary);

    sc.close();
    }
}