        //  Name -> Himanshu
        //     Roll. No. -> 24/SCA/BCA/014

public class Method_overloading{
    void display(){
    System.out.println("Hello");
    }
    void display(int n){
    System.out.println("Hello "+n);  
    }
    void display(int x,int y){
    System.out.println("Hello "+(x+y));
    }
    public static void main(String[] args){
        Method_overloading obj = new Method_overloading();
       obj.display();
       obj.display(1);
       obj.display(1,2);
    }
}

