public class Teacher extends Person{
    private float pf,hra;
    private String location;

    public Teacher(int salary, int id, String name, float pf, float hra, String location) {
        super(salary, id, name);
        this.pf = pf;
        this.hra = hra;
        this.location = location;
    }
    public void personInfo(){
        super.personInfo();
        System.out.println("\t hra "+hra);
        System.out.println("\t pf "+pf);
        System.out.println("\t gross salary "+(getSalary()-(getSalary()*pf)+(getSalary()*hra)));
        System.out.println("\t location "+location);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher(10000,123,"Babitaji",0.05f,0.09f,"delhi");
        teacher.personInfo();
    }
}
