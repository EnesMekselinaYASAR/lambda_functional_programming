package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {

        /*
      1- ) Lambda (Functional Programming) Java 8 ile kullanilmaya baslamistir.

      2- ) Functional Programming'de "Ne yapilacak" (What to do) üzerine yogunlaşılır.
           Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğunlaşılır.

      3- ) Functional Programming Arrays ve Collections ile kullanilir.

      4- ) "entryset() methods ile Map, Set'e dönüştürülerek Functional Programming'de
            kullanilir.
       */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste); // [8, 9, 131, 10, 9, 10, 2, 8]
        listElamanlariniYazdirStructure(liste);
        System.out.println("");
        listElamanlariniYazdirFunctional(liste);
        System.out.println("");
        ciftElemanlariYazdirStructure(liste);
        System.out.println("");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println("");
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println("");
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println("");
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println("");
        tekrarsizCiftElamanlarinKupleriCarpimi(liste);
        System.out.println("");
        getMaxEleman(liste);

    }
        /*
        1- ) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak
        yazdıran bir method oluşturun.(Structured)
         */

    public static void listElamanlariniYazdirStructure(List<Integer> list) {

        for (Integer w : list) {

            System.out.print(w + " "); // 8 9 131 10 9 10 2 8

        }
    }

    /*
    1- ) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak
    yazdıran bir method oluşturun.(Functional)
     */
    public static void listElamanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " ")); // 8 9 131 10 9 10 2 8

            /*
        --> stream() method collection'dan elementleri akışa dahil etmek için ve
            methodlara ulaşmak için kullanilir.
         */
    }

    /*
    2- )Cift list elemanlarini aynı satırda aralarında boşluk bırakarak
    yazdıran bir method oluşturun.(Structured)
    */
    public static void ciftElemanlariYazdirStructure(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " "); // 8 10 10 2 8
            }
        }
    }

    /*
    2- )Cift list elemanlarini aynı satırda aralarında boşluk bırakarak
    yazdıran bir method oluşturun.(Funcional)
    */
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " ")); // 8 10 10 2 8
    }
    /*
    3- ) Ardışık tek list elementlerinin karelerini aynı
    satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    */

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" ")); // 81 17161 81
        // elemanlarin degerleri degisecekse map() methodu kullanilir.
    }

    /*
    4- ) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı
    satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
     */

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer>list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" ")); // 729 2248091
    }

     /*
    5- ) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method
    oluşturun.
     */

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){
        Integer toplam=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.print(toplam); // 168
    }

     /*
    6- ) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
     */

    public static void tekrarsizCiftElamanlarinKupleriCarpimi(List<Integer>list){
        Integer carpim=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.print(carpim); // 4096000
    }

    /*
    7- ) List elemanları arasından en büyük değeri bulan bir method oluşturun.
     */

    public static void getMaxEleman(List<Integer>list){
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t :u);
        System.out.print(max); // 131
    }



}
