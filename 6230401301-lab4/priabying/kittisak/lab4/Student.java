package priabying.kittisak.lab4;

public class Student extends PersonV2  {
    private String major;
    private Double GPA ;

    public Student(String name, Double height , Double weight ,String dob ,String newMajor,  Double newGPA){
        super(name, height, weight, dob);
        
        
        
    }

    public void setMajor(String newMajor){
        major = newMajor;
    }

    public String getMajor(){
        return major ;
    }

    public void setGPA(Double newGPA){
        GPA = newGPA;
    }
    public Double getGPA(){
        return GPA ;
    }

    @Override
    public String toString(){
        return super.toString() + ", major = " + major + ", GPA = " + GPA ;
    }


    
}