public class Person {
    private int id,salary;
    private String name;

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Person(int salary, int id, String name) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    public void personInfo() {
        System.out.println("id : " + getId());
        System.out.println("name : " + getName());
        System.out.println("salary : " + getSalary());
    }
}
