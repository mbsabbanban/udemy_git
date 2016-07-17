// create a new instance of a developer
Developer d = new Developer()
d.first = "Matt" // setting the value of the first name to Matt, this actually calls a 'Setter'
d.setLast("Sabban") // this actually calls the 'Setter' method

d

// assign some languages
d.languages.class // gets the class information
d.languages << "Groovy" // the "<<" will add a string into an array
d.languages << "Java"

d

// call some methods
d.work()