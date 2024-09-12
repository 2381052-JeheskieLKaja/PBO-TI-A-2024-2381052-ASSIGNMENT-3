package handson3;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        // While loop dari 1 hingga 20
        while (i <= 20) {
            // Berhenti setelah mencapai angka 15
            if (i == 15) {
                break; // Hentikan loop
            }

            // Lewati angka yang habis dibagi 3
            if (i % 3 == 0) {
                i++;  // Increment i agar tidak terjadi infinite loop
                continue; // Lompat ke iterasi berikutnya
            }

            // Cetak angka yang tidak habis dibagi 3
            System.out.println("Nilai = " + i);
            i++;  // Increment i untuk lanjut ke angka berikutnya
        }
    }
}
