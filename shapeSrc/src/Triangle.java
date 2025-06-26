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