import java.util.*;
public class Animal{
    public static void main(String[] args){
        int[] a = {1,2,3};
        a = new int[]{1,2,3,4};
    }
}
class Wolf{
    double weight;
    int age;
    Wolf(){
        System.out.println("default constructor");
    }
    Wolf(double w,int a){
        weight=w;
        this.age=a;
        System.out.println("1weight: "+weight+" age: "+age);
    }
    Wolf(double w,short a){
        weight=w;
        this.age=a;
        System.out.println("2weight: "+weight+" age: "+age);
    }
}
