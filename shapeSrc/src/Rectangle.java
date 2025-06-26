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