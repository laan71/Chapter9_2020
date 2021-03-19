public class RegularPolygon {

    /* In an n-sided regular polygon, all sides have the same length and all angles have the same degree
    (i.e., the polygon is both equilateral and equiangular).
    Design a class named RegularPolygon that contains:
    A private int data field named n that defines the number of sides in the polygon with default value 3.
    A private double data field named side that stores the length of the side with default value 1.
    A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
    A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
    A no-arg constructor that creates a regular polygon with default values.
    A constructor that creates a regular polygon with the specified number of sides and length of side, centered
    at (0, 0).
    A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and
    y-coordinates.
    The accessor and mutator methods for all data fields.
    The method getPerimeter() that returns the perimeter of the polygon.
    The method getArea() that returns the area of the polygon.

    Draw the UML diagram for the class then implement the class. Write a test program that creates three RegularPolygon
    objects, created using the no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4,5.6, 7.8).
    For each object, display its perimeter and area.
    */

    // private int and double data fields with default values
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    // no-arg constructor that creates a regular polygon with default values
    RegularPolygon() {
    }

    // constructor that creates a regular polygon with the specified number of sides and length of side, centeret at (0, 0)
    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    // constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates
    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    int getN(){
        return n;
    }

    void setN(int n){
        this.n = n;
    }

    double getSide(){
        return side;
    }

    void setSide(double side){
        this.side = side;
    }

    double getX(){
        return x;
    }

    void setX(double x){
        this.x = x;
    }

    double getY(){
        return y;
    }

    void setY(double y){
        this.y = y;
    }

    double getPerimeter(){
        return n*side;
    }

    double getArea(){
        return (n*(Math.pow(side,2))/(4*Math.tan(Math.PI/n)));
    }

    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("The perimeter of Polygon1 is " + regularPolygon1.getPerimeter());
        System.out.println("The area of Polygon1 is " +regularPolygon1.getArea());
        System.out.println("The perimeter of Polygon2 is " +regularPolygon2.getPerimeter());
        System.out.println("The area of Polygon2 is " +regularPolygon2.getArea());
        System.out.println("The perimeter of Polygon3 is " +regularPolygon3.getPerimeter());
        System.out.println("The area of Polygon3 is " +regularPolygon3.getArea());
    }
}
