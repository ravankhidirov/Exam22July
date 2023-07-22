# Exam22July


TASK 3
The class name and any optional type parameters are listed in the class header before the main constructor. Primary constructors have no code
inside. The parameters in the primary constructor can be then used as initial values to declare other class properties. Primary constructor
parameters can initialized inside the brackets.


TASK 4
We might need to construct a class just to hold data at some point. To establish a data class in such circumstances, we can mark the class
as data. For example, 
data class Student (var name: String,
                    var age: Int,
                    var marks: Int
)

There must be at least one parameter in the data class primary constructor.

TASK 5
There are numerous ways to initialize an array with values. I'm gonna show them in the following lines
val myArray = arrayOf(1, 2, 3, 4, 5)
val myIntArray = arrayOf<Int>(1, 2, 3, 4, 5)
val myStringArray = arrayOf<String>("apple", "banana", "orange")
val myIntArray = arrayOf<Int>(1, 2, 3, 4, 5)
val myStringArray = arrayOf<String>("apple", "banana", "orange")
val myArray = Array(5) { index -> index * 2 }


TASK 6
Data types with 'val' once initialized, then cannot be altered. They are constant throughout the exucution of the program. However, the 
value of the 'var' - variables can be canged later on.

TASK 7
Strings can be concatanated simply by using '+' symbol.


TASK 8
The declaration of a vaariale with '?' means that later on in the program the value of the variable can be 'null'.

TASK 11
onCreate() , onStart() , onResume() , onPause() , onStop() , and onDestroy()



TASK 12
A file called AndroidManifest.xml must be present at the root of the project source set for each app project. The manifest file provides
crucial information about your app to Google Play, the Android operating system, and the Android build tools. AndroidManifest.xml file
contains various sections every of which has its own specific purpose. 

TASK 13
Users frequently experience a jump from one Android application to another as part of the overall process. 
Passing the Intent to the system enables this process of moving users between applications. Intents are 
typically used to move between different activities within a single application. they 
can also be used to switch from one application to another.

TASK 14
constraint, linear,relative, frame, table and etc. 


