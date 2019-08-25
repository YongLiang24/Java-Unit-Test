Coming from Javascript, arrays in Java were confusing to me. Below I would like to discuss how arrays work in Java.

Array Declaration
In Java, an array has to declare with a type. Elements in it has to match the array type as well.
//integer array example, both declarations will work

int [] myArray;
int myArray [];

//string array example

String [] strArray;
String strArray [];

Give array a size
The size of an array will not change dynamically in Java, so we have to define a size before using it. ArrayList is a better option when we need a dynamic size for a collection of datas.
//using the arrays from the examples above, we can define a size for them

myArray = new int[10];

//we can also perform the declaration and size with one line of code

int [] myArray = new int[10];

Array literal
When we know what elements that an array will have, we can use array literal to declare an array.
//the size of the array is determined by the number of elements were defined

int myArray = new int[]{1,2,3,4,5,6,7,8};

//in newer version of Java, we can skip the new int[]

int myArray = {1,2,3,4,5,6,7,8};

My favorite loop to use to get the array elements
for(int eachNumber : myArray){

 System.out.println(eachNumber);
}
