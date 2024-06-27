public class MethodOverloading {
    void addition(int a,int b){
        System.out.println("additin is "+(a+b));
    }
    void addition(int a,float b){
        System.out.println("additin is "+(a+b));
    }
    void addition(float a,int b){
        System.out.println("additin is "+(a+b));
    }
    void addition(int a,int b,int c){
        System.out.println("additin is "+(a+b+c));
    }

    public static void main(String[] args) {
        MethodOverloading a=new MethodOverloading();
        a.addition(5,6);
        a.addition(5.66f,6);
        a.addition(5,5.77f);
        a.addition(5,6,7);
    }
}
