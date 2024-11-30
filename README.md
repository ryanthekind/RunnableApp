# Java App From Start To Finish

This is a simple Java application which starts from
The IDE I used was Eclipse 

## Features
- The command line will open with your println. Once you hit Enter the command line will close.

## How it works
1. Create a simple Hello World app, create a Main class with a name like RunnableApp with a simple "Hello World" in the print line and a Scanner to trigger a users input, test and save.
2. Export file as a "Runnable JAR file":
3. Export your project in your IDE
4. Select your classNames from the dropdown as the launch configuration
5. Specify the export location (I chose my desktop), give the JAR file a name like HelloWorldApp, and click Finish
   
## You Have a Jar File!

Congratulations! You have a Jar file. Now you need to test if it runs.
1. Open your command line and in the cmd write:

java -jar "C:\path\to\HelloWorldApp.jar"

if it runs, then you're good to move on to the next step and create your shortcut.
If it doesn't ru, then there's a problem with the JAR file or Java runtime.

## Create Your Shortcut

1. first find the path to your jdk. in the command line you can type "where java." Once you know the jdk version you can go to the next step.


2. Right click on the desktop, New > Shortcut

"C:\Program Files\Java\jdk-[version]\bin\javaw.exe" -jar "C:\full\path\to\HelloWorldApp.jar"

- You can use javaw.exe or java.exe in this case because it's a simple command line program

3. Select Next, give the shortcut a name and select Finish.


## Open Your New Shortcut

Congratulations! you've created a Java App from start to Finish!
   
