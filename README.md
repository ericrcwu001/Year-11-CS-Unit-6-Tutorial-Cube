# Year-11-CS-Unit-6-Classes-Tutorial-Cube

Your job is to create one class called Cube.
You should pass all of the tests in the CubeTester class (provided).

Create a class called Cube. Cube has one single private integer variable called side, which represents the length of a side of the cube, a getter method called getSide(), a setter method called setSide(int side), a method that returns the surface area of the cube called getSurfaceArea(), a method that returns the volume of the cube called getVolume(), and a toString method that returns a String in the format, for example:

Cube{side=4} .

The Cube class has two constructors. One takes no arguments (has no parameters) and sets side to 1. The other will take a single integer argument that is used to initialize the side property. Side should never be less than 1. If a user attempts to create a Cube with a side length less than 1, an IllegalArgumentException will be thrown. The message “A cube’s side length cannot be less than 1!” will be displayed in the console when the exception occurs. If a user attempts to change the side length of an already existing Cube to a value less than 1, again, an IllegalArgumentException will be thrown, and the message “A cube’s side length cannot be less than 1!” will be displayed in the console when the exception occurs. 

You will need to add JUnit4 to your classpath. Hover your cursor over the red coloured 'junit' within the import statement on line 1 and click on 'Add 'JUnit4' to classpath'.

![image](https://user-images.githubusercontent.com/57818506/211691173-8ca1e0dc-243b-46a9-8f1f-2383da09c169.png)
