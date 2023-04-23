package lambda_functional_programming;

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
        buyukHarfleYazdir(liste); // ALİ ALİ MARK AMANDA CHRİSTOPHER JACKSON MARİANO ALBERTO TUCKER BENJAMİN
        System.out.println();
        buyukHarfleYazdir02(liste); //
    }

    /*
    1- ) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
     */
    // 1.yol;
    public static void buyukHarfleYazdir(List<String>list){
        list.stream().map(String::toUpperCase).forEach(Utils::aynıSatirdaBosluklaYAzdir);
    }

    // 2.yol;
    // public static void buyukHarfleYazdir02(List<String>list){
    //     list.replaceAll(String::toUpperCase);
    //     System.out.print(list);
    // }


}
