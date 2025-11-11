fun main() {
    //11.1
    print("Введите левую границу: ")
    val left= readLine()!!.toDouble()
    print("Введите правую границу: ")
    val right = readLine()!!.toDouble()
    val line = Line(left, right)
    line.squer()
    //11.2
    print("Введите число для проверки: ")
    val x = readLine()!!.toDouble()
    val line1 =Chek(x,left,right)
    line1.chek()
}
//11.1
open class Line(val left:Double,  val right:Double){

    val s = right - left
    fun squer()=println(s*s)
}
//11.2
class Chek(val x:Double, left:Double,  right:Double) : Line(left,right){
    fun chek() {
        if (x>left&&x<right){
                println("Число $x входит в диапозон [$left;$right]")
        } else{
                println("Число $x не входит в диапозон [$left;$right]")
        }
    }
}
//11.3
open class Book(val title:String,val page: Int,val price:Double){
    fun qfun()=println(price/page)

}
class BookP(title:String,page:Int,price:Double,val year: Int):Book(title,page,price){
    val q = price/page
    fun qp()=println(q-0.2*(2025-year))
}
//asd