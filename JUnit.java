
What is JUnit?
JUnit is a Java testing framework. It can be used for both Unit Testing and UI Testing. It is a great tool and fun to use. In this article, I would like to demonstrate how to use this framework in Eclipse IDE for beginners.

Junit 5 comes with Eclipse so all we need to do is add it to our project when we first creating the project.

Steps:

add Junit to the project.
add new file -> create a new class file.
add new file -> create JUnit Test file.
write some methods in the class.
create an object of that class inside the Junit Test file.
use the object to invoke class methods to test inputs and outputs.
//This class has one method which will return a string argument.
public class HelloWorld {

     public String printThis(String str){

               return str;
        }

}
//The JUnit file would look like this

class HelloWord{
//instantiate a HelloWorld object called hello.
   HelloWorld hello = new HelloWorld();

//test method names tends to be descriptive 
   @Test
   void should_return_a_same__passing_string_value(){

//one way to think about constructing a test is use these 3 steps

       //given (the inputs)
       String cake = "chocolate cake";

       //when (the actions)
       String cakeTest = "chocolate cake";

       //then (the results)

       assertEquals(cakeTest, hello.printThis(cake) );
//this will pass the test if both values are equal.
 }
}
These are the steps to perform a most basic unit test.
