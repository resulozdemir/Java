import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        double harm = 0, unit = 0;

        System.out.println("Sayi giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++){
            unit = (1.0 / i);
            harm += unit;
        }

        System.out.println(harm);
    }
}
