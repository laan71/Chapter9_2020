public class Rectangle {

    /* Follow the example of the Circle class in  Section 9.2, design a class named Rectangle to represent a rectangle.
       The class contains:
       2 double data fields named width and height. The default value for both are 1.
       A no-arg constructor that creates a default rectangle.
       A constructor that creates a rectangle with the specified width and height (1).
       A method named getArea() that returns the area of this rectangle.
       A method named getPerimeter() that returns the perimeter.

       Draw the UML diagram for the class then implement the class. Write a test program that creates 2 Rectangle
       objects - one with width 4 and height 40, and the other with width 3.5 and height 35.9.
       Display the width, height, area and perimeter of each rectangle in this order.
    */

    // data fields with default values
    double width = 1;
    double height = 1;

    // no-arg constructor
    Rectangle() {
    }

    // constructor that creates a rectangle with the specified width and height
    Rectangle(double specifiedWidth, double specifiedHeight){
        width = specifiedWidth;
        height = specifiedHeight;
    }

    // method named getArea() that returns the area of the rectangle
    double getArea(){
        return width * height;
    }

    // method named getPerimeter() that returns the perimeter
    double getPerimeter(){
        return width * 2 + height * 2;
    }


    // Test program that creates 2 Rectangle objects
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("The width of rectangle1 is " + rectangle1.width);
        System.out.println("The height of rectangle1 is " + rectangle1.height);
        System.out.println("The area of rectangle1 is " + rectangle1.getArea());
        System.out.println("The perimeter of rectangle1 is " + rectangle1.getPerimeter());

        System.out.println("The width of rectangle2 is " + rectangle2.width);
        System.out.println("The height of rectangle2 is " + rectangle2.height);
        System.out.println("The area of rectangle2 is " + rectangle2.getArea());
        System.out.println("The perimeter of rectangle2 is " + rectangle2.getPerimeter());
    }
}
