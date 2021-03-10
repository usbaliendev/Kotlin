fun main(){

//Entradas

    println("Digite um número:")
    var n1: Int= readLine()!!.toInt()

    println("Digite o operador:")
    var op: String? = readLine()

    println("Digite outro número:")
    var n2: Int= readLine()!!.toInt()

    var Res: String

    if(op == "+"){
        Res = (n1+n2).toString()}
    else if(op == "-"){
        Res = (n1-n2).toString()}
    else if(op == "*"){
        Res = (n1*n2).toString()}
    else if(op == "/"){
        Res = (n1/n2).toString()}
    else{
        Res = "O operador deve ser (+, -, *, /)"}

    println("O resultado é:")
    println("$Res")

//Layout de exibição para o usuário

    for(i in 0..100){println("\n")}

    println(" ________________________________________")
    println("|  ____________________________________  |")
    println("| |                                    | |")
    println("     $n1    $op   $n2     =  $Res         ")
    println("| |____________________________________| |")
    println("|                                        |")
    println("|                                        |")
    println("|  _____  _____  _____  _____   _______  |")
    println("| |__%__||__/__||__X__||__-__| |___C___| |")
    println("|  _____  _____  _____  _____   _______  |")
    println("| |__7__||__8__||__9__||     | |___AC__| |")
    println("|  _____  _____  _____ |  +  |  _______  |")
    println("| |__4__||__5__||__6__||_____| |___(___| |")
    println("|  _____  _____  _____  _____   _______  |")
    println("| |__1__||__2__||__3__||     | |___)___| |")
    println("|  ____________  _____ |  =  |  _______  |")
    println("| |_____0______||__,__||_____| |__+/-__| |")
    println("|                                        |")
    println("|________________________________________|")
}