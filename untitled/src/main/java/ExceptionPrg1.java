public class ExceptionPrg1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[5]);//ArrayIndexOutofBoundsException
        System.out.println(10.0f/0);//have infinity
        System.out.println(10/0);//integer does not have infinity so ArithematicException
        String name=null;
        System.out.println(name.length());//NullPointerException
        String city="Delhi";
        System.out.println(city.charAt(20));//StringIndexOutOfBoundsException

    }
}
