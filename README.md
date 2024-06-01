This package supports functionality to calculate the volume of a sphere. Make sure to clone into your local and run it. Here is how to run the application package.

1. Browser: Run the application in your local environment. In order to do this, use ./gradlew when in the root directory of the application on an IDE of your choice. Then run the application. Go to localhost:8080/volume?radius={YOUR RADIUS}, replace the curly braces.

2. Use "curl http://localhost:8080/volume?radius=1" in any CLI of your choice.



Ensure that the radius is a non-negative number as this will return an IllegalArgumentException.