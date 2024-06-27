public class Test1 {
    int x=10;
    void display(String s){

        System.out.println("display 1 called");
        System.out.println("i m : "+s);
    }
    static void show(){
        System.out.println("super class static show method ");
    }
}
class Test2 extends Test1{
    int x=200;
    void display(String s){
        int x=1000;
        super.display("suresh kumar");
        System.out.println("test2 called");
        System.out.println("my name is : "+s);
        System.out.println("local x is "+x);
        System.out.println("current class x is "+this.x);
        System.out.println("super class x is "+super.x);
    }
    static void show(){
        System.out.println("sub class static show method");
    }

    public static void main(String[] args) {
        Test1 a=new Test2();
        a.display("harsh");
a.show();
}}