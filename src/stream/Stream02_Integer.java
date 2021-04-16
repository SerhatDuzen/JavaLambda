package stream;

import java.util.ArrayList;
import java.util.List;

public class Stream02_Integer {
    public static void main(String[] args) {
        //listedeki tek elemanlarin karesini yazdiran program

        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(12);
        liste.add(15);
        //karesiniYazdir(liste);
        System.out.println(tekKupToplami(liste));

    }
    public static void karesiniYazdir(List<Integer> myList){
        myList.stream().distinct().filter(Stream01_Integer::tekMi).map(i->i*i).forEach(i->System.out.print(i+" "));

    }

    public static Integer tekKupToplami(List<Integer> myList){

        //return myList.stream().filter(Stream01_Integer::tekMi).map(x->x*x*x).reduce(Math::addExact);
        //return  myList.stream().filter(Stream01_Integer::tekMi).map(x->x*x*x).reduce(0,(x,y)->(x+y));

        return myList.stream().filter(Stream01_Integer::tekMi).map(x->x*x*x).reduce(0, Integer::sum);
    }



}
