        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

public class Circle {
    public double area_of_circle(int r){
        return Math.PI*r*r;
    }

     
    public static void main(String[] args){
        int radius = 10;
        Circle obj = new Circle();

        obj.area_of_circle(radius);
        System.out.println("Area of Circle : "+obj.area_of_circle(radius));
    }
}
