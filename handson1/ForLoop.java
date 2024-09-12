package handson1;

public class ForLoop {
    public static void main(String[] args) {
        String[] buah = new String[] {"Aapel", "Pisang", "Mangga", "Jeruk"};
        for (int i = 0; i < 4; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("Elemen ke " + (i + 1) + ": " + buah[i]);
        }
    }
}
