# TicTacToe
***Late-term assignment***
#To instructor
* When the deploy branch was pushed to the master branch, installation for Jacoco followed.
* When we started working on Heroku, we misunderstood the instruction from a TA and thought that it could only work to push commits straight to the origin master. We had done a lot of commits in the Heroku master when we figured out that we should have made a seperate branch for Heroku, and were therefore forced to push all of our commits straight to the origin master. After having figured this out, we started pushing the Heroku commits to the right branch, WebUI. Because of this, the master includes a lot of Heroku commits that all should have been in a seperate branch.
* The game Tictactoe was first implemented as a console application, then as a web application. The assignment was mostly implemented on the group's Ubuntu machine. Java was the programming language used to implement the game.
* The program contains two classes ticTacToe.java and TicTacToe.java, we could unfortunately not delete TicTacToe.java because the remove command is not case-sensetive.
* If you want to run the program in console (instead of as a web app) you have to make changes to build.gradle. That is instead of this lines 16 - 20 in build.gradle you should insert </br>
mainClassName = "ru.sixgirlsandaguy.ticTacToe.ticTacToe" </br>
jar { </br>
	manifest { attributes("Main-Class": "ru.sixgirlsandaguy.ticTacToe.ticTacToe") }</br>
}</br>

