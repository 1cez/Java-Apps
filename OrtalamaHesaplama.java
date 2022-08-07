package JavaGunlukCalisma;

import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.println("Turkce Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.println("Muzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama <= 55){
            System.out.println("Sinifi Gecemediniz ortalamaniz 55 altinda.");

        }
        else {
            System.out.println("Sinifi Gectiniz.");

        }
        System.out.println("Ortalamaniz : " + ortalama);
    }
}
