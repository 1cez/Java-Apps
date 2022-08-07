package JavaGunlukCalisma;

public class JavaCalisma {
    public static void main(String[] args) {
     /*   String isim = "Serhan Cetin";
        System.out.print("Selam Dunya : ");
        System.out.println(isim);

        int sayi = 15;

        System.out.println(sayi >= 15);

        final int degismeyenSayi = 25;  //  final ile birlikte degisken tanimlayici atarsak degiskeni degistiremeyiz.
        //  degismeyenSayi = 35;    Bu error verir.

        //  Degiskeni string ile birliket yazdirma
        System.out.println("Selamlar Benim Adim : " + isim);

        // X ve Y degiskenlerini Z'ye ekleme

        int x=5,y=9;
        int z = x + y;

        System.out.println(z);

        //  3 Farkli degiskeni toplayip yazdirma

        int sayi1 = 15, sayi2=25, sayi3=35;

        System.out.println(sayi1+sayi2+sayi3);

        *//**
         * Veri türleri iki gruba ayrılır:
         *
         * İlkel veri türleri - şunları içerir byte, short, int, long, float, doublevebooleanchar
         * İlkel olmayan veri türleri - örneğin String, Diziler ve Sınıflar (bunlar hakkında daha sonraki bir bölümde daha fazla bilgi edineceksiniz)
         *//*

        //  Double veya float degisken tanimlamalarinda ornegin 43E5d eklersek 4300000 seklinde bir sonuc aliriz

        double doubleSayi = 43E5d;
        System.out.println(doubleSayi);

        //  char veritipinde eger sayi yazar isek bize harf olarak ASCII karsiligini verir

        char charSayi = 65;
        System.out.println(charSayi);

        *//**
         *
         * Java'da iki tür döküm vardır:
         *
         * Genişletme Dökümü (otomatik olarak) - daha küçük bir yazı tipini daha büyük bir yazı tipi boyutuna dönüştürme
         * byte-> short-> char-> int-> long-> float->double
         *
         * Daraltma Döküm (manuel) - daha büyük bir türü daha küçük boyutlu bir türe dönüştürme
         * double-> float-> -> - long> int-> char-> short->byte
         *
         *//*

        //  Yuksek degerli bir degiskeni floattan byteye ceviremessin ama floattan doubleye cevirebilirsin

        float sayix = 15f;
        double sayiy = sayix;

        System.out.println(sayiy);

        //  Degisken turu degistirme islemi boyle yapilmalidir.

        int sayiInt = 25;
        float sayiFloat = (int) sayiInt;

        System.out.println(sayiFloat);
*/

        /**
         * Java, operatörleri aşağıdaki gruplara ayırır:
         *
         * Aritmetik operatörler
         * atama operatörleri
         * Karşılaştırma operatörleri
         * Mantıksal operatörler
         * bitsel operatörler
         */
        //  Aritmatik operatorler ornekleri
/*        + Toplama
          - Cikarma
          * Carpma
          / Bolme
          % Kalanini alma*/

        //  Atama operatorleri
            /*     =x = 5 x = 5
                += x += 3 x = x + 3
                -= x -= 3 x = x - 3
                *= x *= 3 x = x * 3

                /= x /= 3 x = x / 3

                %= x %= 3 x = x % 3
                &= x &= 3 x = x & 3
                |= x |= 3 x = x | 3
                ^= x ^= 3 x = x ^ 3
                >>= x >>= 3 x = x >> 3
                <<= x <<= 3 x = x << 3*/

        //  Karsilastirma Operatorleri
            /*    ==	Equal to	x == y
                !=	Not equal	x != y
                >	Greater than	x > y
                <	Less than	x < y
                >=	Greater than or equal to	x >= y
                <=	Less than or equal to	x <= y*/


      /*  //  Mantiksal Operatorler

        && //   Ve anlamina gelir
        ||  // veya,yada anlamina gelir
        !   //  Degilse anlamina gelir*/


        /*int sayi1 = 15, sayi2 = 25, sayi3 = 35;
        int sonuc = sayi1 + sayi2 + sayi3;

        System.out.println(sonuc);
*/

/*
        Lenght ile String uzunlugunu alma
*/

       /* String txt = "Bu bir yazidir";

        System.out.println("Bu degiskenin uzunlugu : " + txt.length());*/

        //  Yazilanlari tamamen buyuk harfe veya kucuk harfe cevirme

       /* String yaziBuyuk = "bu bir yazidir";

        System.out.println(yaziBuyuk.toUpperCase()); //  Harfleri buyutme

        String yaziKucuk = "BU BIR YAZIDIR";
        System.out.println(yaziKucuk.toLowerCase());*/

        /*//  Bulundugu index degerini alir
        String yaziSec = "Bu Bir Yazidir ve yazilara 'kursun' islemez";

        System.out.println(yaziSec.indexOf("k"));*/


        //  Iki degiskeni yazarken arasina bosluk koymak icin " " ici bos bi deger atayabiliriz

       /* String name = "Serhan ";
        String lastName = "Cetin";

        System.out.println(name + " " + lastName);

        //  Yada birlestirme islemini concat ile birlikte yapabilirsin

        System.out.println(name.concat(lastName));*/


        //  Girilen parametrede en buyuk sayiyi almak icin
/*
        System.out.println(Math.max(15,73));

        //  Girilen parametrede en dusuk sayiyi almak icin

        System.out.print(Math.min(25,5));

        //  Karekokunu almak icin
        int sayi = 25;
        System.out.println(Math.sqrt(sayi));

        //  Mutlak pozitif degerini dondurur
        System.out.println(Math.abs(-4.7));

        //  Rastgele sayi uretmeye yarar. Eger yildiz koyarsak yazdigimiz sayiyla 0 arasinda deger dondurur

        System.out.println(Math.random() * 100);*/

        //  Boolean ifadesi sadece true yada false deger dondurur genelde test etmeye yarar
       /* int sayi =15, sayi2=25;
        System.out.println(sayi > sayi2);*/

        //  if else kullanimi

        /*if(19 > 20) {
            System.out.println("X Buyuktur");

        }
        //  Eger baska bir KOSUL daha eklemek ister isek
        else if(19==20){
            System.out.println("Deger giriniz");
        }
        else {
            System.out.println("Y Buyuktur");
        }*/

        //  Ternary Operators
        //  Tek satirda if else yazmaya yarar

        /*int sayi = 10;

        String result = (sayi > 15) ? "15 Ten Buyuktur" : "15 ten kucuktur";
        System.out.println(result);*/

        //  Switch Case yapisi 2 den fazla kosulumuz var ise genelde switch case tercih edilir
        //  Tum caseler gecersiz ise defaultun calistirir
        /*int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }*/
// Outputs "Thursday" (day 4)


        //  While dongusu kullanimi

        /*int sayi = 0;*/
/*
        while (sayi <= 5){
            System.out.println(sayi);
            ++sayi;
        };*/

        //  Do while dongusu

       // Döngü ,
        // do/while döngünün bir çeşididir while. Bu döngü, koşulun doğru olup olmadığını kontrol etmeden önce kod bloğunu bir kez çalıştırır, ardından koşul doğru olduğu sürece döngüyü tekrarlar.

       /* do {
            // Kod burda calisacak
        }
        while (kosul);*/

        /*int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);*/


        //  1 den 10 a kadar sayilari yazdirma dongusu


       /* for (int i = 0; i<=10; i++){
            System.out.println(i);

        }*/

        //  4 Ve katlari ile ilerleyen dongu
        /*for (int i = 0; i<=50; i = i+4){
            System.out.println(i);
        }*/

        //  Dizi olusturma

/*        String[] meyveler = {"Elma", "Armut", "Cilek", "Muz"};*/

        //  Dizileri yazdirmamizi saglayan for dongusu
/*

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }*/
/*
        String[] meyveler = {"Elma", "Armut", "Cilek", "Muz"};

        for(String i : meyveler){
            System.out.println(i);
        }*/


        //  Donguyu kirip belli bi sayida durmak icin if icinde break kullandik
        /*for (int i = 0; i < 10; i++) {
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }*/

        /*for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);
        }*/

        //  3 Tane Farkli Turde Dizi olusturalim

        /*int[] sayilar = {15,25,30};

        String[] isimler = {"Serhan","Cetin","Mert"};

        boolean[] trueOrFalse = {true,false};

        *//*
        for (int i : sayilar){
            System.out.print(i + " ");
        }*//*

        for(String i : isimler){
            System.out.print(i + " ");
        }*/

        //  Olusturdumuz diziden bir degere ulasma

        /*String[] cars = {"Volvo","BMW","Mercedes-Benz"};

        System.out.println(cars[2]);*/

        //  Olusturulan dizideki degeri degistirme

        /*String[] cars = {"Mercedes-Benz","BMW","Volvo"};

        cars[0] = "Opel";

        System.out.println(cars[3]);

*/


        //  Dizide kac eleman oldugunu ogrenme

        /*String[] cars = {"Mercedes-Benz","BMW","Volvo"};

        System.out.println(cars.length);
*/


        //  Aşağıdaki örnek, arabalar dizisindeki tüm öğelerin çıktısını verir:

        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }*/


        //  Ayrıca, yalnızca dizilerdeki öğeler arasında dolaşmak için kullanılan bir " for-each " döngüsü de vardır:

       /* String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }*/


        //  Çok boyutlu bir dizi, bir dizi dizisidir.
        //İki boyutlu bir dizi oluşturmak için her diziyi kendi küme parantezleri içine ekleyin :

/*
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
*/

        //  myNumbers artık öğeleri olarak iki dizi içeren bir dizidir.
        //
        //myNumbers dizisinin öğelerine erişmek için iki dizin belirtin: biri dizi için, biri de o dizinin içindeki öğe için.
        // Bu örnek, myNumbers'ın ikinci dizisindeki (1) üçüncü öğeye (2) erişir:

       /* int x = myNumbers[1] [2];

        System.out.println(x);*/

        //  İki boyutlu bir dizinin öğelerini elde etmek için bir for loopiç diğerini de kullanabiliriz
        //  (yine de iki dizini işaret etmemiz gerekiyor):for loop

       /* int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }*/


    }
}
