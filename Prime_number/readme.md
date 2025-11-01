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

## ÇIKTI

```
--------- Mismatch found at: 2
--------- Mismatch found at: 3
checking: 1000000
checking: 2000000
...
Completed checking up to 10 million.
```
