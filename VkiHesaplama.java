package JavaGunlukCalisma;

import java.util.Scanner;

public class VkiHesaplama {
    public static void main(String[] args) {
        double boy;
        int kilo;


        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz : ");
        boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz : ");
        kilo = input.nextInt();

        double vki = kilo /(boy*boy);

        System.out.println("Vucut kitle endeksiniz : " + vki);

    }
}
