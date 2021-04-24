//DataTypes & numbers
//If a float and a double is involved in groovy, the result is always double

num=10+'1'    //Result String
num.class

def a=1/2    //int division gives 0.5
println (a)

b=1.intdiv(2) //int division gives 0. intdiv is a method which behaves like java
println b

//GDK methods
assert 2 == 2.5.toInteger() //conversion
assert 2 == 2.5 as Integer //enforced coercion
assert 2 == (int) 2.5 //typecast

assert '5.50'.isNumber()
assert 5 == '5'.toInteger()

//times | upto | downto | step
20.times{
//print '-'            //--------------------
}

1.upto(10) {
num -> 
//println num
} //prints 1 to 10

10.downto(1){num->
println num    ////prints 10 to 1
} 

0.step(1,0.1){num->
println num
} //counts 0 to 1 as a 0.1 step