println "Creating a method that accepts a CLOSURE as an argument..."

def greeting( Closure HelloWorld ){
    HelloWorld()
}
 
println "Creating a closure..."

def HelloWorld = {
    println "Hello World"
}

// HelloWorld()

greeting(HelloWorld)

// creating a list and then using the each method

List myList = ["Pyro", "Paladin", "Sorcery"]

myList.each({ list ->
    println list
})

// creating a MAP of data and then using the each method

Map magics = [pyro:"Fire Orb", sorcery:"Crystal Spear", paladin:"Sacred Oath"]

magics.each{ k,v ->
    println "$k = $v"
}

// Demonstrating a different use of the CURRY

def greet = { String greeting, String name ->
    println "$greeting, $name"
}

def NYgreeting = greet.curry("Yo")

NYgreeting("Nigga")