package handson3;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        // Loop menggunakan while untuk iterasi dari 1 hingga 20
        while (i <= 20) {
            // Lewati angka yang habis dibagi 3
            if (i % 3 == 0 && i != 15) {
                i++; // Pastikan menambah nilai i untuk menghindari infinite loop
                continue; // Lompat ke iterasi berikutnya
            }

            // Tampilkan angka
            System.out.println("Nilai : " + i);

            // Berhenti setelah mencapai angka 15
            if (i == 15) {
                break; // Menghentikan loop
            }

            i++; // Tambahkan nilai i setiap iterasi
        }
    }
}
