package JavaGunlukCalisma;

import java.util.Scanner;

public class BuyuktenKucugeSayiSiralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayiyi Giriniz : ");
        a = input.nextInt();

        System.out.print("2.Sayiyi Giriniz : ");
        b = input.nextInt();

        System.out.print("3.Sayiyi Giriniz : ");
        c = input.nextInt();

        if ((a > b) && (a > c)){
            if (b>c){
                System.out.println("a>b>c");
            }
            else {
                System.out.println("a>c>b");
            }
        }
        if((b>a) && (b>c)){
            if (c>a){
                System.out.println("b>c>a");
            }
            else {
                System.out.println("b>a>c");
            }
        }
        if ((c > a) && (c > b)){
            if (b>a){
                System.out.println("c>b>a");
            }
            else {
                System.out.println("c>a>b");
            }
        }
    }
}
