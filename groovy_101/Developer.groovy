@groovy.transform.ToString()
class Developer {

//Defining some Properties first
    String first
    String last
    def languages = []
    
    void work(){
        println "$first $last is working..."
    }

}