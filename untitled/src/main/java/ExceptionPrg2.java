public class ExceptionPrg2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        String name=null;
        try {
            System.out.println(arr[5]);

        }
       catch(IndexOutOfBoundsException e){
           System.out.println("index error"+e.getMessage());
        }
        try {
            System.out.println(name.length());

        }

        catch(NullPointerException e){
            System.err.println("null h bs"+e.getMessage());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}