/*
-create a range for that enum
-print size of the range
-use contains method to see if Wednesday is in the Range
-print the from element of this range
-print the to element of this range
*/

enum Days {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}

// Creating a Range
def dayRange = Days.Sunday..Days.Saturday
println dayRange

// print the size of the range
println dayRange.size()

// use the contains method
println dayRange.contains("Wednesday")

// print the from element of the range
println dayRange.getTo()

// print the to element of the range
println dayRange.getFrom()

// LIST SECTION
println "..."
println "Moving on to the LIST section"
println "..."


def listOfDaysOfTheWeek = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]

//print out the list
println listOfDaysOfTheWeek

//print out the size of the list
println listOfDaysOfTheWeek.size()

//remove Saturday from the list
listOfDaysOfTheWeek.removeAt(5)
println listOfDaysOfTheWeek

//adding Saturday back in
listOfDaysOfTheWeek.add(5,"Saturday")
println listOfDaysOfTheWeek

//print out Wednesday
println listOfDaysOfTheWeek[2]

// MAP SECTION

println "..."
println "Moving on to the MAP section"
println "..."

/*
This is a map rather than a Range
*/
def mapOfDaysOfTheWeek = [
1:"Monday", 
2:"Tuesday", 
3:"Wednesday", 
4:"Thursday", 
5:"Friday", 
6:"Saturday", 
7:"Sunday" ]

println mapOfDaysOfTheWeek

// Get Class Name of the Map
println mapOfDaysOfTheWeek.getClass().getName()

// Get Size of the Map
println mapOfDaysOfTheWeek.size()

//print values of the map
println mapOfDaysOfTheWeek.values()