# roomie-roommate-matching-engine
Roommate Matching backend for [Roomie](https://github.com/JoeRoussy/roomie)

## Setup
This app uses java 1.8 and requires access to a mongodb

### Mongo
Mongo must be installed and running on your machine before trying to run the app. The version of mongo this app uses is 3.6.x
The expected schema is the same as [Roomie](https://github.com/JoeRoussy/roomie)

## Compiling
Requires JDK 1.8 and Maven.  
Build with `mvn install`. A zip will be generated containing the jar, application.properties, and a batch file to run the application.

### Running The app
The application can be run using the included `run.bat` or with the command `java -jar FindRoommate-X.X.X.jar > FindRoommate.log`

Alternatively, the application can be run from the root directory using the Spring Boot Maven plugin: `mvn spring-boot:run`.
