import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  double Nilai_tugas;
  
  System.out.print("Masukkan nama anda: ");
  nama = scanner.nextLine();
  System.out.println("Hai, "+nama);

  System.out.print("Masukkan Nilai tugas : ");
  Nilai_tugas = scanner.nextInt();

 }
}