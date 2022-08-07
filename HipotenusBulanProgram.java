package JavaGunlukCalisma;

import java.util.Scanner;

public class HipotenusBulanProgram {
    public static void main(String[] args) {
        //  Dik Ucgende Hipotenus bulan Program
        //  Java ile kullanicidan dik kenarlarinin uzunlugunu alan ve hipotenusu hesaplayan programi yazin.\

        int a,b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenari Giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenari Giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*b) + (b*b));
        System.out.println("Hipotenus  : " + c);




    }
}
