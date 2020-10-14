package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student fer = new Student("Fer");
        Student douglas = new Student("Douglas");
        fer.addGrade(90);
        fer.addGrade(50);
        fer.addGrade(90);
        
        douglas.addGrade(100);
        douglas.addGrade(99);
        douglas.addGrade(99);
        douglas.addGrade(100);
        
        System.out.println("fer.getGradeAverage() = " + fer.getGradeAverage());
        System.out.println("douglas.getGradeAverage() = " + douglas.getGradeAverage());
    }

}
