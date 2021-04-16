package functional;

import java.util.Arrays;
import java.util.List;

public class Lambda01_Rules {
    // Javada Lambda fonksiyonları sadece Fonksiyonel interface'ler ile kullanılabilir.
    // Sadece bir adet abstract metodu olan interface'lere fonksiyonel interface denilir.
    // Kullanıcı isterse kendi fonksiyonel interface'ini yazabilir. Ama Javada hali hazırda
    // Consumer, Function, Supplier, Predicate gibi tanımlanmış interfaceler bulunmaktadır.
    // Ayrıca bu interface'leri parametre olarak alabilen High Order Function (HOF)'lar da bulunmaktadır.
    // foreEach(), map(), filter(), reduce() gibi HOF'lar fonksiyonel interfaceler ile çalıştığı için
    // içerisinde Lambda fonksiyonları yazmak mümkündür.
    // Javada genelde bu gibi fonksiyonlar üzerinden Lambda ifadeleri kullanılmaktadır.
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
        liste.forEach((i) -> System.out.print(i));

        // forEach() bir collection'nın iterasyonu için kullanılan HOF'dur.
        // Parametre olarak bir lambda fonksiyonu alabilir.
        // Dizinin Elemanlarını yazdıralım

        //listenin elemanlarini 2 arttirarak yazdiralim

        liste.forEach((a) -> System.out.print(a + 2 + " "));

        //birden fazla satir kullanmak // {} curly brace kullanilmali

        liste.forEach((b) -> {
            int miktar = 2;
            System.out.print(b + miktar + " ");
        });
        System.out.println();
        //Veri tipi kullanilirsa Explicit

        liste.forEach((Integer y) -> System.out.print(y * 2 + " "));

        System.out.println();
        //dis degisken kullanimi // final degisken olarak davranir
        //dongu icerisinde degistirilemez


        int deger = 5;
        liste.forEach(u -> System.out.print(u * deger + " "));

        //method referansi kullanimi = Class_adi :: Metot_adi

        liste.forEach(System.out::println);

        //kendi olusturdugumuz methodun kullanimi

        liste.forEach(Lambda01_Rules::yazdir);
    }

    public static void yazdir(int x) {
        System.out.print(x + "   ");
    }
}





