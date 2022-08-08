package JavaGunlukCalisma;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogumTarihi,kalan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Tarihinizi Giriniz : ");
        dogumTarihi = input.nextInt();

        kalan = dogumTarihi % 12;
        switch (kalan){
            case 0:
                System.out.println("Cin zodyagi burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Cin zodyagi burcunuz : Horoz");;
                break;
            case 2:
                System.out.println("Cin zodyagi burcunuz : Kopek");
                break;
            case 3:
                System.out.println("Cin zodyagi burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Cin zodyagi burcunuz : Fare");
                break;
            case 5:
                System.out.println("Cin zodyagi burcunuz : Okuz");
                break;
            case 6:
                System.out.println("Cin zodyagi burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Cin zodyagi burcunuz : Tavsan");
                break;
            case 8:
                System.out.println("Cin zodyagi burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Cin zodyagi burcunuz : Yilan");
                break;
            case 10:
                System.out.println("Cin zodyagi burcunuz : At");
                break;
            case 11:
                System.out.println("Cin zodyagi burcunuz : Koyun");
                break;
            default:
                System.out.println("Gecerli Bir Sayi Giriniz");
                break;
        }


    }
}
