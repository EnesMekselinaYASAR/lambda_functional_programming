package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {
        /*
        1- ) t-> "Logic" , (t,u) -> "Logic"
        Bu yapiya "Lambda Expression"
        2- ) Functional Programming kapsaminda "Lambda Expression" kullanilabilir ama onerilmez.
        "Lambda Expression" yerine "FunctionMethod Reference" tercih edilir.
        3- ) "Method Reference" kullanimi "Class Name :: Method Name"
        Ayni zamanda kendi class'larinizi da kullanabilirsiniz.
        Ornegin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
        */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l); // [8, 9, 131, 10, 9, 10, 2, 8]
        listElemanlariniYazdirFunctional(l); // 8 9 131 10 9 10 2 8
        System.out.println("");
        ciftElemanlariYazdirFunctional(l); // 8 10 10 2 8
        System.out.println("");
        tekElemanlarinKareleriniYazdir(l); // 81 17161 81
        System.out.println("");
        tekrarsizTekElemanlarinKupunuYazdir(l);// 729 2248091
        System.out.println("");
        tekrarsizCiftElemanlarinKareToplami01(l);// 168
        System.out.println("");
        tekrarsizCiftElemanlarinKareToplami02(l);// 168
        System.out.println("");
        tekrarsizCiftElemanlarinKareToplami03(l);// 168





    }

    /*
   1- ) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran
   bir method oluşturun.(Functional ve method reference)
   */
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(Utils::aynıSatirdaBosluklaYAzdir);
    }

    /*
    2- )Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak
    yazdıran bir method oluşturun.(Functional)
    */
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::aynıSatirdaBosluklaYAzdir);
    }


    /*
    3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında
    boşluk bırakarak yazdıran bir method oluşturun.(Functional)
     */
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
                list.
                stream().
                filter(Utils::tekElemanlariSec).
                map(Utils::karesiniAl).
                forEach(Utils::aynıSatirdaBosluklaYAzdir);
    }


    /*
   4- ) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda
   aralarında boşluk bırakarak yazdıran bir method oluşturun.
    */
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::aynıSatirdaBosluklaYAzdir);
    }

    /*
    5- ) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
     */
    public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> list){
        Integer toplam=list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
        System.out.print(toplam);
    }

    public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer> list){
        Integer toplam=list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.print(toplam);
    }

    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list){
        Integer toplam=list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
        System.out.print(toplam);
    }
}
