# Solid Principles

1. Single Responsibility Principle (SRP): This principle states that Each class should have only one reason to change, In other words, a class should do only one thing or responsible for one task,
   this makes the system simpler, as each class has a sinle repsonsibility, if something need to change then it will effect only that class

2. Open/Closed Principle (OCP): This principle states that a software entity (class or method), should be open for extension but closed for modification, this allows the developers to extend the current functionality
   without changing the class itself, the goal is to avoid unnecessary changes to the existing code which may introduce new bugs

3. Liskov Substitution Principle (LSP): This principle states that the objects of the sub class should be able to replace the objects of the parent class with out effecting the correctness of the program
   this means that sub classes shoudl not break the functionality defined in the parent classes, ensuring consistency across the system

4. Interface Segregation Principle (ISP): This principle states that the clients should not be forced to depend on the interfaces that they don't use, Instead of having one bigger interface we should breake them down to
   more smaller and specific interfaces so that any class cam implement only the interfaces that they need making the code cleaner and easier to work with

5. Dependency Inversion Principle (DIP): This principle stated that high level modules should not depend on the low level modules, Both should depend on the abstractions, this avoids the tight coupling between the modules
   making the system more flexible and easier to modify, This helps in creating loosely coupled code by relying on the abstarction instead of concrete implementations
    
