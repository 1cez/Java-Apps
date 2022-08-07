package JavaGunlukCalisma;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double
                armutKilo = 2.14,
                elmaKilo = 3.67,
                domatesKilo = 1.11,
                muzKilo = 0.95,
                patlicanKilo = 5.00,
                armutMiktari,elmaMiktari,domatesMiktari,muzMiktari,patlicanMiktari;

        Scanner input = new Scanner(System.in);

        System.out.print("Kac kilo armut aldiniz : ");
        armutMiktari = input.nextDouble();
        System.out.print("Kac kilo elma aldiniz : ");
        elmaMiktari = input.nextDouble();
        System.out.print("Kac kilo domates aldiniz : ");
        domatesMiktari = input.nextDouble();
        System.out.print("Kac kilo muz aldiniz : ");
        muzMiktari = input.nextDouble();
        System.out.print("Kac kilo patlican aldiniz : ");
        patlicanMiktari = input.nextDouble();

        double toplamFiyat = (armutKilo * armutMiktari) + (elmaKilo * elmaMiktari) + (domatesKilo * domatesMiktari) +
                (muzKilo * muzMiktari) + (patlicanKilo * patlicanMiktari);

        System.out.println("Toplam Fiyat : " + toplamFiyat);

    }
}
