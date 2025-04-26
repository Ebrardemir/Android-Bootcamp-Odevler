package com.example.standart_programlama.nesne_tabanli_programlama.odev2

fun main(){
    val soru= Odev2()
    val sonuc1=soru.soru1(15.0)
    println("Soru1: 15 derece, fahrenheit cinsinden: $sonuc1")

    soru.soru2(10,5)

    val sonuc3=soru.soru3(5)
    println("Soru3: 5 in faktoriyeli : $sonuc3")

    soru.soru4("ebrar")

    val sonuc5=soru.soru5(3)
    println("Soru5: kenar sayısı 3 olan şeklin iç açılar toplamı : $sonuc5")

    val sonuc6=soru.soru6(30)
    println(" Soru6: 30 gün çalışan kişinin maaşı : $sonuc6")

    val sonuc7=soru.soru7(60)
    println("Soru7: 60gb kullanan kişinin fatura ücreti : $sonuc7")
}