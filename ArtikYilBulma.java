package JavaGunlukCalisma;

import java.util.Scanner;
public class ArtikYilBulma {

            public static void main(String[] args) {
                boolean aYear = false;
                int yil;

                Scanner input = new Scanner(System.in);
                System.out.print("Lütfen yıl giriniz: ");
                yil = input.nextInt();

                if (yil % 4 == 0) {
                    if (yil % 100 == 0) {
                        if (yil % 400 == 0){
                            aYear = true;
                        }else{
                            aYear = false;
                        }
                    }else {
                        aYear = true;
                    }
                } else{
                    aYear = false;
                }

                if (aYear){
                    System.out.println(yil + " yılı bir artık yıldır !");
                }else{
                    System.out.println(yil + " yılı bir artık yıl değildir !");
                }
            }
}
