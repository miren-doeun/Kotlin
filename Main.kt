package com.survivalcoding.kotlinbasic

import java.util.Scanner//scanner을 사용 하기 위해 선언해줘야한다.
import javax.security.sasl.AuthorizeCallback//callback을 사용하기 위해 선언해줘야 한다.
import kotlin.math.max//max클래스를 사용하기 위해 선언해줘야한다.
import kotlin.random.Random//random함수를 사용하기 위해 선언해줘야한다.

//const val num = 20//클래스밖 또는 메인 밖에 값을 선언 또는 지정 가능하다, const를 붙일 경우 compile time 상수로 만들 수 있으며 이런식이 될 경우 메인보다 먼저 컴파일 된다.


fun main(){//기본 메인 함수 형태
//    print("Hello World")//자바와 다르게 명령어 끝에 ';'을 사용하지 않는다
//    println(" HI")//print,println 두개 다 있다.
//    var i = 10//변수 선언은 int,string,doble 모두 var로 대체한다.
//    var name ="도은"
//    var point : Double 3.3//타입 지정시 변수 선언 뒤에 ": '타입'" 형식으로 한다, 타입지정은 모두 대문자로 지정을 한다.

//    i=20//이 방식으로 변수 제대입 가능

    //val num = 20//상수는 val로 지정을 한다.(상수:변하지 않는 값)

//    var i = 10
//    var l = 20L
//
//    var name= "10"
//    name = i.toString()
//
//    l=i.toLong()//코틀린에서는 타입이 다를경우에는 넣을 수 없다.
//    i=l.toInt()//넣어야 하는경우에는 "i.to'형태'"식으로 하면 넣을 수 있다.

//    var name="김도은"
//    println(name.toUpperCase())//줄이 그어져 있일경우 자바와 다르게 사용 방식이 바뀐것이다.
//    print(name[0])//자바처럼 특정번지 문자를 따로 출력할 수 있다.
//    print("제 이름은 ${name}입니다")//괄호안에 변수를 직접 입력해서(${"변수명"}) 넣을 수 있다, 안에서 수식도 넣을 수 있다.
//    var i =10
//    var j =20
//    print(max(i,j))//프린트 안에 max를 사용할 경우 괄호안에 수중 가장 큰수를 찾아준다. min도 같은 일을 해준다.import문이 필요하다.
//    val randomNumber= Random.nextInt(0,100)//"Random.nextInt()"사용시 아무 수나 변수에 넣어준다.괄호안에 수를 넣어줌으로써 범위를 지정해 줄 수 있다.
//    val randomNumbers= Random.nextDouble()//Double도 사용 가능하다.
//    println(randomNumber)
//    print(randomNumbers)
//    var reader=Scanner(System.`in`)//자바에서 사용가능하지만 코틀린에서 사용 못하는 명령어는 '` `'로 감싸줌으로써 사용 가능하다
//    reader.nextInt()
//    reader.next()//나머지는 자바처럼 하면 된다.
//    val i = 5
//    if (i>10) {
//        print("10보다 크다")
//    }
//    else if (i>5) {
//        print("10보다 작다")
//    }
//    else {
//        print("")
//    }//if는 자바와 동일하다,alt+Enter로 when문과 서로 바꿀 수 있다.

//   var result = if (i>10) {
//        "10보다 크다"
//    }
//    else if (i>5) {
//        "10보다 작다"
//    }
//    else {
//        "!!!"
//    }//코틀린에서는 이런방식을 식으로 인식을 해서 if문으로 받을 수 있다.
//    print(result)
//    var i = 5
//    val result = if (i>10) true else false//자바의 3항연삭식을 이런식으로 사용한다
//    val items= listOf((1,2,3,4,5)
//
//    for (i in 0..items.size-1){
//        print(items[i])
//    }//코틀린의 for문 사용방식,while, break, continue 문은 자바와 완전히 동일하다.
//    val items= listOf(1,2,3,4,5)//코틀린의 리스트는 가져다 사용하는것만 가능하고 값을 변경할 수 없다.
//    val item= mutableListOf(1,2,3,4,5)//이렇게 만든 리스트는 값을 변경할 수 있게 된다.
//    item.add(6)
//    item.remove(3)

//    val items= arrayOf(1,2,3,4)
//    items[0]=10//코틀린에서는 배열을 이런식으로 사용
//    val name:String?=null//코틀린에서는 null세이프티 기능때문에 '?'를 넣어 줘야 한다.

//    name="도은"
//    name=null
//    var name2:String=""
//    name2=name!!//강제로 string타입으로 변환할 필요가 있을경우 '!!'가 필요하다.좋지 않은 방식이다.
//    name?.let{//null이 아니라면 실행하자 라는 방식이다.
//        name2=name
//    }
//    print(sum(20,c=30,b=30))//입력 파라미터를 명시적으로 지정 하는 것도 가능.

//    val doeun=Persen("doeun",20)
//    val doeun2=Persen("doeun",20)
//    print(doeun==doeun2)
//    doeun.hobby="boy"

//    val dog : Animal=Dog()
//    val cat=Cat()
//
//    //cat as Dog//강제로 타입 캐스팅을 할때 as를 사용
//    if(dog is Dog){
//        println("멍멍이")
//    }


//    val box=Box(10)
//    val box2=Box("dfdfdf")
//
//    print(Box.value)

//    myFunc (10){//suspend함수가 되면 화살표가 생긴다,
//      println("함수 호출")
//    }//람다표기법,이런함수를 고차함수라 부른다.
}

//fun sum(a:Int, b:Int):Int{
//    return a+b
//}//함수 만드는법

//fun sum(a:Int,b:Int):Int = a+b//간단한 함수일 경우 이렇게 줄일 수 있다.return생략 가능
//fun sum(a:Int,b:Int, c:Int =0 ):Int = a+b//defult값을 적당히 넣어줘서 값을 더 넣는것을 대비 할 수 있다.

//data class Persen(
//    val name: String,
//    val age:Int,
//) {//코틀린은 클래스 옆에 기본 생성자를 넣는다.private로 제공을 안하게 할 수도 있다. //안에 내용이 없는 경우 대괄호 생략도 가능하다.
//    var hobby="축구"
//        private set//외부에서 셋을 못하게 막을 수 있다
//        get()="취미:$field"
//    init {
//        println("init")
//    }
//    fun some(){
//        hobby="농구"
//    }
// }

//interface Drawable{
//    fun Draw()
//}
//
//abstract class Animal{
//    open fun move(){//코틀린에서는 오버라이드가 기본적으로 막혀있어서 open명령어를 사용하여 열어줘야 한다,상속도 마찬가지로 막혀 있어서 open을 꼭 넣어줘야한다.
//
//    }
//}
//
//class Dog : Animal(), Drawable{
//    override fun move() {
//        println("껑충")
//    }
//
//    override fun Draw() {
//        TODO("Not yet implemented")
//    }
//}
//class Cat : Animal(), Drawable{
//    override fun move() {
//        println("살금")
//    }
//
//    override fun Draw() {
//        TODO("Not yet implemented")
//    }
//}


//class Box<T>(val value:T){//특정 타입을 설정하고 싶을때 '< >'로 둘러준다
//
//}
suspend fun myFunc(a : Int,IntcallBack: ()->Unit){//suspend를 넣으면 정지함수가 된다.
    println("함수시작!")
    callBack()//살짝 event같은거?
    println("함수끝!")
}
