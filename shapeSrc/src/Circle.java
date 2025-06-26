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