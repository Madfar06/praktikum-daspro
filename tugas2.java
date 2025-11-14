import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] namaPesanan;  
        double[] hargaPesanan; 
        double totalBiaya = 0;
        int jumlahPesanan = 0;

        System.out.println("==========================================");
        System.out.println("      PROGRAM KASIR KAFE SEDERHANA");
        System.out.println("==========================================");

        while (true) {
            try {
                System.out.print("Masukkan jumlah item pesanan: ");
                String inputnilai = sc.nextLine(); 
                
                jumlahPesanan = Integer.parseInt(inputnilai);

                if (jumlahPesanan > 0) {
                    break;
                } else {
                    System.out.println("Jumlah pesanan harus lebih dari 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
            }
        }
        
        namaPesanan = new String[jumlahPesanan];
        hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\n--- Memasukkan Pesanan ke-" + (i + 1) + " ---");

            System.out.print("Nama Makanan/Minuman: ");
            namaPesanan[i] = sc.nextLine();

            double harga = -1;
            while (true) {
                try {
                    System.out.print("Harga (contoh: 50000): Rp ");
                    String hargaStr = sc.nextLine();

                    harga = Double.parseDouble(hargaStr);

                    if (harga >= 0) {
                        break; 
                    } else {
                        System.out.println("Harga tidak boleh negatif. Silakan coba lagi.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input harga tidak valid! Harap masukkan angka.");
                }
            }
            
            hargaPesanan[i] = harga;

            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\n========================================");
        System.out.println("           STRUK PESANAN ANDA");
        System.out.println("========================================");

        if (jumlahPesanan > 0) {
            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.printf("%d. %-20s - Rp %,12.2f\n",
                        (i + 1),
                        namaPesanan[i],
                        hargaPesanan[i]);
            }

            System.out.println("----------------------------------------");

            System.out.printf("TOTAL BIAYA:             Rp %,12.2f\n", totalBiaya);
        } else {
            System.out.println("Tidak ada pesanan yang dimasukkan.");
        }

        System.out.println("========================================");
        System.out.println("    Terima kasih atas pesanan Anda!  ");
        System.out.println("========================================");

        sc.close();
    }
}