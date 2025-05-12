        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

class Student{
    int id;
    String name;
     // Constructor with arguments
     
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void display_details(){
        System.out.println("Student id is "+id);
        System.out.println("Student name is "+name);
    }
}

public class Constructor{
    public static void main(String[] args){

        // Creating objects using the constructor with arguments
        Student obj = new Student(9,"Himanshu");
        Student obj1 = new Student(10,"Ajay");
        obj.display_details();
        obj1.display_details();
        

    }
}
