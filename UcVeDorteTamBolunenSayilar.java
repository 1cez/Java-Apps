package Week4Bootcamp;

import java.util.Scanner;

public class UcVeDorteTamBolunenSayilar {

    public static void main(String[] args) {

        int kDeger, adet = 0, toplam = 0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Deger Giriniz : ");
        kDeger = input.nextInt();

        for (int i = 0; i < kDeger; i++){
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                adet++;
            }
        }
        ortalama = toplam/(adet-1);
        System.out.print("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması  :"+ortalama);
    }
}
