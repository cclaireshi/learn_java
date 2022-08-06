package Inheritance;

class Shape {
    // private int sideLength; 
    private String name; 
    private int perimeter; 

    public double area;
    public int numOfSides; 
    public double angleSize; 
    
    public Shape() {
        this.numOfSides = 1;
        System.out.println("I'm in Shape's default constructor");
    }

    // constructor 
    public Shape(int numOfsides) {
        this.numOfSides = numOfsides; 
        System.out.println("in Shape's argument list constructor");
    }

    public double setarea(double base, double height) {
        return this.area = base * height;
    }
    
    public double setInternalAngleSize() {
        this.angleSize = (this.numOfSides - 2) * 180 / this.numOfSides; 
        return this.angleSize; 
    }
    public void setname() {
        setshapename(this.numOfSides);
    }
    
    private void setshapename(int numberOfsides) {
        if (numberOfsides == 3) {
            this.name = "Triangle"; 
        }
        if (numberOfsides == 4) {
            this.name = "Quadrilateral"; 
        }
    }

    public String getname() {
        return this.name; 
    }

    public double getarea() {
        return this.area; 
    }

    public void setperimeter(int sidelength) {
        int perimeter = computeshapeperimeter(sidelength, this.numOfSides); 
        this.perimeter = perimeter; 
    }
   
   private static int computeshapeperimeter(int sideLength, int numOfSides) {
        int perimeter = sideLength * numOfSides; 
        return perimeter;
    }

    public int getperimeter() {
        return this.perimeter; 
    }

    static void TestShape() {
        System.out.println("test static shape");
    }
}

class Triangle extends Shape {
    public double height; 
    public double base; 
    
    public Triangle() {
       // super(3);
       super();
       System.out.println("I'm in Triangle's default constructor");
       // super(3);
    }

    public Triangle(int numOfsides) {
        super(numOfsides);
        this.area = numOfsides * numOfsides;
        System.out.println("in triangle's argument list constructor");
    }

    public double getarea(double base, double height) {
        return this.area = base * height / 2;
    }

    static void TestShape() {
        System.out.println("test static triangel");
    }
}

public class Shapetest {
    public static void main (String[] args) {
        Triangle mytriangle = new Triangle(); 
        Shape.TestShape();
        mytriangle.TestShape(); 
        Triangle.TestShape();
        
        mytriangle.numOfSides = 3;
        mytriangle.angleSize =  mytriangle.setInternalAngleSize(); 
        mytriangle.height = 3;
        mytriangle.base = 5;
        mytriangle.area = mytriangle.getarea(mytriangle.height, mytriangle.base); 

        // mytriangle.name = mytriangle.getshapename(3); error 
        System.out.println(mytriangle.area);
        System.out.println(mytriangle.angleSize);

        Shape square = new Shape(4); 
        square.setInternalAngleSize();
        square.setname(); 
        square.setperimeter(5);
        System.out.println(square.getperimeter());
        System.out.println(square.angleSize);
        System.out.println(square.setarea(9, 8));
        System.out.println(square.getname());
    }
    
}
