package lambda_functional_programming;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        buyukHarfleYazdir01(liste); // ALİ ALİ MARK AMANDA CHRİSTOPHER JACKSON MARİANO ALBERTO TUCKER BENJAMİN
        System.out.println();
        uzunlugaGoreYazdir(liste); // Ali Ali Mark Amanda Tucker Jackson Mariano Alberto Benjamin Christopher


    }

    /*
    1- ) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
     */
    // 1.yol;
    public static void buyukHarfleYazdir01(List<String>list){
        list.stream().map(String::toUpperCase).forEach(Utils::aynıSatirdaBosluklaYAzdir);
    }

     /*
     // 2.yol;
     public static void buyukHarfleYazdir02(List<String>list){
         list.replaceAll(String::toUpperCase);
         System.out.print(list);
     }
    Listemiz mutable oldugu icin yorum satirina aldik. Bu method listemizi degistirdi.
    */

    /*
   2- ) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    */
    public static void uzunlugaGoreYazdir(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::aynıSatirdaBosluklaYAzdir);
        // Comparator.comparing(); --> siralama kosulunu belirtmek icin kullanilir

    }


}
