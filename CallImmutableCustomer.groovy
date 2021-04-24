def d= new Date()
def c1=new Customer("Sujith","Sukumaran",29,d,["books","bikes"])
def c2=new Customer(fst:"Sujith",lst:"Sukumaran",age:29,since:d,favitems:["books","bikes"])
assert c1==c2
c1.fst="Ajay" //Error thrown due to final private access type (Immutable)