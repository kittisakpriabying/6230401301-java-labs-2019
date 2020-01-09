package priabying.kittisak.lab4;

public class Teacher extends PersonV2 {
    private String teachingSubject;
    private int salary;

    public Teacher(String name, Double height, Double weight, String dob, String newTeachingSubject, int newSalary) {
        super(name, height, weight, dob);

    }

    public void setTeachingSubject(String newTeachingSubject) {
        teachingSubject = newTeachingSubject;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", teachingSubject = " + teachingSubject + ", Salary = " + salary;
    }

}