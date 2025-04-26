package com.example.standart_programlama.nesne_tabanli_programlama.odev2

class Odev2 {
    fun soru1(derece:Double):Double{
        return derece*1.8+32;
    }

    fun soru2(kenar1:Int,kenar2:Int){
        val cevre= (kenar1+kenar2)*2
        println("$kenar1 ve $kenar2 kenarlarına sahip dikdörtgenin çevresi: $cevre")
    }

    fun soru3(sayi:Int):Int{
        var sonuc=1
        for (i in 1..sayi){
            sonuc*=i;
        }
        return sonuc
    }

    fun soru4(kelime:String){
        var sayac=0
        for(i in 0 until kelime.length){
            if(kelime[i]=='a'){
                sayac++
            }
        }
        println("$kelime içinde $sayac tane a harfi var.")
    }

    fun soru5(kenarSayisi :Int):Int{
        return (kenarSayisi-2)*180
    }

    fun soru6(gun: Int): Int {
        val toplamSaat = gun * 8
        return if (toplamSaat <= 160) {
            toplamSaat * 10
        } else {
            val mesaiSaati = toplamSaat - 160
            (160 * 10) + (mesaiSaati * 20)
        }
    }

    fun soru7(kotaMiktari:Int):Int{
        if (kotaMiktari<=50)
            return 100
        else{
            val kotaAsim=kotaMiktari-50
            return 100+kotaAsim*4
        }
    }

}