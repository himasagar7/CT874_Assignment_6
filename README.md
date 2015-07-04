# CT874_Assignment_6
This project contains the programming solutions for my Java assignment 6
Programming I Assignment 6
1.Write a program to test the Person class defined below. Your test program should create two instances of the class (each to test a different constructor) and test each of the methods. You are also required to illustrate the error in trying to access private data members from the client class (for clarity temporarily change the private modifier to public and test again).
class Person
{
 
 
//
Data Members
 
 
private String
name; // The name of this person
private int
age; //
The age of this person
private char
gender;
// The gender of this person
// Default constructor public Person() {
this("Not Given", 0, 'U');
}
//Constructs a new Person with passed name, age, and gender.
//example of explicit use of “this” (only for illustration) public Person(String name, int age, char gender) {
this.age
= age;
this.name
=
name;
this.gender =
gender;
}
//Returns the age of this person. public int getAge( ) {
return age;
}
//Returns the gender of this person. public char getGender( ) {
return gender;
}
// Returns the name of this person. public String getName( ) {
return name;
}
//Sets the age of this person. public void setAge( int age ) {
this.age = age;
}
//Sets the gender of this person. public void setGender( char gender ) {
this.gender = gender;
}
//Sets the name of this person.
public void setName( String name ) { this.name = name;
}
} // end class
2.Write a program that accepts the unit of weight of a bag of coffee in pounds and the number of bags sold and display the total price of the sale, compute as follows:
totalPrice = bagWeight * numberOfBags * pricePerLb; totalPriceWithTax = totalPrice + totalPrice * taxRate;
Display the results in the following manner:
Number of bags sold: 25
Weight per bag: 5
Price€5.per55 pound:
Sales tax: 10.0%
Total€ 763price:.13
You are required to define and use a programmer-defined CoffeeBag class. Include class constants for the€5.price55perperpoundpoundandand10%tax rate with the value of
respectively.
