package com.example.newmainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class interviewpage2 extends AppCompatActivity {
    TextView question1,question2,question3,question4,question5,question6,question7,question8,question9,question10;
    TextView question11,question12,question13,question14,question15,question16,question17,question18,question19,question20;
    TextView question21,question22,question23,question24,question25,question26,question27,question28,question29,question30;
    TextView question31,question32,question33,question34,question35,question36,question37,question38,question39,question40;
    TextView question41,question42,question43,question44,question45,question46,question47,question48,question49,question50;
    TextView question51,question52,question53,question54,question55,question56,question57,question58,question59,question60;
    TextView question61,question62,question63,question64,question65,question66,question67,question68,question69,question70;
    TextView question71,question72,question73,question74,question75,question76,question77,question78,question79,question80;
    TextView question81,question82,question83,question84,question85,question86,question87,question88,question89,question90;
    TextView question91,question92,question93,question94,question95,question96,question97,question98,question99,question100;
    String text;
    TextView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interviewpage2);
        question1 =  findViewById(R.id.question1);question2 =  findViewById(R.id.question2);question3 =  findViewById(R.id.question3);question4 =  findViewById(R.id.question4);
        question5 =  findViewById(R.id.question5);question6 =  findViewById(R.id.question6);question7 =  findViewById(R.id.question7);question8 =  findViewById(R.id.question8);
        question9 =  findViewById(R.id.question9);question10 = findViewById(R.id.question10);question11 = findViewById(R.id.question11);question12 = findViewById(R.id.question12);
        question13 = findViewById(R.id.question13);question14 = findViewById(R.id.question14);question15 = findViewById(R.id.question15);question16 = findViewById(R.id.question16);
        question17 = findViewById(R.id.question17);question18 = findViewById(R.id.question18);question19 = findViewById(R.id.question19);question20 = findViewById(R.id.question20);
        question21 = findViewById(R.id.question21);question22 = findViewById(R.id.question22);question23 = findViewById(R.id.question23);question24 = findViewById(R.id.question24);
        question25 = findViewById(R.id.question25);question26 = findViewById(R.id.question26);question27 = findViewById(R.id.question27);question28 = findViewById(R.id.question28);
        question29 = findViewById(R.id.question29);question30 = findViewById(R.id.question30);question31 = findViewById(R.id.question31);question32 = findViewById(R.id.question32);
        question33 = findViewById(R.id.question33);question34 = findViewById(R.id.question34);question35 = findViewById(R.id.question35);question36 = findViewById(R.id.question36);
        question37 = findViewById(R.id.question37);question38 = findViewById(R.id.question38);question39 = findViewById(R.id.question39);question40 = findViewById(R.id.question40);
        question41 = findViewById(R.id.question41);question42 = findViewById(R.id.question42);question43 = findViewById(R.id.question43);question44 = findViewById(R.id.question44);
        question45 = findViewById(R.id.question45);question46 = findViewById(R.id.question46);question47 = findViewById(R.id.question47);question48 = findViewById(R.id.question48);
        question49 = findViewById(R.id.question49);question50 = findViewById(R.id.question50);
        question51 = findViewById(R.id.question51);question52 = findViewById(R.id.question52);question53 = findViewById(R.id.question53);question54 = findViewById(R.id.question54);
        question55 = findViewById(R.id.question55);question56 = findViewById(R.id.question56);question57 = findViewById(R.id.question57);question58 = findViewById(R.id.question58);
        question59 = findViewById(R.id.question59);question60 = findViewById(R.id.question60);question61 = findViewById(R.id.question61);question62 = findViewById(R.id.question62);
        question63 = findViewById(R.id.question63);question64 = findViewById(R.id.question64);question65 = findViewById(R.id.question65);question66 = findViewById(R.id.question66);
        question67 = findViewById(R.id.question67);question68 = findViewById(R.id.question68);question69 = findViewById(R.id.question69);question70 = findViewById(R.id.question70);
        question71 = findViewById(R.id.question71);question72 = findViewById(R.id.question72);question73 = findViewById(R.id.question73);question74 = findViewById(R.id.question74);
        question75 = findViewById(R.id.question75);question76 = findViewById(R.id.question76);question77 = findViewById(R.id.question77);question78 = findViewById(R.id.question78);
        question79 = findViewById(R.id.question79);question80 = findViewById(R.id.question80);question81 = findViewById(R.id.question81);question82 = findViewById(R.id.question82);
        question83 = findViewById(R.id.question83);question84 = findViewById(R.id.question84);question85 = findViewById(R.id.question85);question86 = findViewById(R.id.question86);
        question87 = findViewById(R.id.question87);question88 = findViewById(R.id.question88);question89 = findViewById(R.id.question89);question90 = findViewById(R.id.question90);
        question91 = findViewById(R.id.question91);question92 = findViewById(R.id.question92);question93 = findViewById(R.id.question93);question94 = findViewById(R.id.question94);
        question95 = findViewById(R.id.question95);question96 = findViewById(R.id.question96);question97 = findViewById(R.id.question97);question98 = findViewById(R.id.question98);
        question99 = findViewById(R.id.question99);question100 = findViewById(R.id.question100); video = findViewById(R.id.video);


        question1.setOnClickListener((View v)->{
            String text = "1) JDK:-  It stands for Java Development Kit.It is the tool necessary to compile, document and package Java programs.It contains JRE + development tools.\n\n\n" +
                    "2) JRE:- It stands for Java Runtime Environment.JRE refers to a runtime environment in which Java bytecode can be executed.It’s an implementation of the JVM which physically exists." +
                    "\n\n\n3) JVM:-  It stands for Java Virtual Machine.It is an abstract machine. It is a specification that provides a run-time environment in which Java bytecode can be executed.JVM follows three notations: Specification, Implementation, and Runtime Instance.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question2.setOnClickListener((View v)->{
            text = "main() in Java is the entry point for any Java program. It is always written as public static void main(String[] args).\n\n" +
                    "public: Public is an access modifier, which is used to specify who can access this method. Public means that this Method will be accessible by any Class.\n\n" +
                    "static: It is a keyword in java which identifies it is class-based. main() is made static in Java so that it can be accessed without creating the instance of a Class. In case, main is not made static then the compiler will throw an error as main() is called by the JVM before any objects are made and only static methods can be directly invoked via the class. \n\n" +
                    "void: It is the return type of the method. Void defines the method which will not return any value.\n\n" +
                    "main: It is the name of the method which is searched by JVM as a starting point for an application with a particular signature only. It is the method where the main execution occurs.\n\n" +
                    "String args[]: It is the parameter passed to the main method.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question3.setOnClickListener((View v)-> {
            String text = "Java is called platform independent because of its byte codes which can run on any system irrespective of its underlying operating system.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question4.setOnClickListener((View v)-> {
            String text = "Java is not 100% Object-oriented because it makes use of eight primitive data types such as boolean, byte, char, int, float, double, long, short which are not objects.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question5.setOnClickListener((View v)-> {
            String text = "Wrapper classes convert the Java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they “wrap” the primitive data type into an object of that class. Refer to the below image which displays different primitive type, wrapper class and constructor argument.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question6.setOnClickListener((View v)-> {
            String text ="In Java, constructor refers to a block of code which is used to initialize an object. It must have the same name as that of the class. Also, it has no return type and it is automatically called when an object is created.\n\n" +
                    "There are two types of constructors:\n\n" +
                    "Default Constructor: In Java, a default constructor is the one which does not take any inputs. In other words, default constructors are the no argument constructors which will be created by default in case you no other constructor is defined by the user. Its main purpose is to initialize the instance variables with the default values. Also, it is majorly used for object creation.\n\n" +
                    "Parameterized Constructor: The parameterized constructor in Java, is the constructor which is capable of initializing the instance variables with the provided values. In other words, the constructors which take the arguments are called parameterized constructors.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question7.setOnClickListener((View v)-> {
            String text ="Singleton class is a class whose only one instance can be created at any given time, in one JVM. A class can be made singleton by making its constructor private.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question8.setOnClickListener((View v)-> {
            String text = "Equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic.\n\n" +
                    "“==” or equality operator in Java is a binary operator provided by Java programming language and used to compare primitives and objects. public boolean equals(Object o) is the method provided by the Object class. The default implementation uses == operator to compare two objects. For example: method can be overridden like String class. equals() method is used to compare the values of two objects.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question9.setOnClickListener((View v)-> {
            String text ="Array List is not synchronized.Array List is fast as it’s non-synchronized.If an element is inserted into the Array List, it increases its Array size by 50%.Array List does not define the increment size.Array List can only use Iterator for traversing an Array List." +
                    "\n\n Vector is synchronized.Vector is slow as it is thread safe.Vector defaults to doubling size of its array.Vector defines the increment size.Vector can use both Enumeration and Iterator for traversing.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question10.setOnClickListener((View v)-> {
            String text ="1) Memory: Stack memory is used only by one thread of execution while Heap memory is used by all the parts of the application.\n\n2) Access: Stack memory can’t be accessed by other threads while Objects stored in the heap are globally accessible."
                    +"\n\n3) Memory Management: Follows LIFO manner to free memory while Memory management is based on the generation associated with each object.\n\n4) Lifetime: Exists until the end of execution of the thread while Heap memory lives from the start till the end of application execution."
                    +"\n\n5) Usage: Stack memory only contains local primitive and reference variables to objects in heap space while Whenever an object is created, it’s always stored in the Heap space.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer),text);
            startActivity(intent);
        });
        question11.setOnClickListener((View v)-> {
            String text = "Packages in Java, are the collection of related classes and interfaces which are bundled together. By using packages, developers can easily modularize the code and optimize its reuse. Also, the code within the packages can be imported by other classes and reused. Below I have listed down a few of its advantages:\n\n\n" +
                    "1) Packages help in avoiding name clashes\n\n2) They provide easier access control on the code\n\n" +
                    "3) Packages can also contain hidden classes which are not visible to the outer classes and only used within the package\n\n" +
                    "4) Creates a proper hierarchical structure which makes it easier to locate the related classes";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question12.setOnClickListener((View v)-> {
            String text = "Java doesn’t use pointers because they are unsafe and increases the complexity of the program. Since, Java is known for its simplicity of code, adding the concept of pointers will be contradicting. Moreover, since JVM is responsible for implicit memory allocation, thus in order to avoid direct access to memory by the user,  pointers are discouraged in Java.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question13.setOnClickListener((View v)-> {
            String text = "JIT stands for Just-In-Time compiler in Java. It is a program that helps in converting the Java bytecode into instructions that are sent directly to the processor. By default, the JIT compiler is enabled in Java and is activated whenever a Java method is invoked." +
                    " The JIT compiler then compiles the bytecode of the invoked method into native machine code, compiling it “just in time” to execute. Once the method has been compiled, the JVM summons the compiled code of that method directly rather than interpreting it. This is why it is often responsible for the performance optimization of Java applications at the run time.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question14.setOnClickListener((View v)-> {
            String text = "In Java, access modifiers are special keywords which are used to restrict the access of a class, constructor, data member and method in another class. Java supports four types of access modifiers:\n\n" +
                    "1) Default\n2) Private\n3) Protected\n4) Public";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question15.setOnClickListener((View v)-> {
            String text = "A class in Java is a blueprint which includes all your data.  A class contains fields (variables) and methods to describe the behavior of an object. Let’s have a look at the syntax of a class.\n\n\n" +
                    "class Abc {\nmember variables // class body\nmethods}";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question16.setOnClickListener((View v)-> {
            String text = "An object is a real-world entity that has a state and behavior. An object has three characteristics:\n\n" +
                    "1) State\n2) Behavior\n3) Identity\n\nAn object is created using the ‘new’ keyword. For example:\n\nClassName obj = new ClassName();";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question17.setOnClickListener((View v)-> {
            String text = "Object-oriented programming or popularly known as OOPs is a programming model or approach where the programs are organized around objects rather than logic and functions. In other words, OOP mainly focuses on the objects that are required to be manipulated instead of logic." +
                    " This approach is ideal for the programs large and complex codes and needs to be actively updated or maintained.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question18.setOnClickListener((View v)-> {
            String text = "Object-Oriented Programming or OOPs is a programming style that is associated with concepts like:\n\n" +
                    "1)Inheritance: Inheritance is a process where one class acquires the properties of another.\n\n" +
                    "2)Encapsulation: Encapsulation in Java is a mechanism of wrapping up the data and code together as a single unit.\n\n" +
                    "3)Abstraction: Abstraction is the methodology of hiding the implementation details from the user and only providing the functionality to the users.\n\n" +
                    "4)Polymorphism: Polymorphism is the ability of a variable, function or object to take multiple forms.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question19.setOnClickListener((View v)-> {
            String text = "In Java, a local variable is typically used inside a method, constructor, or a block and has only local scope. Thus, this variable can be used only within the scope of a block. The best benefit of having a local variable is that other methods in the class won’t be even aware of that variable." +
                    "\n\nExample\n\nif(x > 100)\n{\nString test = \"ankit\";\n}" +
                    "\n\n\nWhereas, an instance variable in Java, is a variable which is bounded to its object itself. These variables are declared within a class, but outside a method. Every object of that class will create it’s own copy of the variable while using it." +
                    "Thus, any changes made to the variable won’t reflect in any other instances of that class and will be bound to that particular instance only." +
                    "\n\nclass Test{\npublic String EmpName;\npublic int empAge;\n}";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question20.setOnClickListener((View v)-> {
            String text = "Method : (1). Used to represent the behavior of an object (2). Must have a return type (3). Needs to be invoked explicitly (4). No default method is provided by the compiler (5). Method name may or may not be same as class name\n\n\n" +
                    "Constructor :(1). Used to initialize the state of an object (2). Do not have any return type (3). Is invoked implicitly (4). A default constructor is provided by the compiler if the class has none (5). Constructor name must always be the same as the class name";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question21.setOnClickListener((View v)-> {
            String text = "final is a special keyword in Java that is used as a non-access modifier. A final variable can be used in different contexts such as:\n\n\n" +
                    "final variable\n" +
                    "When the final keyword is used with a variable then its value can’t be changed once assigned. In case the no value has been assigned to the final variable then using only the class constructor a value can be assigned to it.\n\n\n" +
                    "final method\nWhen a method is declared final then it can’t be overridden by the inheriting class.\n\n\n" +
                    "final class\nWhen a class is declared as final in Java, it can’t be extended by any subclass class but it can extend other class.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question22.setOnClickListener((View v)-> {
            String text = "break : (1). Can be used in switch and loop (for, while, do while) statements (2). It causes the switch or loop statements to terminate the moment it is executed"+
                    "(3). It terminates the innermost enclosing loop or switch immediately\n\n\ncontinue : (1). Can be only used with loop statements (2). It doesn’t terminate the loop but causes the loop to jump to the next iteration (3). A continue within a loop nested with a switch will cause the next loop iteration to execute";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question23.setOnClickListener((View v)-> {
            String text = "An infinite loop is an instruction sequence in Java that loops endlessly when a functional exit isn’t met. This type of loop can be the result of a programming error or may also be a deliberate action based on the application behavior. An infinite loop will terminate automatically once the application exits.\n\n\nFor example:\n\n" +
                    "public class InfiniteForLoopDemo\n{\npublic static void main(String[] arg) {\n\nfor(;;)\n" +
                    "System.out.println(\"Welcome!\");\n\n// To terminate this program press ctrl + c in the console.\n}\n}";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question24.setOnClickListener((View v)-> {
            String text = "In Java, super() and this(), both are special keywords that are used to call the constructor.\n\n\nthis() : (1). this() represents the current instance of a class"
                    +" (2). Used to call the default constructor of the same class (3). Used to access methods of the current class (4).  Used for pointing the current class instance"
                    +"(5). Must be the first line of a block\n\n\nsuper() :  (1). super() represents the current instance of a parent/base class (2). Used to call the default constructor of the parent/base class (3). Used to access methods of the base class (4). Used for pointing the superclass instance (5). Must be the first line of a block";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question25.setOnClickListener((View v)-> {
            String text = "Java String pool refers to a collection of Strings which are stored in heap memory. In this, whenever a new object is created, String pool first checks whether the object is already present in the pool or not. If it is present, then the same reference is returned to the variable else new object will be created in the String pool and the respective reference will be returned.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question26.setOnClickListener((View v)-> {
            String text = "Static Method :  (1). The static keyword must be used before the method name (2). It is called using the class (className.methodName) (3). They can’t access any non-static instance variables or methods\n\n\nNon-Static Method :"+ "(1) No need to use the static keyword before the method name (2). It is can be called like any general method"+
                    "(3). It can access any static method and any static variable without creating an instance of the class";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question27.setOnClickListener((View v)-> {
            String text = "In Java, constructor chaining is the process of calling one constructor from another with respect to the current object. Constructor chaining is possible only through legacy where a subclass constructor is responsible for invoking the superclass’ constructor first. There could be any number of classes in the constructor chain. Constructor chaining can be achieved in two ways:\n\n\n" +
                    "1) Within the same class using this()\n\n" +
                    "2) From base class using super()";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question28.setOnClickListener((View v)-> {
            String text = "1) String is immutable whereas StringBuffer and StringBuilder are mutable classes.\n\n" +
                    "2) StringBuffer is thread-safe and synchronized whereas StringBuilder is not. That’s why StringBuilder is faster than StringBuffer.\n\n" +
                    "3) String concatenation operator (+) internally uses StringBuffer or StringBuilder class.\n\n" +
                    "4) For String manipulations in a non-multi threaded environment, we should use StringBuilder else use StringBuffer class";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question29.setOnClickListener((View v)-> {
            String text = "The Java ClassLoader is a subset of JVM (Java Virtual Machine) that is responsible for loading the class files. Whenever a Java program is executed it is first loaded by the classloader. Java provides three built-in classloaders:\n\n" +
                    "1) Bootstrap ClassLoader\n" +
                    "2) Extension ClassLoader\n" +
                    "3) System/Application ClassLoader";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question30.setOnClickListener((View v)-> {
            String text = "In Java, string objects are immutable in nature which simply means once the String object is created its state cannot be modified. Whenever you try to update the value of that object instead of updating the values of that particular object, Java creates a new string object. Java String objects are immutable as String objects are generally cached in the String pool. Since String literals are usually shared between multiple clients, action from one client might affect the rest. It enhances security, caching, synchronization, and performance of the application. ";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question31.setOnClickListener((View v)-> {
            String text = "1. Differences between Array and ArrayList\n\n\nAn array is basic functionality provided by Java. ArrayList is part of collection framework in Java. Therefore array members are accessed using [], while ArrayList has a set of methods to access elements and modify them.\n\n"
                    +"2. Array is a fixed size data structure while ArrayList is not. One need not to mention the size of Arraylist while creating its object. Even if we specify some initial capacity, we can add more elements.\n\n"+
                    "3. Array can contain both primitive data types as well as objects of a class depending on the definition of the array. However, ArrayList only supports object entries, not the primitive data types.\n\nNote: When we do arraylist.add(1); : it converts the primitive int data type into an Integer object.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question32.setOnClickListener((View v)-> {
            String text = "In Java, Map is an interface of Util package which maps unique keys to values. The Map interface is not a subset of the main Collection interface and thus it behaves little different from the other collection types. Below are a few of the characteristics of Map interface: \n\n" +
                    "1) Map doesn’t contain duplicate keys.\n2) Each key can map at max one value.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question33.setOnClickListener((View v)-> {
            String text = "The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion." +
                    "Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question34.setOnClickListener((View v)-> {
            String text = "Polymorphism is briefly described as “one interface, many implementations”. Polymorphism is a characteristic of being able to assign a different meaning or usage to something in different contexts – specifically, to allow an entity such as a variable, a function, or an object to have more than one form. There are two types of polymorphism:\n\n1) Compile time polymorphism\n2) Run time polymorphism\n\nCompile time polymorphism is method overloading whereas Runtime time polymorphism is done using inheritance and interface.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question35.setOnClickListener((View v)-> {
            String text = "In Java, runtime polymorphism or dynamic method dispatch is a process in which a call to an overridden method is resolved at runtime rather than at compile-time. In this process, an overridden method is called through the reference variable of a superclass. Let’s take a look at the example below to understand it better.\n\n\n" +
                    "class Car {\nvoid run()\n{\nSystem.out.println(“car is running”);\n}\n}\n\nclass Audi extends Car {\nvoid run()\n{\n" +
                    "System.out.prinltn(“Audi is running safely with 100km”);\n" +
                    "}\n\npublic static void main(String args[])\n{\nCar b= new Audi();    //upcasting\nb.run();\n}\n}";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question36.setOnClickListener((View v)-> {
            String text = "Abstraction refers to the quality of dealing with ideas rather than events. It basically deals with hiding the details and showing the essential things to the user. Thus you can say that abstraction in Java is the process of hiding the implementation details from the user and revealing only the functionality to them. Abstraction can be achieved in two ways:\n\n1) Abstract Classes (0-100% of abstraction can be achieved)\n\n2) Interfaces (100% of abstraction can be achieved)";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question37.setOnClickListener((View v)-> {
            String text = "An interface in Java is a blueprint of a class or you can say it is a collection of abstract methods and static constants. In an interface, each method is public and abstract but it does not contain any constructor. Thus, interface basically is a group of related methods with empty bodies. Example:\n\n\n" +
                    "public interface Animal {\npublic void eat();\npublic void sleep();\npublic void run();\n}";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question38.setOnClickListener((View v)-> {
            String text = "Abstract Class :-  An abstract class can provide complete, default code and/or just the details that have to be overridden.In the case of an abstract class, a class may extend only one abstract class.An abstract class can have non-abstract methods.An abstract class can have instance variables.An abstract class can have any visibility: public, private, protected.If we add a new method to an abstract class then we have the option of providing default implementation and therefore all the existing code might work properly.An abstract class can contain constructors.Abstract classes are fast.\n\n\nInterfaces :-   An interface cannot provide any code at all, just the signature.A Class may implement several interfaces.All methods of an Interface are abstract.An Interface cannot have instance variables.An Interface visibility must be public (or) none.If we add a new method to an Interface then we have to track down all the implementations of the interface and define implementation for the new method.An Interface cannot contain constructors.Interfaces are slow as it requires extra indirection to find the corresponding method in the actual class.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question39.setOnClickListener((View v)-> {
            String text = "Inheritance in Java is the concept where the properties of one class can be inherited by the other. It helps to reuse the code and establish a relationship between different classes. Inheritance is performed between two types of classes:\n\n1) Parent class (Super or Base class)\n2) Child class (Subclass or Derived class)\n\n" +
                    "A class which inherits the properties is known as Child Class whereas a class whose properties are inherited is known as Parent class.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question40.setOnClickListener((View v)-> {
            String text = "Java supports four types of inheritance which are:\n\n\n1) Single Inheritance: In single inheritance, one class inherits the properties of another i.e there will be only one parent as well as one child class.\n\n\n2) Multilevel Inheritance: When a class is derived from a class which is also derived from another class, i.e. a class having more than one parent class but at different levels, such type of inheritance is called Multilevel Inheritance.\n\n\n3)Hierarchical Inheritance: When a class has more than one child classes (subclasses) or in other words, more than one child classes have the same parent class, then such kind of inheritance is known as hierarchical.\n\n\n4)Hybrid Inheritance: Hybrid inheritance is a combination of two or more types of inheritance.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question41.setOnClickListener((View v)-> {
            String text = "Method Overloading :\n1) In Method Overloading, Methods of the same class shares the same name but each method must have a different number of parameters or parameters having different types and order.\n\n2) Method Overloading is to “add” or “extend” more to the method’s behavior.\n\n3) It is a compile-time polymorphism.\n\n4) The methods must have a different signature.\n\n5) It may or may not need inheritance in Method Overloading.\n\n\n\nMethod Overriding:  \n1) In Method Overriding, the subclass has the same method with the same name and exactly the same number and type of parameters and same return type as a superclass.\n\n2) Method Overriding is to “Change” existing behavior of the method.\n\n3) It is a run time polymorphism.\n\n4) The methods must have the same signature.\n\n5) It always requires inheritance in Method Overriding.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question42.setOnClickListener((View v)-> {
            String text = "You cannot override a private or static method in Java. If you create a similar method with the same return type and same method arguments in child class then it will hide the superclass method; this is known as method hiding. Similarly, you cannot override a private method in subclass because it’s not accessible there. What you can do is create another private method with the same name in the child class. ";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question43.setOnClickListener((View v)-> {
            String text = "If a child class inherits the property from multiple classes is known as multiple inheritance. Java does not allow to extend multiple classes.\n\nThe problem with multiple inheritance is that if multiple parent classes have the same method name, then at runtime it becomes difficult for the compiler to decide which method to execute from the child class.\n\nTherefore, Java doesn’t support multiple inheritance. The problem is commonly referred to as Diamond Problem.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question44.setOnClickListener((View v)-> {
            String text = "Encapsulation is a mechanism where you bind your data(variables) and code(methods) together as a single unit. Here, the data is hidden from the outer world and can be accessed only via current class methods. This helps in protecting the data from any unnecessary modification. We can achieve encapsulation in Java by:\n\nDeclaring the variables of a class as private.\nProviding public setter and getter methods to modify and view the values of the variables.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question45.setOnClickListener((View v)-> {
            String text = "Association is a relationship where all object have their own lifecycle and there is no owner. Let’s take the example of Teacher and Student. Multiple students can associate with a single teacher and a single student can associate with multiple teachers but there is no ownership between the objects and both have their own lifecycle. These relationships can be one to one, one to many, many to one and many to many.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question46.setOnClickListener((View v)-> {
            String text = "An aggregation is a specialized form of Association where all object has their own lifecycle but there is ownership and child object can not belong to another parent object. Let’s take an example of Department and teacher. A single teacher can not belong to multiple departments, but if we delete the department teacher object will not destroy. ";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question47.setOnClickListener((View v)-> {
            String text = "Composition is again a specialized form of Aggregation and we can call this as a “death” relationship. It is a strong type of Aggregation. Child object does not have their lifecycle and if parent object deletes all child object will also be deleted. Let’s take again an example of a relationship between House and rooms. House can contain multiple rooms there is no independent life of room and any room can not belongs to two different houses if we delete the house room will automatically delete.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question48.setOnClickListener((View v)-> {
            String text = "A Marker interface can be defined as the interface having no data member and member functions. In simpler terms, an empty interface is called the Marker interface. The most common examples of Marker interface in Java are Serializable, Cloneable etc. The marker interface can be declared as follows.\n\npublic interface Serializable{\n}";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question49.setOnClickListener((View v)-> {
            String text = "Object cloning in Java is the process of creating an exact copy of an object. It basically means the ability to create an object with a similar state as the original object. To achieve this, Java provides a method clone() to make use of this functionality. This method creates a new instance of the class of the current object and then initializes all its fields with the exact same contents of corresponding fields. To object clone(), the marker interface java.lang.Cloneable must be implemented to avoid any runtime exceptions. One thing you must note is Object clone() is a protected method, thus you need to override it.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question50.setOnClickListener((View v)-> {
            String text = "Copy constructor is a member function that is used to initialize an object using another object of the same class. Though there is no need for copy constructor in Java since all objects are passed by reference. Moreover, Java does not even support automatic pass-by-value.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });

        question51.setOnClickListener((View v) -> {
            String text = "In Java, constructor overloading is a technique of adding any number of constructors to a class each having a different parameter list. The compiler uses the number of parameters and their types in the list to differentiate the overloaded constructors.\n\nclass Demo\n{\nint i;\npublic Demo(int a)\n{\ni=k;\n}\npublic Demo(int a, int b)\n{\n//body\n}\n}";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question52.setOnClickListener((View v) -> {
            text = "An error is an irrecoverable condition occurring at runtime. Such as OutOfMemory error. These JVM errors you cannot repair them at runtime. Though error can be caught in the catch block but the execution of application will come to a halt and is not recoverable.\n\n\n While exceptions are conditions that occur because of bad input or human error etc. e.g. FileNotFoundException will be thrown if the specified file does not exist. Or a NullPointerException will take place if you try using a null reference. In most of the cases it is possible to recover from an exception (probably by giving the user feedback for entering proper values etc.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question53.setOnClickListener((View v) -> {
            String text = "There are five keywords used to handle exceptions in Java:\n\n1) try\n2) catch\n3) finally \n4) throw\n5) throws";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question54.setOnClickListener((View v) -> {
            String text = "Checked Exception\n\nThe classes that extend Throwable class except RuntimeException and Error are known as checked exceptionsChecked exceptions are checked at compile-time.Example: IOException, SQLException etc.\n\n\nUnchecked Exception\n\nThe classes that extend RuntimeException are known as unchecked exceptions.Unchecked exceptions are not checked at compile-time.Example: ArithmeticException, NullPointerException etc.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question55.setOnClickListener((View v) -> {
            String text = "Final is used to apply restrictions on class, method, and variable. A final class can’t be inherited, final method can’t be overridden and final variable value can’t be changed.\n\n\nFinally is used to place important code, it will be executed whether the exception is handled or not.\n\n\nFinalize is used to perform clean up processing just before the object is garbage collected.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question56.setOnClickListener((View v) -> {
            String text = "throw keyword :-\n\nThrow is used to explicitly throw an exception.Checked exceptions can not be propagated with throw only.Throw is followed by an instance.Throw is used within the method.You cannot throw multiple exception\n\n\nthrows keyword\n\nThrows is used to declare an exception.Checked exception can be propagated with throws.Throws is followed by class.Throws is used with the method signature.You can declare multiple exception e.g. public void method()throws IOException,SQLException.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question57.setOnClickListener((View v) -> {
            String text = "The hierarchy is as follows:\n\nThrowable is a parent class of all Exception classes. There are two types of Exceptions: Checked exceptions and UncheckedExceptions or RunTimeExceptions. Both type of exceptions extends Exception class whereas errors are further classified into Virtual Machine error and Assertion error.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question58.setOnClickListener((View v) -> {
            String text = "To create you own exception extend the Exception class or any of its subclasses.\n\n\n1)class New1Exception extends Exception {  } // this will create Checked Exception\n\n\n2) class NewException extends IOException { } // this will create Checked exception\n\n\n3) class NewException extends NullPonterExcpetion { }  // this will create UnChecked exception";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question59.setOnClickListener((View v) -> {
            String text = "Exception and all of it’s subclasses doesn’t provide any specific methods and all of the methods are defined in the base class Throwable.\n\n\n" +
                    "1) String getMessage() – This method returns the message String of Throwable and the message can be provided while creating the exception through it’s constructor.\n\n\n2) String getLocalizedMessage() – This method is provided so that subclasses can override it to provide locale specific message to the calling program. Throwable class implementation of this method simply use getMessage() method to return the exception message.\n\n\n3) Synchronized Throwable getCause() – This method returns the cause of the exception or null id the cause is unknown.\n\n\n4) String toString() – This method returns the information about Throwable in String format, the returned String contains the name of Throwable class and localized message.\n\n\n5) void printStackTrace() – This method prints the stack trace information to the standard error stream, this method is overloaded and we can pass PrintStream or PrintWriter as an argument to write the stack trace information to the file or stream.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question60.setOnClickListener((View v) -> {
            String text = "Process :-\n\nAn executing instance of a program is called a process.Processes must use inter-process communication to communicate with sibling processes.Processes can only exercise control over child processes.Any change in the parent process does not affect child processes.Run in separate memory spaces.\tProcess is controlled by the operating system.Processes are independent.\n\n\nThread :-\n\nA thread is a subset of the process.Threads can directly communicate with other threads of its process.Threads can exercise considerable control over threads of the same process.Any change in the main thread may affect the behavior of the other threads of the process.Run in shared memory spaces.Threads are controlled by programmer in a program.Threads are dependent.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question61.setOnClickListener((View v) -> {
            String text = "Finally block is a block which always executes a set of statements. It is always associated with a try block regardless of any exception that occurs or not. \n\nYes, finally will not be executed if the program exits either by calling System.exit() or by causing a fatal error that causes the process to abort.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question62.setOnClickListener((View v) -> {
            String text = "Synchronization refers to multi-threading. A synchronized block of code can be executed by only one thread at a time. As Java supports execution of multiple threads, two or more threads may access the same fields or objects. Synchronization is a process which keeps all concurrent threads in execution to be in sync. Synchronization avoids memory consistency errors caused due to inconsistent view of shared memory. When a method is declared as synchronized the thread holds the monitor for that method’s object. If another thread is executing the synchronized method the thread is blocked until that thread releases the monitor. ";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question63.setOnClickListener((View v) -> {
            String text = "Yes we can have multiple catch blocks under single try block but the approach should be from specific to general";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question64.setOnClickListener((View v) -> {
            String text = "OutOfMemoryError is the subclass of java.lang.Error which generally occurs when our JVM runs out of memory.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question65.setOnClickListener((View v) -> {
            String text = "A thread is the smallest piece of programmed instructions which can be executed independently by a scheduler. In Java, all the programs will have at least one thread which is known as the main thread. This main thread is created by the JVM when the program starts its execution. The main thread is used to invoke the main() of the program.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question66.setOnClickListener((View v) -> {
            String text = "In Java, threads can be created in the following two ways:-\n\n1) By implementing the Runnable interface.\n2)By extending the Thread";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question67.setOnClickListener((View v) -> {
            String text = "Garbage collection in Java a program which helps in implicit memory management. Since in Java, using the new keyword you can create objects dynamically, which once created will consume some memory. Once the job is done and there are no more references left to the object, Java using garbage collection destroys the object and relieves the memory occupied by it. Java provides four types of garbage collectors:\n\n\n1) Serial Garbage Collector\n2) Parallel Garbage Collector\n3) CMS Garbage Collector\n4) G1 Garbage Collector";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question68.setOnClickListener((View v) -> {
            String text = "The method is static because otherwise there would be ambiguity: which constructor should be called? Especially if your class looks like this:\n\npublic class JavaClass\n{\nprotected JavaClass(int x)\n{   }\npublic void main(String[] args) \n{\n\n\n}\n}\n\n\nShould the JVM call new JavaClass(int)? What should it pass for x? If not, should the JVM instantiate JavaClass without running any constructor method? because that will special-case your entire class – sometimes you have an instance that hasn’t been initialized, and you have to check for it in every method that could be called. There are just too many edge-cases and ambiguities for it to make sense for the JVM to have to instantiate a class before the entry point is called. That’s why main is static.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question69.setOnClickListener((View v) -> {
            String text = "Program compiles successfully. But at runtime throws an error “NoSuchMethodError”.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question70.setOnClickListener((View v) -> {
            String text = "1) Member Variables (Class Level Scope) : The member variables must be declared inside class (outside any function). They can be directly accessed anywhere in class\n\n\n2) Local Variables (Method Level Scope) : Variables declared inside a method have method level scope and can’t be accessed outside the method.\n\n\n3) Loop Variables (Block Scope) : A variable declared inside pair of brackets “{” and “}” in a method has scope withing the brackets only.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question71.setOnClickListener((View v) -> {
            String text = "In C++ and Java, functions can not be overloaded if they differ only in the return type. The return type of functions is not a part of the mangled name which is generated by the compiler for uniquely identifying each function. The No of arguments, Type of arguments & Sequence of arguments are the parameters which are used to generate the unique mangled name for each function. It is on the basis of these unique mangled names that compiler can understand which function to call even if the names are same(overloading).";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question72.setOnClickListener((View v) -> {
            String text = "A final variable in Java can be assigned a value only once, we can assign a value either in declaration or later.\n\nfinal int i = 10;\ni = 30; // Error because i is final.\n\n\nA blank final variable in Java is a final variable that is not initialized during declaration. Below is a simple example of blank final.\n\n// A simple blank final example\nfinal int i;\ni = 30;";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question73.setOnClickListener((View v) -> {
            String text = "1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.\n\n2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.\n\n3. HashMap is generally preferred over HashTable if thread synchronization is not needed";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question74.setOnClickListener((View v) -> {
            String text = "In Java, all objects are dynamically allocated on Heap. This is different from C++ where objects can be allocated memory either on Stack or on Heap. In C++, when we allocate abject using new(), the object is allocated on Heap, otherwise on Stack if not global or static.\n\nIn Java, when we only declare a variable of a class type, only a reference is created (memory is not allocated for the object). To allocate memory to an object, we must use new(). So the object is always allocated memory on the heap.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question75.setOnClickListener((View v) -> {
            String text = "In java, float takes 4 bytes in memory while Double takes 8 bytes in memory. Float is single precision floating point decimal number while Double is double precision decimal number.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question76.setOnClickListener((View v) -> {
            String text = "1. Using Math.random() you can generate random numbers in the range greater than or equal to 0.1 and less than 1.0\n\n2. Using Random class in package java.util";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question77.setOnClickListener((View v) -> {
            String text = "In java, main() method can't return any data and hence, it's always declared with a void return type.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question78.setOnClickListener((View v) -> {
            String text = "Yes we can create an abstract class by using abstract keyword before class name even if it doesn't have any abstract method. However, if a class has even one abstract method, it must be declared as abstract otherwise it will give an error.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question79.setOnClickListener((View v) -> {
            String text = "Interfaces are slower in performance as compared to abstract classes as extra indirections are required for interfaces. Another key factor for developers to take into consideration is that any class can extend only one abstract class while a class can implement many interfaces.\n\n\nUse of interfaces also puts an extra burden on the developers as any time an interface is implemented in a class; developer is forced to implement each and every method of interface.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question80.setOnClickListener((View v) -> {
            String text = "In java, when a package is imported, its sub-packages aren't imported and developer needs to import them separately if required.\n\nFor example, if a developer imports a package university.*, all classes in the package named university are loaded but no classes from the sub-package are loaded. To load the classes from its sub-package ( say department), developer has to import it explicitly as follows:\n\nImport university.department.*";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question81.setOnClickListener((View v) -> {
            String text = "In java, we can pass argument to a function only by value and not by reference.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question82.setOnClickListener((View v) -> {
            String text = "In java, main method must be public static in order to run any application correctly. If main method is declared as private, developer won't get any compilation error however, it will not get executed and will give a runtime error.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question83.setOnClickListener((View v) -> {
            String text = "In java, to convert an object into byte stream by serialization, an interface with the name Serializable is implemented by the class. All objects of a class implementing serializable interface get serialized and their state is saved in byte stream.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question84.setOnClickListener((View v) -> {
            String text = "Try block needs to be followed by either Catch block or Finally block or both. Any exception thrown from try block needs to be either caught in the catch block or else any specific tasks to be performed before code abortion are put in the Finally block.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question85.setOnClickListener((View v) -> {
            String text = "If an exception is raised in Try block, control passes to catch block if it exists otherwise to finally block. Finally block is always executed when an exception occurs and the only way to avoid execution of any statements in Finally block is by aborting the code forcibly by writing following line of code at the end of try block:\n\nSystem.exit(0);";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question86.setOnClickListener((View v) -> {
            String text = "The constructor of a class is invoked every time an object is created with new keyword.\n\nFor example, in the following class two objects are created using new keyword and hence, constructor is invoked two times.\n\npublic class const_example {\n\nconst_example() {\n\nsystem.out.println(\"Inside constructor\");\n}\npublic static void main(String args[]) {\n\nconst_example c1 = new const_example();\n\nconst_example c2 = new const_example();\n}\n}";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question87.setOnClickListener((View v) -> {
            String text = "String is not a primitive data type in java. When a string is created in java, it's actually an object of Java.Lang.String class that gets created. After creation of this string object, all built-in methods of String class can be used on the string object.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question88.setOnClickListener((View v) -> {
            String text = "In the above example, two objects of Java.Lang.String class are created. s1 and s3 are references to same object.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question89.setOnClickListener((View v) -> {
            String text = "In java, string objects are called immutable as once value has been assigned to a string, it can't be changed and if changed, a new object is created.\n\n" +
                    "In below example, reference str refers to a string object having value \"Value one\".\n\nString str=\"Value One\";\n\nWhen a new value is assigned to it, a new String object gets created and the reference is moved to the new object.\n\nstr=\"New Value\";";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question90.setOnClickListener((View v) -> {
            String text = " An array groups data of same primitive type and is static in nature while vectors are dynamic in nature and can hold data of different data types.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question91.setOnClickListener((View v) -> {
            String text = " Since StringBuffers are dynamic in nature and we can change the values of StringBuffer objects unlike String which is immutable, it's always a good choice to use StringBuffer when data is being changed too much. If we use String in such a case, for every data change a new String object will be created which will be an extra overhead.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question92.setOnClickListener((View v) -> {
            String text = " In java, when an object is not referenced any more, garbage collection takes place and the object is destroyed automatically. For automatic garbage collection java calls either System.gc() method or Runtime.gc() method.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question93.setOnClickListener((View v) -> {
            String text = "Constructor is called automatically when we create an object using new keyword. It's called only once for an object at the time of object creation and hence, we can't invoke the constructor again for an object after its creation.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question94.setOnClickListener((View v) -> {
            String text = "Private members of a class aren't accessible outside the scope of that class and any other class even in the same package can't access them.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question95.setOnClickListener((View v) -> {
            String text = "We can use the concept of cloning to create copy of an object. Using clone, we create copies with the actual state of an object.\n\n" +
                    "Clone() is a method of Cloneable interface and hence, Cloneable interface needs to be implemented for making object copies.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question96.setOnClickListener((View v) -> {
            String text = " Default access specifier for variables and method is package protected i.e variables and class is available to any other class but in the same package,not outside the package.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question97.setOnClickListener((View v) -> {
            String text = "There are no pointers in Java. So we can't use concept of pointers in Java.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question98.setOnClickListener((View v) -> {
            String text = "Stack and Queue both are used as placeholder for a collection of data. The primary difference between a stack and a queue is that stack is based on Last in First out (LIFO) principle while a queue is based on FIFO (First In First Out) principle.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question99.setOnClickListener((View v) -> {
            String text = "Primitive data types like int can be handled as objects by the use of their respective wrapper classes. For example, Integer is a wrapper class for primitive data type int. We can apply different methods to a wrapper class, just like any other object.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
        question100.setOnClickListener((View v) -> {
            String text = "Java provides a default no argument constructor if no explicit constructor is defined in a Java class. But if an explicit constructor has been defined, default constructor can't be invoked and developer can use only those constructors which are defined in the class.";
            Intent intent = new Intent(this, secondpage.class);
            intent.putExtra(getString(R.string.allquestionanswer), text);
            startActivity(intent);
        });
//        pdftext.setOnClickListener((View v) -> {
//            Intent intent = new Intent(this,fourthpage.class);
//            startActivity(intent);
//        });
        video.setOnClickListener((View v) ->{
            Uri uri = Uri.parse("https://youtu.be/oYXivKMSEqM");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
}