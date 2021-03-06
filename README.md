# OCA-Java-Programmer

![](http://education.oracle.com/education/ou_rd14/image/oracleuniversity_logo.png)

[![forthebadge](http://forthebadge.com/badges/uses-git.svg)](http://forthebadge.com)

| Lesson 01      | Lesson 02       | Lesson 03       | Lesson 04           | Lesson 05           | Lesson06
| :------------  | :------------   | :-------------- | :------------------ | :------------       | :------------------------ |
| Packages       | Basic if        | Debugging       | Pass values methods | Encapsulation       | Flow Control & Exceptions |
| Compiling      | Switch, String  | Pass by value   | Q & A  enum String  | Immutable           | Fibonacci 				 |
| Interpret code | Encapsulation   | Recursion       | Override            | Polymorphism        | FizzBuzz 				 |
| enum           | Inheritance     | Boolean         | super               | Local variable      | Swap Variables   		 |
| for in         | Ploymorphism    | Method overload | static              | Stack Heap          | Codility 				 |
| Abstract class |overload override| Scope			 | Superclass          | Strings  			 | 
| JFrame		 | Constructor	   | Arrays		     | Subclass            | StringBuilder		 |
| import static	 | TreeSet		   |Pass Vars Methods| this				   | chained methods	 |
| Interface		 |Boolean		   | Shadowing vars  | Operators		   | String	methods		 |
| Public 		 |Postfix		   |Garbage Collection| instanceof		   | Arrays				 |
| Protected		 |Prefix		   | Literals 		 | Increment Decrement | ArrayList 			 |
| Private		 |ArrayList	Array  | Assignments	 | ternary     		   |
| String Object	 |StringBuilder	   | Variables	     |
| toString()	 | static blocks   | Stack Heap  	 |

## Basics
"When the compiler's not happy, ain't nobody happy."

```
// public Access Modifier
// class keyword used for specifying a class
// name of class Cat
public class Cat
{ // open curly brace of the class Cat
	
	// class instance variables
	String name, color;
	int age;
	
	// name of class method talk
	// return of type void
	void talk()
	{ // open curly brace of the method talk
		
		// the talk method statements
		System.out.println("Meow");
	} // closing curly brace of the method talk
} // closing curly brace of the class Cat

```

- Class:
A template that describes the kinds of state and behavior that objects
of its type support.
- Object:
At runtime, when the Java Virtual Machine (JVM) encounters the
new keyword, it will use the appropriate class to make an object that is an
instance of that class. That object will have its own state and access to all of
the behaviors defined by its class.
- State: (instance variables)
Each object (instance of a class) will have its
own unique set of instance variables as defined in the class. Collectively, the
values assigned to an object's instance variables make up the object's state.
- Behavior: (methods)
When a programmer creates a class, she creates
methods for that class. Methods are where the class's logic is stored and
where the real work gets done. They are where algorithms get executed and
data gets manipulated.
"A method signature is a collection of information about the method, as in a C prototype or a forward function declaration in other languages. It includes the method's name, type, and visibility, as well as its arguments and return type."

Complete List of Java Keywords (assert added in 1.4, enum added in 1.5)

|   |   |   |   |   |   |
|---|---|---|---|---|---|
| abstract | boolean | break | byte | case | catch |
| char | class | const | continue | default | do |
| double | else | extends | final | finally | float |
| for | goto | if | implements | import | instanceof |
| int | interface | long | native | new | package |
| private | protected | public | return | short | static |
| strictfp | super | switch | synchronized | this | throw |
| throws | transient | try | void | volatile | while |
| assert | enum

Rules associated with declaring classes, import statements, and package statements in a source file:
- There can be only one public class per source code file.
- Comments can appear at the beginning or end of any line in the source code
file; they are independent of any of the positioning rules discussed here.
- If there is a public class in a file, the name of the file must match the name
of the public class. For example, a class declared as public class Dog { }
must be in a source code file named Dog.java .
- If the class is part of a package, the package statement must be the first line
in the source code file, before any import statements that may be present.
- If there are import statements, they must go between the package statement
(if there is one) and the class declaration. If there isn't a package statement,
then the import statement(s) must be the first line(s) in the source code file.

If there are no package or import statements, the class declaration must be
the first line in the source code file.
- import and package statements apply to all classes within a source code file.
In other words, there's no way to declare multiple classes in a file and have
them in different packages or use different imports.
- A file can have more than one nonpublic class.
- Files with no public classes can have a name that does not match any of the
classes in the file.

The following are all legal declarations for the "special" main() :
static public void main(String[] args)

public static void main(String... x)

static public void main(String bang_a_gong[])

main() can be overloaded.

Rules for using static imports:
- You must say import static ; you can't say static import .
- Watch out for ambiguously named static members. For instance, if you do a
static import for both the Integer class and the Long class, referring to MAX_
VALUE will cause a compiler error, since both Integer and Long have a MAX_
VALUE constant, and Java won't know which MAX_VALUE you're referring to.
- You can do a static import on static object references

Class Access?

1. Create an instance of class B
2. Extend class B (in other words, become a subclass of class B)
3. Access certain methods and variables within class B, depending on the access
control of those methods and variables

You need to understand two different access issues:
- Whether method code in one class can access a member of another class
- Whether a subclass can inherit a member of its superclass

Three ways to access a method:
- Invoking a method declared in the same class
- Invoking a method using a reference of the class
- Invoking an inherited method

The first concrete subclass of an abstract class must implement all abstract
methods of the superclass.

nonaccess modifiers:
- abstract OCA
- static OCA
- final OCA
- synchronized
- native
- strictfp
- transient
- volatile

method or overloaded?
- Yes main method can be overloaded 
- No main method cannot be overriden as it is static or class method

[Flashcards](http://www.cram.com/user/ConchubhairtheWhiteFox)

[Controlling Access to Members of a Class](http://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

| Modifier    | Class | Package | Subclass | World
| :-----------|:------|:--------|:---------|:------ |
| public      |  y    |    y    |    y     |   y    |
| protected   |  y    |    y    |    y     |   n    |
| no modifier |  y    |    y    |    n     |   n    |
| private     |  y    |    n    |    n     |   n    |

y: accessible
n: not accessible

For the purposes of discussing the scope of variables, we can say that there are four
basic scopes:
- Static variables have the longest scope; they are created when the class is
loaded, and they survive as long as the class stays loaded in the Java Virtual
Machine (JVM).
- Instance variables are the next most long-lived; they are created when a new
instance is created, and they live until the instance is removed.
- Local variables are next; they live as long as their method remains on the stack.
	- Local variables can be alive and still be "out of scope."
	- Local variables are sometimes called stack, temporary, automatic, or method variables
- Block variables live only as long as the code block is executing.

Default Values for Primitives and Reference Types

| Variable Type  | Default Value |
|:---------------|:------------- |
| Object reference | null (not referencing any object) |
| byte , short , int , long | 0 |
| float , double | 0.0 |
| boolean | false |
| char | '\u0000'

Variable types
---------------
1. Primitive data type -> int val = 90, val : 90 (byte, short, int, long) (float, double) (char) (boolean)
2. Object reference variables -> Student st = new Student();

JVM starts it's divided into 2 sections Heap and Stack

HEAP
----
Objects are always created in heap
1000x: StudentObj, val : 90 - instance variable

class_data
----------
100x: Student.class, staticVariables -> val : 90

STACK
-----
Main_Stack
----------
val: 90 - local variable 
st: 1000x

Java has four relational operators that can be used to compare any combination of
integers, floating-point numbers, or characters:

+ ">" Greater than
+ ">=" Greater than or equal to
+ "<" Less than
+ "<=" Less than or equal to

*If either operand is a String , the + operator becomes a String concatenation
operator. If both operands are numbers, the + operator is the addition operator.*

The logical operators ( && , || , & , | , and ^ ) can be used only to evaluate two boolean expressions.

Ternary
Exp1 ? Exp2 : Exp3
Condition ? true : false;

Ternary nested
Exp1 ? (ExpA ? ExpB : ExpC) : Exp3
Condition ? (second condition ? true : false) false;
System.out.println(n >= 0 ? (n % 2 == 1 ? "Positive Odd" : "Positive Even") : "Negitive";

Switch
``` 
switch(variable / expression)
{
	case val1 : statement1;
				break;
	case val2 : statement2;
				break;
	...
	case valN : statementN;
				break;
	default   : statement;
				break;
}
```

chained methods

result = method1().method2().method3();


Instantiating a Two-Dimensional Array
```
array_identifier = new type [number_of_arrays] [length];
int[][] yearlySales = new int[5][4];
yearlySales[0][0] = 1000;
yearlySales[0][1] = 1500;
yearlySales[0][2] = 1800;
yearlySales[1][0] = 1000;
yearlySales[3][3] = 2000;
```
|		   |Quarter 1|Quarter 2|Quarter 3|Quarter 4|
|:-------- |:------- |:------- |:------- |:------- |
|Year 1    | 1000	 |	1500   | 1800    |         |
|Year 2    | 1000    |		   |         |         |
|Year 3    |		 |		   |         |         |
|Year 4    |		 |		   |         |  2000   |
|Year 5    |		 |		   |         |         |

## Resources

## Linux
[Gnome Terminator](http://gnometerminator.blogspot.ie/p/introduction.html)

[VSCode](https://code.visualstudio.com/)

Install OpenJDK
- sudo apt-get update
- java -version
- sudo apt-get install default-jdk

```
java version "1.7.0_95"
OpenJDK Runtime Environment (IcedTea 2.6.4) (7u95-2.6.4-0ubuntu0.14.04.1)
OpenJDK 64-Bit Server VM (build 24.95-b01, mixed mode)
```
## Windows
[PowerShell](https://msdn.microsoft.com/en-us/mt173057.aspx)

[VSCode](https://code.visualstudio.com/)

## On-line
[ecollege](http://www.ecollege.ie/moodle/course/info.php?id=55)

[Java docs](http://docs.oracle.com/javase/8/)

[JavaRanch](http://www.javaranch.com/)

[Main method](http://www.dickbaldwin.com/java/Java014.htm)

[Why Main method](http://java67.blogspot.ie/2012/08/what-is-main-method-in-java-why-main-is.html)

[Pass values to methods](http://www.dummies.com/how-to/content/how-to-pass-values-to-methods-in-java.html)

[Primitive Vs Reference](http://pages.cs.wisc.edu/~bahls/cs302/PrimitiveVsReference.html)

[Fibonacci](http://crunchify.com/write-java-program-to-print-fibonacci-series-upto-n-number/)
[Swap Numbers](http://www.java2novice.com/java-interview-programs/swap-two-numbers/)
![](http://educateinspirechange.org/wp-content/uploads/2014/08/fibonacci_spiral.jpg)

### Books
Kathy Sierra, Bert Bates - OCA OCP Java SE 7 Programmer I & II Study Guide

Mala Gupta - OCA Java SE 7 Programmer I Certification Guide Prepare for the 1Z0-803 exam

[free-programming-books](https://github.com/vhf/free-programming-books/blob/master/free-programming-books.md)
