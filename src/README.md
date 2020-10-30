The java.util.Collections class consists exclusively of static methods that operate on or return collections.
Following are the important points about collections.

It contains polymorphic algorithms that operate on collections, "wrappers", which return a new collection backed by a 
specified collection.

The methods of this class all throw a NullPointerException if the collections or class objects provided to them are null
    
A collection is an object that can hold references to other objects. The collection interfaces declare the operations that can 
be performed on each type of collection. The classes and interfaces of the collections framework are in package java. util.
    
Generics can help us catch class cast exceptions at runtime.
    
Sometimes we want to add constraints/restrictions on a type parameter, i.e. if we only want to store numbers
in a list. 

Generic classes get converted to objects and other native Java Classes during compilation time when the code is converted
to byte code, using them allows us to avoid casting class exceptions.

If you are using an interface, such as Comparable, the <t> will be replaced by the interface Comparable.

When you are using multiple interface constraints, the java compiler will choose the left most one to replace all the <t>'s
This is known as type erasure, i.e. when the java compiler erases the type parameter and replaces it with a class or interface
depending on the constraints.

When using wildcards, the java compiler is going to make an anyonymous type under the hood. 

