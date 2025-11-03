import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double[] nilai = new double[jumlahSiswa];
        double total = 0;

        // Input nilai setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
            total += nilai[i];
        }

        // Hitung rata-rata
        double rataRata = total / jumlahSiswa;

        // Tampilkan hasil
        System.out.println("\n=== HASIL REKAP NILAI ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Nilai siswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}

