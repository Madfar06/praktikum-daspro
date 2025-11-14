import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };
        
        Scanner sc = new Scanner(System.in);
        String makananDicari;
        int indeksDitemukan = -1;

        System.out.println("==========================================");
        System.out.println("      APLIKASI PENCARIAN MENU KAFE");
        System.out.println("==========================================");
        
        System.out.println("Daftar Menu Tersedia:");
        for (String item : menu) {
            System.out.println("- " + item);
        }
        System.out.println("------------------------------------------");
        
        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        makananDicari = sc.nextLine();
        String kunciPencarian = makananDicari.toLowerCase();

        System.out.println("\n--- Proses Pencarian (Linear Search) ---");
        
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].toLowerCase().equals(kunciPencarian)) {
                indeksDitemukan = i;
                System.out.println("Ditemukan kecocokan pada indeks array: " + i);
                break;
            }
            System.out.println("Memeriksa item ke-" + (i + 1) + ": " + menu[i] + " (Tidak Cocok)");
        }

        System.out.println("\n==========================================");
        
        if (indeksDitemukan != -1) {
            System.out.println("✅ Menu Ditemukan!");
            System.out.println("Makanan/Minuman '" + menu[indeksDitemukan] + "' tersedia di kafe.");
            System.out.println("Tersedia di posisi menu ke-" + (indeksDitemukan + 1) + ".");
        } else {
            System.out.println("❌ Maaf, menu '" + makananDicari + "' tidak ada dalam daftar kafe.");
        }
        System.out.println("==========================================");
        
        sc.close();
    }
}