package handson3;

public class ForLoop {
    public static void main(String[] args) {
        // Deklarasi array angka dari 1 hingga 20
        int[] angka = new int[20];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = i + 1; // Isi array dengan angka 1 sampai 20
        }

        // Loop dari 1 hingga 20
        for (int i = 0; i < 20; i++) {
            // Lewati angka yang habis dibagi 3 kecuali 15
            if (angka[i] % 3 == 0 && angka[i] != 15) {
                continue;
            }
            // Berhenti setelah mencapai angka 15
            if (angka[i] == 15) {
                break;
            }
            // Tampilkan angka
            System.out.println("Angka ke-" + i + ": " + angka[i]);
        }
    }
}
