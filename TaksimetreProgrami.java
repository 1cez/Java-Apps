package JavaGunlukCalisma;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20,total, startPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM olarak giriniz : ");
        km = input.nextInt();
        total = (km * perKm);

        total += startPrice;

        System.out.println(total);



    }
}
