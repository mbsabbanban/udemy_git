// Reviewing the Exercise 28 of using AST Transformations

import groovy.transform.Canonical

// Canonical demo. equalsAndHashCode, ToString, TupleConstructor
 @Canonical class Customer {
     String first, last
     int age
     Date since
     Collection favItems = ['Food']
     def object 
 }
 def d = new Date()
 def anyObject = new Object()
 def c1 = new Customer(first:'Tom', last:'Jones', age:21, since:d, favItems:['Books', 'Games'], object: anyObject)
 def c2 = new Customer('Tom', 'Jones', 21, d, ['Books', 'Games'], anyObject)
 assert c1 == c2
 
 // Sortable demo.
 
 import groovy.transform.*
 
 @ToString
 @Sortable
 class Person {
 
     String first
     String last
 }
 
 def p1 = new Person(first:"Matt", last:"Sabban")
 def p2 = new Person(first:"Kay", last:"Sabban")
 
 def people = [p1,p2]
 println people
 
 def sorted = people.sort(false /* do not mutate our original collection */)
 println sorted