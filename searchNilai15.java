import java.util.Scanner;

public class searchNilai15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahElemen = sc.nextInt();

        int[] arrNilai = new int[jumlahElemen];
        
        int hasilIndeks = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasilIndeks = i; 
                break;
            }
        }

        if (hasilIndeks != -1) {
            int posisiKe = hasilIndeks + 1; 
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + posisiKe);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
        
        sc.close();
    }
}