package JavaGunlukCalisma;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogumTarihi,kalan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Tarihinizi Giriniz : ");
        dogumTarihi = input.nextInt();

        kalan = dogumTarihi % 12;

        if (kalan == 0){
            System.out.println("Cin zodyagi burcunuz : Maymun");
        }
        if (kalan == 1){
            System.out.println("Cin zodyagi burcunuz : Horoz");
        }
        if (kalan == 2){
            System.out.println("Cin zodyagi burcunuz : Kopek");
        }
        if (kalan == 3){
            System.out.println("Cin zodyagi burcunuz : Domuz");
        }
        if (kalan == 4){
            System.out.println("Cin zodyagi burcunuz : Fare");
        }
        if (kalan == 5){
            System.out.println("Cin zodyagi burcunuz : Okuz");
        }
        if (kalan == 6){
            System.out.println("Cin zodyagi burcunuz : Kaplan");
        }
        if (kalan == 7){
            System.out.println("Cin zodyagi burcunuz : Tavsan");
        }
        if (kalan == 8){
            System.out.println("Cin zodyagi burcunuz : Ejderha");
        }
        if (kalan == 9){
            System.out.println("Cin zodyagi burcunuz : Yilan");
        }
        if (kalan == 10){
            System.out.println("Cin zodyagi burcunuz : At");
        }
        if (kalan == 11){
            System.out.println("Cin zodyagi burcunuz : Koyun");
        }

    }
}
