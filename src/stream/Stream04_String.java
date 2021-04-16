package stream;

import functional.Lambda01_Rules;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream04_String {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Jackson");
        liste.add("Amanda");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Alonzo");
        liste.add("Alfonso");
        liste.add("Tucker");
        liste.add("Christ");
        System.out.println("*****************");
        aIleBaslayanlar(liste);
        System.out.println("*****************");
        oIleBitenler(liste);
        System.out.println("*****************");
        siralaVeKucukHarfeCevir(liste);
        System.out.println("*****************");
        uzunlugaGoreBuyutYazdir(liste,4);
        System.out.println("*****************");
        System.out.println("Tum elemanlar belirtilen degerden kucuk = "+uzunlukKucukMu(liste,4));
        System.out.println("*****************");
        System.out.println("Tum elemanlar belirtilen degerle baslamiyo mu = "+baslamayanHarf(liste,"B"));
        System.out.println("*****************");
        System.out.println("Belirtilen kelime var mi = "+herhangiElemanVarMi(liste,"Amanda"));
        System.out.println("*****************");
        aileBaslayipOileBitenYazdir(liste);
        System.out.println("*****************");
uzunluklaraGoreYazdir(liste);
        System.out.println("*****************");

        System.out.println("*****************");
    }

    // buyuk kucuk harf duyari kaldirma
    public static void yazdir(List <String>liste) {
        liste.stream().
                map(String::toLowerCase).
                filter(t->t.startsWith("a")).
                forEach(System.out::println);
    }


    // Ali : 3     Mark : 4      Amanda : 6 vb seklinde yazan method
    public static void uzunluklaraGoreYazdir(List<String> list){
        //list.stream().sorted(Comparator.comparing(String::length)).forEach(i-> System.out.print(i+"="+i.length()+"\t"));
list.stream().sorted(Comparator.comparing(String::length)).map(i->i+" = "+i.length()).forEach(System.out::println);
    }

    //a ile baslayi o ile biten elemanlari yazdiran

    public static void aileBaslayipOileBitenYazdir(List<String> liste){
        liste.stream().filter(i->i.startsWith("A")&&i.endsWith("o")).forEach(System.out::println);
    }


    //listede o eleman var mi?
    public static boolean herhangiElemanVarMi(List<String> list, String harf){
        return list.stream().anyMatch(t->t.equals(harf));
    }


    //listedeki tum elemanlarin belirtilen harf ile baslamadigini kontol eden method
    public static boolean baslamayanHarf(List<String> liste,String harf){
        return liste.stream().noneMatch(t->t.startsWith(harf));
    }


    //listedeki tum elemanlar verilen uzunluktan kucuk mu?
    public static boolean uzunlukKucukMu(List<String> liste, int i) {
        return liste.stream().allMatch(t->t.length()<i);
    }


    //a harfi ile baslayan isimleri yazdiran method
    public static void aIleBaslayanlar(List<String> liste){
        liste.stream().filter(h->h.startsWith("A")).forEach(System.out::println);


    }
    public static void oIleBitenler(List<String> liste){
        liste.stream().filter(x->x.endsWith("o")).distinct().forEach(i-> System.out.println(i));
    }


    //listedeki elemanlari uzunluklarina gore siralayan ve kucuk harfe ceviren method
    public static void siralaVeKucukHarfeCevir(List<String> liste){
       liste.stream().sorted(Comparator.comparing(t->t.length())).map(t->t.toLowerCase()).forEach(System.out::println);
    }


    //listedeki istenenin uzerinde uzunluktaki elemanlari buuk harfe cevir
    public static void uzunlugaGoreBuyutYazdir(List<String> list,int uz){
        list.stream().filter(i->i.length()>uz).map(i->i.toUpperCase()).forEach(System.out::println);
    }

}
