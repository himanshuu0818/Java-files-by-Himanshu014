        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area_rectangle() {
        long result1 = length * breadth;
        System.out.println("Area of Rectangle : " + result1);
    }

    void perimeter_rectangle() {
        long result2 = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle : " + result2);
    }
}

class A extends Rectangle {
    public A(int length, int breadth) {
        super(length, breadth);
    }
}

public class Rectangle_demo {
    public static void main(String[] args) {
        int length = 10, breadth = 10;
        Rectangle obj = new Rectangle(length, breadth);
        obj.area_rectangle();
        obj.perimeter_rectangle();
    }
}
