//create a new instance of a developer
developer d = new developer()
d.first="Sujith"
d.last="Sukumaran"    //d.setfirst or d.setlast can also be used
d     //executes the calling and prints the first and last name as cmd arg


//assign some language
d.languages.getClass().getName()  //type of the language class will be printed
d.languages << "Java"   //Left shift opr add items to the array list
d.languages << "Groovy"
d    //O/P-> developer(Sujith, Sukumaran, [Java, Groovy])
d.work()