        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

class Student5 {
    String name;
    int age;

    // Constructor with no parameters
    Student5() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Student5(String name) {
        this.name = name;
        age = 0;
    }

    // Constructor with two parameters
    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display5() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
   }

public class Constructor_overloading {
    public static void main(String args[]){

        Student5 s1 = new Student5();
        Student5 s2 = new Student5("Himanshu");
        Student5 s3 = new Student5("Himanshu", 22);

        s1.display5();
        s2.display5();
        s3.display5();
    } 
}