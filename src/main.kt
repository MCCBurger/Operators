fun main() {
    //Arithmetic Operators
    var a = 20
    var b = 3
    var ans = 0

    println("===================Arithmetic Examples==================")
    ans = a+b
    println(""+a+" + "+b+"="+ans)
    ans = b % a
    println(""+b+" % "+a+"="+ans)
    ans = b/a
    println(""+b+" / "+a+"="+ans)

    println("====================Comparrison Operators================")
    //Comparison Operators
    var isCompare = a > b
    println(""+a+" > "+b+" is "+isCompare)
    isCompare = a != b
    println(""+a+" != "+b+" is "+isCompare)

    println("===================Assignment Operators==================")
    //Assignment Operator
    var ans2 = a * b
    ans2 += 10
    println(""+a+" * "+b+" + 10 is: "+ans2)
}