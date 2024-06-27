public class UserMain {
    public static void main(String[] args) {
        User user=new User(10001,"harsh chauhan",12000);
        System.out.println("user Information ");
        System.out.println("\tid "+user.getUserId());
        System.out.println("\tname "+user.getUserName());
        System.out.println("\tsalary "+user.getUserSalary());

    }
}
