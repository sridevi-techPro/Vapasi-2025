public abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Area of circle of radius "+radius+" is "+calculateArea() + " sq. units.");
        System.out.println("Perimeter of circle of radius "+radius+" is "+calculatePerimeter() + " units.");
    }
    double calculateArea(){
        return Math.round(Math.PI*radius*radius);
    }
    double calculatePerimeter(){
        return Math.round(Math.PI*2*radius);
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        if(length==breadth){
            setDimensions(length);
            System.out.println("Area of Square of length "+length+" is "+calculateArea()+ " sq.units.");
            System.out.println("Perimeter of Square of length "+length+" is "+calculatePerimeter()+" units");
        }
        else
        {
            setDimensions(length,breadth);
            System.out.println("Area of Rectangle of length "+length+" and breadth "+breadth+"is "+calculateArea()+ " sq.units.");
            System.out.println("Perimeter of Rectangle of length "+length+" and breadth "+breadth+"is "+calculatePerimeter()+ " units.");
        }



    }

    @Override
    double calculateArea() {
        return length*breadth;
    }
    double calculatePerimeter(){
        return 2*(length+breadth);
    }

    public double getLength() {
        return length;
    }



    public double getBreadth() {
        return breadth;
    }



    void setDimensions(double length, double breadth){
        this.length =length;
        this.breadth =breadth;
    }
    void setDimensions(double length){
        this.length =length;
        this.breadth =length;
    }
}
class Triangle extends Shape{
    double length;
    double breadth;
    double height;
    public Triangle(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height=height;
        System.out.println("Area of Triangle of length "+length+" and breadth "+breadth+" is "+calculateArea()+ " sq.units.");
        System.out.println("Perimeter of Triangle of length "+length+" and breadth "+breadth+" and height "+height+" is "+calculatePerimeter()+ " units.");

    }

    double calculateArea() {
        return 0.5*length*breadth;
    }

    double calculatePerimeter(){
        return (length+breadth+height);
    }

}

