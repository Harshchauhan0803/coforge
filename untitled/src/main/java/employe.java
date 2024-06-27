import java.util.Objects;

public class employe {

    int id;
    String name;
    public employe(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employe employe = (employe) o;
        return id == employe.id && Objects.equals(name, employe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "employe{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        employe emp=new employe(10001,"baburao");
        System.out.println(emp);
        employe emp1=emp;
        System.out.println(emp.equals(emp1));
        employe emp3=new employe(10001,"baburao");
        System.out.println(emp.equals(emp3));
        System.out.println("Hashcode: "+emp.hashCode());
        System.out.println("Hashcode: "+emp1.hashCode());
        System.out.println("Hashcode: "+emp3.hashCode());
    }

}
