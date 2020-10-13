package abstractlesson;

public class Developer extends Employee {

    public Developer(String name, String dept) {
        super(name, dept);
    }

    public Developer(String name) {
        super(name, "Development");
    }

    @Override
    public void doWork() {
        System.out.println("Writing code, fixing bugs...");
    }
}
