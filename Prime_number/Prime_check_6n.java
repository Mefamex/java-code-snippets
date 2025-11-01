/*
@mefamex
Java version: 21.0.8
01.11.2025


        ASAL SAYI KONTROLU - İKİ YÖNTEMİN KARŞILAŞTIRILMASI

Bu program, verilen bir sayının asal olup olmadığını
    kontrol eden iki farklı yöntemi karşılaştırır.

İlk yöntem, basit bir asal sayı kontrolü yaparken,
    ikinci yöntem 6n +/- 1 kuralını kullanarak daha optimize bir kontrol gerçekleştirir.

Program, 0'dan 10 milyon'a kadar olan sayılar için her iki yöntemi de kullanarak 
    sonuçları karşılaştırır ve herhangi bir uyuşmazlık durumunda bunu bildirir.

Eğer her iki yöntem de aynı sonucu verirse, program sessizce ilerler ve 
    belirli aralıklarla ilerleme durumunu konsola yazdırır.

Bu sayede, her iki algoritmanın doğruluğu ve tutarlılığı test edilmiş olur.

Sonuç : Her iki yöntem de aynı sonucu verir ve uyuşmazlık sadece 2 ve 3 sayılarında 
    ortaya çıkar çünkü ikinci yöntem bu sayıları asal olarak kabul etmez.

 */

public class Prime_check_6n {

    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 10000000; i++) {
            if (i % 1000000 == 0) {
                System.out.println("checking: " + i);
            }
            if (PrimeCheck(i) != PrimeCheckWith6n(i)) {
                System.out.println("--------- Mismatch found at: " + i);
            }
        }
        System.out.println("Completed checking up to 10 million.");
    }

    public static boolean PrimeCheck(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 6n +/- 1 ile asal sayi kontrolü
    public static boolean PrimeCheckWith6n(int number) {
        if (number <= 1 || number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int limit = (int) Math.sqrt(number);
        for (int i = 5; i <= limit; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
        OUTPUT

--------- Mismatch found at: 2
--------- Mismatch found at: 3
checking: 1000000
checking: 2000000
checking: 3000000
checking: 4000000
checking: 5000000
checking: 6000000
checking: 7000000
checking: 8000000
checking: 9000000
Completed checking up to 10 million.

*/
