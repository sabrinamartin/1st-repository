Logical Sentence Puzzle README

Introduction
---------------
The purpose of this project is to create the corresponding methods/classes for the given code that Mr. Kuzsmaul provided. 

Specifications
---------------
This program fulfills all of the requirements in ths project to the best of 
my understanding. It contains the PropositionConstant, LogicalSentence,
TruthAssignment, Negation, and Conjunction. Each have their respective
attributes and constructors. The findMatch() method successfully returns
the index of the character before the 1st closed parentheses and the 
truthTable() method prints out the corresponding binary truth table 
for the argument.

Errors
---------------
There are no errors in the program. There is a possibility that my
truthTable() or findMatch() methods do not function the way that
Mr. Kuszmaul may have envisioned but this is how I interpreted the assignment.

Overview of the Code
---------------
The new code that I added begins with attributes and constructors for the LogicalSentence class. The attribute is a PropositionConstant and there are two constructors. One constructor takes a PropositionConstant in the argument and the second constructor is a default constructor. Next, I created the PropositionConstant class whose only attribute is the name of the string. The next class I created was Negation. Negation is a subclass of LogicalSentence. In its evaluate() method, it returns the opposite of the truth assignment of ls since it is a negation. The Conjunction class is similar in the regard that it is a subclass of LogicalSentence. It is different because its evaluate() method returns true if the first AND second logical sentence have the same truth assignment. The TruthAssignment class lacks code because it is a subclass of HashMap. The PropositionConstant is the key and the boolean is the value. Because of this, there is no need to write attributes or constructors.

The final part of the puzzle were two methods. The first method, findMatch() finds the index of the character right before the first close parentheses. It does this by calling indexOf() on the string where in the argument is a closed parentheses. Then it subtracts one to get the index of the character right before that parentheses. Then next method, truthTable()uses base two raised to the power of the length of the array, minus 1 to get the possible number of rows for the table. Then, based on the row number, it converts that number to a binary string.

Major Challenges
---------------
As usual, it took me a while to understand the project. But research definitely helped me. A lot of the time, I was worried if I was doing things wrong but I completed the project to the best of my understanding. Even if my methods may not be completely correct, I still learned some things about classes and overall I am a bit more fluent in Java.

Acknowledgments
---------------
I must thank online resources for helping me in the completion of this project. JavaDocs (docs.oracle.com) was helpful for looking up methods and their correct corresponding arguments. stackoverflow.com was also helpful because it helped me find a way to turn my numbers into binary strings. Lastly, I would like to thank my neighbor John for answering a couple of my questions about classes.
