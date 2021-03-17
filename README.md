# TODOLIST
# A command line application in JAVA
### Project Brief:
The project is to develop a software application that can do "To do list" functionalities.
The To do list application will be used to create a new task. There should be also a feature that enable to insert title and due date to the task. Then the tasks must be categorized based on the the Project they belong.
The App must have a text base user interface that can be archived using command line.
Editing, mark tasks as done and removing tasks are the main required functionalities of the App.
Quit the task and save the current task list to file are also additional requirements. Finally, the app required to restart and recovered to the former state.
##Getting started
The application can be run from Gradle
### Run with Gradle
The application can be started with Gradle's run command, as shown below.
.....
gradle run --console plain
.....

## Basic features
* Models task with the following details,
    - task title
    - due date todo the task
    - completion status of task
    - categorise under project, if any
* Display a collection of tasks that can be sorted,
    - by date
    - by project
      *The ability to,
    - add a task
    - edit task
    - save or remove
* Support a text based user interface
* Load and save task list to data files
## Class diagram
-The program has contained 4 classes
-Main
-Reader
-Task
-TaskList
