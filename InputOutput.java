import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  double n_tugas , n_uts , n_kuis , n_uas , n_akhir;
  
  System.out.print("Masukkan nama anda: ");
  nama = scanner.nextLine();
  System.out.println("Hai, "+nama);

  System.out.print("Nilai tugas : ");
  n_tugas = scanner.nextInt();

  System.out.print("Nilai kuis : ");
  n_kuis = input.nextInt();
  System.out.println("Nilai uts : ");
  n_uts = input.nextInt();
  System.out.print("Nilai uas : ");
  n_uas = input.nextInt();
  n_akhir = (0.15 * n_tugas + 0.20 * n_kuis + 0.30 * n_uts + 0.35 * n_uas);
  System.out.println(nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir);
 }
}