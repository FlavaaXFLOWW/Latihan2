import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "";

        int choice;
        do {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    input.nextLine(); // consume the newline character
                    System.out.print("Masukkan teks: ");
                    text = input.nextLine();
                    System.out.println("Teks telah dimasukkan!");
                    break;
                case 2:
                    System.out.println("Jumlah karakter dalam teks: " + text.length());
                    break;
                case 3:
                    String[] words = text.split("\\s+");
                    System.out.println("Jumlah kata dalam teks: " + words.length);
                    break;
                case 4:
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String kataDicari = input.next();
                    int count = 0;
                    for (String word : words) {
                        if (word.equalsIgnoreCase(kataDicari)) {
                            count++;
                        }
                    }
                    System.out.println("Kata '" + kataDicari + "' ditemukan sebanyak " + count + " kali dalam teks.");
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 5);
    }
}