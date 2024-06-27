public class z {
    public z(){
        System.out.println("z constructor ");
    }
}
class Y extends z{
    public Y(){
        System.out.println("y constructor");
    }
}
class X extends Y{
    public X(){
        super();
        System.out.println("X constructor");
    }


public static void main(String[] args) {
    new X();
}}