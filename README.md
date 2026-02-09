# Tasca S1 01

## Description

This is a project created for academic purposes. More specifically, it is created to complete the exercises included in the first Topic of IT ACADEMY Java & Spring specialization phase.
The indicated exercises are designed to understand how inheritance and polymorphism work in Java.


## Techonologies

- Java
- Maven


## Project Structure
TascaS1.01
src/
 └── main/
     └── java/
         └── FirstLevel
            └── Ex1
                └── Instrument.java
                └── MainInstrument.java
                └── PercussionInstrument.java
                └── StringInstrument.java
                └── WindInstrument.java
            └── Ex2
                └── Car.java
                └── Main.java
        └── SecondLevel
            └── Ex1
                └── Phone.java
                └── Camera.java
                └── Clock.java
                └── SmartPhone.java
                └── Main.java


## Installation

1. Clone the repository: git clone https://github.com/isalvama/tascaS1.01.git
2. Navigate to the project directory: cd java
3. Compile the project using Maven: mvn clean compile
4. Run the application using: mvn exec:java


## Concepts covered

- Abstract classes and child classes and its implication in inheritance and polymorphism
- Difference between static and non-static attributes 
- Usage of final attributes 
- Class-level vs instance-level memory
- Constructor initialization rules
- Interfaces and the use of their static methods in other classes



## First Level

### Ex1: Musical Instruments

This exercise is designed to understand how inheritance and polymorphism work in Java.


#### Abstract class: Instrument

Instrument is the abstract class, parent of the rest of the other classes: PercussionInstrument, StringInstrument and WindInstrument.
'name' and 'price' are the abstract's class attributes, and therefore the child classes of Instrument will inherit its attributes as well. Both are protected with 'private' modifier and can only be accessed through the Instrument's getters created for both of them.
An abstract method, called 'play()' is declared in Instrument class: all the child classes should therefore implement the method in their own way.


#### Child classes: PercussionInstrument, StringInstrument and WindInstrument

PercussionInstrument, StringInstrument and WindInstrument inherit from Instrument abstract class, thus they inherit its attributes and should implement the abstract method 'play()' declared in Instrument class.
In PercussionInstrument class, the boolean attribute 'playsNote' is static, thus it belongs to the class and can only be accessed by referencing the class, without the need of instancing a PercussionInstrument. A static getter for 'playsNotes' is created in order to access the attribute as it is private.
In the Main file the static attribute has been executed for the first time by calling the class method getter 'PercussionInstrument.getPlaysNotes' and later on when instancing the PercussionInstrument object 'xylophon', in which process the value has been changed to true, as a way to prove the different timings that the static attribute can be executed.


### Ex2: Cars

This exercise is designed to understand the difference between "static" and "final" modifiers when assigned to class attributes and how they affect to intialization, instantiation, possible subsequent modification of its values and its belonging to the class or the instance.


#### Class Description

The class Car has three different attributes:
- brand: a String attribute that is static and final.
- model: a String attribute that is static.
- power: a final int attribute.


#### Attributes

In order to deep in the modifiers established for each of the attributes, below we will provide an explanation for each of them:
- 'brand' is a static attribute, and therefore it belongs to the class. Its value cannot be changed once the attribute is initialized as it is a final variable.
- 'model' is a static attribute as well, and therefore it also belongs to the class, not to its instances. However, after being initialized, it can change its value later on.
- 'power' is a final int attribute, and it belongs to each Car instance created, not to the class, as it is static. However, once the attribute is initialized (either in the class or with the constructor) its value cannot be changed later on.


##### Which of these attributes can be initialized from the constructor? 

- 'power' can be initialized in the constructor as it is a non-static attribute, and it doesn't belong to the class but to its instances. As a non-static attribute, 'power' it is created every time Car is instantiated.


##### Which of these attributes cannot be modified later on?

- 'power' and 'brand' attributes, as they are final, once they are initialized its value cannot be changed during the course of the program execution.


##### Which of these attributes affect all instances in the class?

- 'brand' and 'model' are static attributes and therefore belong to the class, not to its instances. The static variables are no longer replicated for each object, but they are only "hosted" once in the 'Car' class. Every time the value of a static attribute that is not final is changed, that affects to the value's attribute of all of the instances created for that class, and will then have the new value established for that attribute.


#### Methods

Static 'brake()' and 'accelerate()' methods are established in the class. Due to its static nature, both methods can be called without creating an instance of the class, only by calling the class ('ClassName.methodName()') as shown below (and implemented in Main file):
- Car.brake();
- Car.accelerate();


However, the methods can also be called from a created instance of the class, as it has been done in Main file:
- car1.accelerate();
- car1.brake();


## Second Level

### Ex1: Phone

This exercise is designed to understand how to construct interfaces in Java and learn how they are used by classes.


#### Abstract class: Phone

Phone is an abstract class, parent of SmartPhone subclass. As in real life, all phones belong to a brand, they are of a specific model and able to call. Therefore, 'brand' and 'model' are the abstract's class attributes, and therefore are inherited by the child's classes. Both are protected with 'private' modifier and can only be accessed through the Phone's getters created for both of them ('getBrand()' and 'getModel()').
The class also declares and implements the 'call()' method, as all subclasses of 'Phone' have the capacity of calling another phone. As a method implemented in the superclass 'Phone', all the child classes inherit from it and through its instances the method can be called.


#### Interfaces: Camera and Clock

Two interfaces are created to be implemented by Phone subclasses: 'Camera' and 'Clock'.
Camera has the capacity if taking a photo thanks to its method 'takePhoto()' and 'Clock' is able to sound an alarm with the 'soundAlarm()' method.
Both methods are abstract: declared in the mentioned interfaces and with a mandatory implementation by the classes that implement those interfaces.


#### Subclass: SmartPhone

'SmartPhone' is a class that inherits from 'Phone' abstract class, thus it inherits its attributes ('brand' and 'model'), and method ('call()').
'SmartPhone' implements 'Camera' and 'Clock' interfaces as well: it establishes the implementation of their methods ('soundAlarm()' and 'takePhoto()'), as it is a device that has the capacity of doing so in real life.
In Main file the subclass 'SmartPhone' that implements both 'Camera' and 'Clock' interfaces is being tested by instancing the object 'iphoneXS' and calling through this instance the interface methods 'takePhoto()' and 'soundAlarm()', as well as the superclass method 'call()'.