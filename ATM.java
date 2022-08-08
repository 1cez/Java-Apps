package Week4Bootcamp;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanici Adi Giriniz : ");
            userName = input.nextLine();

            System.out.print("Sifrenizi Giriniz : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("1234")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz.");
                do {

                    System.out.println("1- Para Yatirma \n" +
                            "2- Para Cekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Cikis yap");
                            System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz : ");
                    select = input.nextInt();

                    if (select == 1) {
                        System.out.println("Para Miktari : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Para Miktari : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye Yetersiz");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                }
                while (select != 4);
                System.out.println("Tekrar Gorusmek Uzere");
                break;
            } else {
                System.out.println("Hatali kullanici adi veya sifre. Tekrar Deneyiniz.");

                System.out.println("Kalan Hakkiniz : " + --right);

                if (right == 0) {
                    System.out.println("Hesabiniz Bloke Olmustur. Lutfen banka ile iletisime geciniz.");
                }
            }
        }


    }
}
