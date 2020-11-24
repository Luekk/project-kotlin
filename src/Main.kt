import java.util.*
import java.lang.*

fun main(args: Array<String>){
    println("Witaj w moim programie! Kliknij enter aby przejść dalej!")
    readLine()
    wizytowka()
    tabliczki()
}
fun wizytowka(){
    println("Chcesz mnie poznac? (y/n)")
    val stringInput = readLine()
    if(stringInput == "y"){
        println("-------------------Moja wizytówka-------------------")
        println("Imie: Lukasz")
        println("Nazwisko: Pawiński")
        println("Adres zamieszkania: Kęty")
        println("Numer telefonu: 123 123 123 ")
        println("----------------------------------------------------")
    }
    if(stringInput == "n"){
        println("Czy chcesz stworzyc swoją wizytówkę? (y/n)")
        val stringInput2 = readLine()
        if(stringInput2 == "y"){
            println("Wpisz swoje imie: ")
            val name = readLine()
            println("Wpisz swoje nazwisko: ")
            val surname = readLine()
            println("Wpisz swoje miejsce zamieszkania:")
            val address = readLine()
            println("Wpisz swoj numer telefonu: ")
            val phone = readLine()
            println("---------------OTO TWOJA WIZYTÓWKA---------------")
            println("Imie: $name")
            println("Nazwisko: $surname")
            println("Miejsce zamieszkania: $address")
            println("Numer telefonu: $phone")
            println("-------------------------------------------------")

        } else {
            println("Szkoda ale no cóż... Możesz zawsze sprawdzić co czeka Cię dalej ;)")
        }
    }
}
fun tabliczki(){
    println("-------Tablice-------")
    var tabSum = 0
    var tabSum2 = 0
    val table = arrayOf(1,2,3,4,5)
    val table2 = listOf(9,8,7,4,2)

    println("Mamy dwie tablice ${table.asList()} $table2")

    println("Co chciałbyś zrobić? Mnożyć dzielić a może odejmować i dodawać?")
    readLine()
    println("Wpisz znak + - * lub / aby wykonać działanie na tablicach")
    val znak = readLine()
    if(znak == "+") {
        for (i in 0..table.size - 1) {
            println("${table[i]+table2[i]} to suma ${i+1} elementu tablic")
        }
    }
    if(znak == "-") {
        for (i in 0..table.size - 1) {
            println("${table[i]-table2[i]} to różnica ${i+1} elementu tablic")
        }
    }
    if(znak == "*") {
        for (i in 0..table.size - 1) {
            println("${table[i]*table2[i]} to iloczyn ${i + 1} elementu tablic")
        }
    }
    if(znak == "/") {
        for (i in 0..table.size - 1) {
            println("${table[i]/table2[i]} to iloraz ${i+1} elementu tablic")
        }
    }
    println("A może by tak zsumować całe tablice?")
    for(i in 0..table.size - 1){
        tabSum += table[i]
    }
    for(i in 0..table.size - 1){
        tabSum2 += table2[i]
    }
    println(tabSum+tabSum2)
}
