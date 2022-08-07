package JavaGunlukCalisma;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adi Giriniz : ");
        username = input.nextLine();

        System.out.print("Sifrenizi Giriniz : ");
        password = input.nextLine();

        if(username.equals("icez") &&  password.equals("1234")){
            System.out.println("Basariyla Giris Yaptiniz");
        }
        else{
            System.out.println("Giris Yapamadiniz Tekrar Deneyin");
        }
    }
}
