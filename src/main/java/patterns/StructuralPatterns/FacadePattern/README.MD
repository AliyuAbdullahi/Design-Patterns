#Facade Design Pattern

The Facade Pattern makes a complex interface easier to use, using a Facade class.
The Facade Pattern provides a unified interface to a set of interface in a subsystem.
Facade defines a higher-level interface that makes the subsystem easier to use.

From sample code, we have an ```interface``` ```Gun``` and a ```class``` ```M4Cabine```
and ```SMG```, which are types of ```Gun```. They both implement ```Gun```.

We have another class ```Solder``` that needs a ```Gun```. All we have to do is inject
```Gun``` interface, therefore at implementation time, ```Solder``` can carry any type of ```Gun```.


