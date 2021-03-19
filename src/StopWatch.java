import java.util.Arrays;

public class StopWatch {

   /* Design a class named StopWatch. The class contains:
      Private data fields startTime and endTime with getter methods.
      A no-arg constructor that initializes startTime with the current time.
      A method named start() that resets the startTime to the current time.
      A method named stop() that sets the endTime to the current time.
      A method named getElapsedTime() that returns the elapsed time for the
    stopwatch in milliseconds.
    Draw the UML diagram for the class then implement the class. Write a test program
    that measures the execution time of sorting 100,000 numbers using selection sort.
    */

    // data fields for startTime and endTime
    private long startTime;
    private long endTime;

    // no-arg constructor that initializes startTime with the current time
    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    // method named start() that resets the startTime with the current time
    void start(){
        startTime = System.currentTimeMillis();
    }

    // method named stop() that sets the endTime to the current time
    void stop(){
        endTime = System.currentTimeMillis();
    }

    // method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds
    long getElapsedTime(){
        return endTime - startTime;
    }

    // getter method for startTime
    long getStartTime(){
        return startTime;
    }

    // getter method for endTime
    long getEndTime(){
        return endTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] randomNumbers = new int[100000];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random()*100);
        }

        stopWatch.start();
        Arrays.sort(randomNumbers);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}


