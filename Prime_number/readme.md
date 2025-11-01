# ASAL SAYI KONTROLÜ - İKİ YÖNTEMİN KARŞILAŞTIRILMASI

> |            |                                       |
> | ---------- | ------------------------------------- |
> | *author*   | [Mefamex](https://github.com/mefamex) |
> | *date*     | 2025-11-01                            |
> | *java*     | V-21.0.8                              |

<br><br>

Bu doküman, verilen bir sayının asal olup olmadığını kontrol eden iki farklı yöntemi karşılaştıran bir Java programını açıklamaktadır. Program, 0'dan 10 milyon'a kadar olan sayılar için her iki yöntemi de kullanarak sonuçları karşılaştırır ve herhangi bir uyuşmazlık durumunda bunu bildirir.

<br>

## Yöntemler

1. **Basit Asal Kontrol**: Bu yöntem, sayının 2'den başlayarak kareköküne kadar olan tüm sayılarla tam bölünüp bölünmediğini kontrol eder.
2. **6n +/- 1 Kuralı**: Bu daha optimize yöntem, asal sayıları kontrol etmek için 6n +/- 1 kuralını kullanır. Bu kural, asal sayıların 6'nın katları etrafında yoğunlaştığını gözlemleyerek daha az sayıda bölme işlemi yapar.

<br>

## Kullanım

1. Java'nın kurulu olduğundan emin olun.
2. `Prime_check_6n.java` dosyasını bir Java IDE'sinde veya terminalde çalıştırın.
3. Program, 0'dan 10 milyon'a kadar olan sayılar için her iki yöntemi karşılaştırır ve uyuşmazlıkları bildirir.

<br>

### Terminalden Çalıştırma

```bash
javac Prime_check_6n.java
java App
```

<br>

## 6n +/- 1 Kuralı ile Asal Sayı Kontrolü

Bu Java programında, bir sayının asal olup olmadığını kontrol etmek için iki farklı yöntem karşılaştırılmıştır. <br> 
Bunlardan biri klasik yöntem, diğeri ise **6n +/- 1 kuralı** kullanılarak yapılan daha optimize bir yöntemdir.

### 6n +/- 1 Kuralı Nedir?
Bu yöntem, asal sayıların 6'nın katlarına yakın bir formda olduğunu varsayar. Yani, bir asal sayı 6n - 1 veya 6n + 1 formunda olabilir (n bir tam sayı olmak üzere). Bu yöntemle asal sayı kontrolü şu şekilde yapılır:

1. Sayı 2 veya 3'e tam bölünüyorsa asal değildir.
2. Sayının kareköküne kadar olan değerler arasında, 6n - 1 ve 6n + 1 formundaki sayılarla bölünebilirlik kontrol edilir.

### Kodda Kullanımı
```java
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
```

Bu yöntem, özellikle büyük sayılar için daha hızlı bir kontrol sağlar. Ancak, 2 ve 3 sayıları bu yöntemde özel olarak ele alınmadığı için bu sayılar asal olarak kabul edilmez.

<br>

## ÇIKTI

```
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
```
