package abstractlesson;

import abstractlesson.Worker;

public abstract class Employee extends Person implements Worker {
    protected String department;

    public Employee(String name, String dept) {
        super(name);
        this.department = dept;
    }

    public String getDepartment() {
        return this.department;
    }

    @Override
    public void sayHello(){
        System.out.printf("Hello, my name is %s. I work in %s\n",this.getName(),this.getDepartment());
    }


//    public abstract void doWork();
}
