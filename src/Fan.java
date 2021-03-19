public class Fan {

    /* Design a class named Fan to represent a fan. The class contains:
       Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
       A private int data field named speed that specifies the speed of the fan (the default is SLOW).
       A private boolean data field named on that specifies whether the fan is on (the default is false).
       A private double data field named radius that specifies the radius of the fan (the default is 5).
       A string data field named color that specifies the color of the fan (the default is blue).
       The accessor and mutator methods for all four data fields.
       A no-arg constructor that creates a default fan.
       A method named toString() that returns a string description for the fan. If the fan is on, the method returns the
       fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and
       radius along with the string “fan is off” in one combined string.

       Draw the UML diagram for the class then implement the class. Write a test program that creates two Fan objects.
       Assign maximum speed, radius 10, color yellow, and turn it on to the first object. Assign medium speed, radius 5,
       color blue, and turn it off to the second object. Display the objects by invoking their toString method.
     */

    // 3 constants named SLOW, MEDIUM and FAST with the values 1, 2 and 3
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    // private int data field name speed that specifies the speed of the fan (the default is SLOW)
    private int speed = SLOW;

    // private boolean data field named on that specifies whether the fan is on (the default is false)
    private boolean on = false;

    // private double data field named radius that specifies the radius of the fan (the default is 5)
    private double radius = 5;

    // string data field named color that specifies the color of the fan (the default is blue)
    String color = "blue";

    // no-arg constructor that creates a default fan
    Fan(){}

    int getSpeed(){
        return speed;
    }

    void setSpeed(int newSpeed){
        speed = newSpeed;
    }

    boolean getOn(){
        return on;
    }

    void setOn(boolean state){
        on = state;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    String getColor(){
        return color;
    }

    void setColor(String newColor){
        color = newColor;
    }

    // method named toString() that returns a string description for the fan
    public String toString(){
        if (on)
            return "\nFan speed: " + speed + ", color: " + color + ", radius: " + radius;
        else
            return "\nFan is off, colour: " + color + ", radius: " + radius;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
