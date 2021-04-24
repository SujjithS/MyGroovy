@groovy.transform.ToString()
class developer{
    String first    //Properties are private by default
    String last
    def languages= [] //array list
    
    void work(){
    println "$first $last is working..."
    }
}
