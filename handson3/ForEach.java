package handson3;

public class ForEach {
    public static void main(String[] args) {
        // Membuat array dari angka 1 hingga 20
        int[] himpunanBilangan = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // Menggunakan for-each loop untuk iterasi
        for (int satuanBilangan : himpunanBilangan) {
            // Lewati angka yang habis dibagi 3 kecuali 15
            if (satuanBilangan % 3 == 0 && satuanBilangan != 15) {
                continue; // Berfungsi seperti "continue"
            }

            // Tampilkan angka
            System.out.println("Nilai satuan bilangan = " + satuanBilangan);

            // Berhenti setelah mencapai angka 15
            if (satuanBilangan == 15) {
                break; // Menghentikan loop
            }
        }
    }
}

