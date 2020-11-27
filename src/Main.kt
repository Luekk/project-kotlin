import java.util.*

fun main(args: Array<String>){
    println("Witaj w moim programie! Kliknij enter aby przejść dalej!")
    readLine()
    wizytowka()
    println("Program o tablicach! Kliknij enter aby kontynuować!")
    readLine()
    tablice()
    petle()
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
fun tablice(){
    println("-------Tablice-------")
    var tabSum = 0
    var tabSum2 = 0
    val table = arrayOf(1,2,3,4,5)
    val table2 = listOf(9,8,7,4,2,5,6)
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
    println("------------------------------------")
    println()
    println("A może by tak zsumować całe tablice?")
    for(i in 0..table.size - 1){
        tabSum += table[i]
    }
    for(i in 0..table2.size - 1){
        tabSum2 += table2[i]
    }
    println("Suma wszystkich elementów obydwóch tablic: ${tabSum+tabSum2}")
    println()
    println("------------------------------------")
    val scansum = Scanner(System.`in`)
    var scanningsum: Boolean? = true
    println()
    println("W sumie może chcesz zobaczyc pojedyncze sumy tablic?(true/false)")
    scanningsum = scansum.nextBoolean()
    if(scanningsum == true){
        println("Które tablice chcesz zobaczyć? 1 czy 2?")
        val scanTable = Scanner(System.`in`)
        var scanningTable = 0
        scanningTable = scanTable.nextInt()
        if(scanningTable == 1){
            println(tabSum)
        } else if(scanningTable == 2){
            println(tabSum2)
        } else{
            println("---------------------")
            println("Podałeś złą liczbe!")
            println("Wpisz liczbę odpowiadającą tablicy... 1 albo 2")
            println("---------------------")
        }
    } else {
        println("OK")
    }
    val scanner = Scanner(System.`in`)
    var scan: Boolean? = true
    println("A może tak rozmiary tablic? true/false")
    scan = scanner.nextBoolean()
    if(scan === true){
        println("Tablica 1 zawiera ${table.size} elementów a tablica 2 zawiera ${table2.size} elementów")
    }else{
        println("OK")
    }
    val scanoutput = Scanner(System.`in`)
    var scanning: Boolean? = true
    println("Czy chcesz zrobic coś jeszcze przy tablicach? (true/false)")
    scanning = scanoutput.nextBoolean()
    if(scanning == true){
        tablice()
    } else{
        println("OK")
    }
}
fun petle(){
    println("--Pętle--")
    println("Mamy różne rodzaje pętli...")
    println()
    print("Przykładowo wpisz liczbe a wyświetli się ona 5 razy i o jedna liczba wyżej")
    val scanner = Scanner(System.`in`)
    var scanNum = 0
    scanNum = scanner.nextInt()
    for(i in 0..4){
        println(scanNum+1+i)
    }
    println()
    println("Można również wypisywać losowe liczby... Kliknij Enter aby kontynuować")
    readLine()
    for(i in 0..11){
        print(""+(Math.random()*100).toInt()+", ")
    }
    println()
    println("Sam zadecyduj ile razy ma się powiększyc!")
    print("Wpisz iloczyn liczby aby zwiększyć ją x razy: ")
    var scanTimes = 0
    scanTimes = scanner.nextInt()
    for(i in 0..40){
        val random = Math.random()*100.toInt()*scanTimes
        println(""+random.toInt()+" ")
    }
    println("----------------------")
    println("Kliknij Enter")
    println("----------------------")
    readLine()
    println("Wpisz true jeżeli chcesz zobaczyć pętle,")
    println("lub wpisz false aby zachować ją w tajemnicy")
    var trueOrNot: Boolean? = true
    trueOrNot = scanner.nextBoolean()
    while(true){
        whileLoop()
        break
    }
    val first = 10
    val second = 3
    println("Dwie liczby $first i $second w pętli for dodawanie +1")
    readLine()
    for(i in 0..10){
        println("Suma dwóch liczb jest równa ${first+second+i}")
    }
    println("KONIEC PROGRAMU")
}
fun whileLoop(){
    var iterator = 0
    val a = 3
    var b = 4
    val scanner = Scanner(System.`in`)
    var trueOrNot: Boolean? = true
    println("Wartość liczby A jest równa $a")
    println("Wartość liczby B jest równa $b")
    println("Masz możliwość zmiany wartości liczby B. Czy chcesz ją zmienić? (true/false)")
    trueOrNot = scanner.nextBoolean()
    while(true){
        println("Wpisz nową liczbę:")
        b = scanner.nextInt()
        println("Nowa wartość liczby B wynosi: $b.")
        println("Pętla którą teraz zobaczysz pododaje oraz pomnoży obydwie liczby przez losowo wygenerowaną od 1 do 10 liczbe 4 razy w pętli która odtworzy się 3 razy.")
        println("Kliknij Enter aby zobaczyć pętle!")
        break
    }
    readLine()
    println("---------------------")
    while(iterator < 3){
        for(i in 0..4){
            println("Wynik dodawania liczby A to: ${a+(Math.random()*10).toInt()}")
        }
        for(i in 0..4){
            println("Wynik mnożenia liczby A to: ${a*(Math.random()*10).toInt()}")
        }
        for(i in 0..4){
            println("Wynik dodawania liczby B to: ${b+(Math.random()*10).toInt()}")
        }
        for(i in 0..4){
            println("Wynik mnożenia liczby B to: ${b*(Math.random()*10).toInt()}")
        }
        iterator++
    }
    println("---------------------")
}