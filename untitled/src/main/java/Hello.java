public class Hello{
    void method1(){
        System.out.println("hi i am method 1");
    }
}
class hello2 extends Hello{
    void method1(){
        System.out.println("hi i am method 2 of hello 2");
    }
    public static void main(String[] args) {
        hello2 a=new hello2();
        a.method1();
    }
}