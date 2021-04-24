import groovy.transform.*

@ToString
@Sortable
class Person{
    String fst
    String lst
}
def p1=new Person(fst:"Sujjith",lst:"Sukumaran")
def p2=new Person(fst:"Jaya",lst:"Sukumaran")
def p3= new Person(fst:"Abey",lst:"Abhraham")

def list=[p1,p2,p3]
println list
def sorted = list.sort(false)
//println sorted