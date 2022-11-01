import java.lang.StringBuilder
import java.util.Random
import java.util.Scanner

fun main(args: Array<String>) {

    val words = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val signWords = "!@#$%^&*()_+=,./;'[]\\<>?:\"{}|"

    val scanner = Scanner(System.`in`)

    println("请输入生成数量：")
    val nums : Int = scanner.nextInt()
    val passwords = ArrayList<String>(nums)
    println("请输入密码位数：")
    val passwdLength : Int = scanner.nextInt()
    println("是否使用特殊符号(n)(y/n)")
    scanner.nextLine()
    val useSignSwitch : String = scanner.nextLine()
    val isUseSign : Boolean = if (useSignSwitch == "y") true else if (useSignSwitch == "n") false else false

    val usedWords : String = if (isUseSign) words + signWords else words

    val random = Random()
    val password = StringBuilder()
    for (i in 1..nums) {
        password.clear()
        for (j in 1..passwdLength) {
            password.append(usedWords[random.nextInt(usedWords.length)])
        }
        passwords.add(password.toString())
    }
    println(passwords)

}