package com.example.kotlindersleri.degiskenler

fun main() {
    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasharf = 'A'
    var ogrenciDevamEdiyorMu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyorMu)

    var urun_id : Int = 3416
    var urun_adi : String= "Macbook Pro"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 42999.99
    var urun_tedarikci : String = "Apple"

    println("Ürün Id: $urun_id")
    println("Ürün Adı: $urun_adi")
    println("Ürün Adedi: $urun_adet")
    println("Ürün Fiyatı: $urun_fiyat")
    println("Ürün Tedarikçisi: $urun_tedarikci")

    var a = 10
    var b  = 20

    println("$a x $b = ${a*b}")

    //SABİTLER - CONSTANT
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 40
    println(numara)
    //numara = 80


    //TÜR DÖNÜŞÜMLERİ - TYPE CASTING
    val i = 42
    val d = 78.95

    //Sayısaldan sayısala dönüşüm
    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    //Sayısaldan metine dönüşüm
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)//"42"
    println(sonuc4)//"78.95"

    //Metinden sayısala dönüşüm
    val yazi = "67.54"

    val sonuc5 = yazi.toDouble()
    println(sonuc5)
}