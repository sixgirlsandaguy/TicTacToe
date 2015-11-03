# Design report
##Introduction

The late-term assignment was to develop a simple TicTacToe program using the technical infrastructure to support agile development. (alveg eins og í verkefnalýsingu). The program is executable in console and online. Tictactoe is a game for two players in one computer. (eigum við að útskýra myllu). The group Sixgirlsandaguy developed the program. The group members are: Agnes Jóhannesdóttir, Elín Rós Hauksdóttir, Sigurlaug Guðrún Jóhannesdóttir, Vala Rún Valtýsdóttir, Huldar Bjarmi Halldórsson, Laufey Rut Guðmundsdóttir og Margrét Anna Kristjánsdóttir.

##Design
The game Tictactoe was first implemented as a console application, then as a web application. The assignment was mostly implemented on the group's Ubuntu machine. Java was the programming language used to implement the game.

##Programming rules
* A new block should be opened and closed after newline.
* All functions should have descriptive names.
* Help-functions should end with _help.
* Other functions should have camelCasing.
* Constants should be declared in all capital letters.
* Official [Java programming style guidelines](http://www.oracle.com/technetwork/java/codeconvtoc-136057.html) should be followed.


//Fólk forritar í sínu eigin umhverfi.

##Protocol
* Pair programming should be practised for all code development.
* All business logic should be coded using TDD.
* Code that is committed must build and run.
* Before pushing code on Github it should be tested on the group's Ubuntu machine.
* When code is committed it should have a descriptive comment of the functionality implemented.
* A branch should be made to implement each feature.
* When code is pushed from a branch to master a pull request should be made.



##Class Diagram
The class diagram was the first thing we did in the assignment. During the basic business logic implementation, the class diagram changed as we discovered improvement in our design of the program.
The class TicTacToe is the main class that contains that ties all the other classes together, it inherits the other classes. The Move class checks if the user's input is valid for the game. The Board class takes the legal user input and marks the cell that the user chose, unless that cell is already occupied. Player documents the player's token. The results class declares the winner after the game's logic. 

![class diagram](https://scontent-ams3-1.xx.fbcdn.net/hphotos-xpa1/v/t34.0-12/12204970_10207144691592325_560331340_n.jpg?oh=92e7a6ecd1f38684d67021cc7df90a62&oe=563A68E5)




