# Inheritance in Object-Oriented Programming

## Types of Inheritance allowed in Java

1. Simple Inheritance.
2. Multi-Level Inheritance.
3. Hybrid Inheritance.
4. Hierarchical Inheritance.

Multiple Inheritance is not allowed in Java.  
C/C++.

## Types of Polymorphism  
1. Method Overloading.  
2. Method Overriding.

### Method Overloading: (Polymorphism of methods on the basis of parameters)
When we have the same signature of the method, but
1. different number of parameters.  
2. different type of parameters.

It can be done in the same class.  
It can be done in a pair of parent class and child class.

### Method Overriding: (Polymorphism of methods on the basis of objects)
We can change the behaviour of a method of the parent class
by overriding it in the child class. 

1. The signature of the method should be exactly same, including the
parameter list.
2. We can only override a method of the parent class, inside a 
child class. 

## Dynamic Method Dispatch
It is a mechanism, by which, runtime polymorphism is achieved for overridden methods
in Java.
It is implemented through, the super class (parent class reference).
A superclass reference can refer to an object of its subclass.
Each subclass will have its own version or definition of the overridden method.
The dynamic method dispatch mechanism will choose the right version of the method
according to the definition of the overridden method.  

In Java, we have four types of program units:
1. A Class (a definition class, or an execution class).
2. An Abstract Class
3. An Interface
4. An Enum


## Abstract Classes
