# GroupUs
hello hello

1. Build:

We build the project using maven (build automation tool) as configured in pom.xml file. This is part of our CI pipeline as well.

To locally build and run the project, you could use the IntelliJ IDE and import this project as maven project and right click on the main.java file in src folder to build and run it. You would see the UI window prompt out.

2. Test:

CI: This is the link to the Dropbox folder where you could see our test results including the code coverage and static code analysis results generated by our CI pipeline.
https://www.dropbox.com/sh/fly8yeosjb5yvjv/AACQMMMqd8-vJP4GavS3yp57a?dl=0

Manual: For manually run test, you could just install the maven into your laptop and the in terminal correct directory run command: mvn test

3. Install:

You could just Git clone our project from our Git Repo into your local machine and follow the instructions in build section to run this desktop APP locally.

4. Operate:

You sign up/in as a user and the search/join/post events. You could search events by category (eat, study and go home) and the searched out events would be listed in the order of distance to current location from close to far and the outdated events would be shown. Post and Join operations are just self-explanatory as the names suggest.