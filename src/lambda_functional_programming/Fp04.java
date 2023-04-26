package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {

        System.out.println(get7den100eToplam01()); // 5029
        System.out.println(get7den100eToplam02()); // 5029
        System.out.println(get2den11eCarpim()); // 39916800



    }
    /*
    1- ) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
     */
    // 1.yol;
    public static int get7den100eToplam01(){
        return IntStream.range(7,101).reduce(Math::addExact).getAsInt();
    }
    // 2.yol;
    public static int get7den100eToplam02(){
        return IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
    }

        /*
        ==> range yaptigimizda son rakdamdan bir fazlasini yazmamiz gerekiyor cunku
            yazdigimiz son degeri almadan calisiyor
        ==> fakat rangeClosed kullandigimizda son rakami da dahil ediyor, o yuzden
            bir fazlasini yazmamiza gerek kalmiyor.
         */

    /*
    2- ) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
     */
    public static int get2den11eCarpim(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }

    /*
    3- ) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun.
         (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
     */
    public static int faktoriyelHesapla(int x)

}
