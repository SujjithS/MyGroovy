//Strings

//Java

char c='c'
println c.class    //class java.lang.Character

String str="Hi this is a string within double quotes"
println str.class    //class java.lang.String

//Groovy 
//a def keyword with directly take string as default if a character is provided within quotes
def c2= 'c'
println c2.class    //class java.lang.String

def c3="Hi this is another string within double quotes"
println c3.class    //class java.lang.String

//String interpolation

//Java
String name = "Sujith"
String msg = "Hello " + name +".."
println msg

//Groovy
String msg2 ="Hello ${name}, by calling this access specifiers your will get to see the value of that variable"
println msg2

String msg3='Hello ${name}, access specifiers wont work in single quotes'
println msg3

String msg4= "We can evaluate expression inside string and works pretty well, i.e.,250/5= ${250/5}"
println msg4

//Multi line String

String msg5="""
Hello ${name},
this will help you
write down long sentences
inside of a string literal, also 
you can do some expressions such as
250*10= ${250*10}
"""
println msg5


//dollar slashy

def pathUsedInJAVA= "C:\\Users\\SujjithS\\Desktop\\My Py Workspace\\Groovy"
println ("This is how you access a path in Java: "+pathUsedInJAVA)

def pathUsedInGroovy=$/C:\Users\SujjithS\Desktop\My Py Workspace\Groovy/$
println ("This is how you access a path in Groovy: "+pathUsedInGroovy)