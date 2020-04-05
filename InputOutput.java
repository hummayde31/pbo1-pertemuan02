import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama , NPM;
  double Nilai_tugas , Nilai_kuis , Nilai_uts , Nilai_uas , Nilai_akhir;
  
  System.out.print("Masukkan nama anda: ");
  nama = scanner.nextLine();

  System.out.print("Masukan NPM : ");
  NPM = scanner.nextLine();

  System.out.print("Masukkan Nilai tugas : ");
  Nilai_tugas = scanner.nextInt();

  System.out.print("Nilai kuis : ");
  Nilai_kuis = scanner.nextInt();

  System.out.print("Nilai uts : ");
  Nilai_uts = scanner.nextInt();

  System.out.print("Nilai uas : ");
  Nilai_uas = scanner.nextInt();

  Nilai_akhir = (0.15 * Nilai_tugas + 0.20 * Nilai_kuis + 0.30 * Nilai_uts + 0.35 * Nilai_uas);
  System.out.println(nama+"Dengan NPM" +NPM+" Memiliki nilai akhir "+Nilai_akhir);

 }
}