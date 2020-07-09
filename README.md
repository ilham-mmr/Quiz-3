# Quiz-3

- what will be printed?
```
Meow. I am a cat. My name is Kurre
and I am 6 years old.
Woof. I am a dog. My name is Vilma
and I am 3 years old.
```

- Explain how it is that the instance variable age of Animal can be used in Cat and Dog when it is declared in Animal.

cat and dog inherit from Animal so the variable can be accessed through the subclasses with the concept of inheritance.

- What actually consists an instance of?

kurre has an instance of CAT whereas vilma has an instance of DOG.

- And what consists a class of?

A class consists of data field descriptions.

- What is the difference between a class and an instance?

A class acts as a blueprint defining the description and used to create objects. Whereas an instance is basically a concrete thing of class itself.

- Change the declaration of the instance variable age of Animal to a class variable using static, in this way:
public static int age;

> The output:
```
 Meow. I am a cat. My name is Kurre
and I am 3 years old.
Woof. I am a dog. My name is Vilma
and I am 3 years old.
```
- Why? 

because static will share the same state to all the instances. at the end, the age variable was set to 3 and it results in making all the instances have the same value which is 3. So, static field means it belongs to the class

-  It may happen that you get warnings from the compiler that you should access the variable age via Animal.age, but it should be possible to run the program anyway. Otherwise, change the references to age into Animal.age.

- Where is the value of an instance variable stored?

the value is stored at a defined variable in the class itself.

- Where is the value of a class variable stored?

the value will be stored in class properties.

- What refers the variable this to?

this refers to the class to make it explicit that the variable we choose is the one that is in the class. This would be helpful especially when creating a method. the parameter of the method usually has the same name as the properties of the class.



