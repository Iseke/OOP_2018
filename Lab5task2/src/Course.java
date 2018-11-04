import java.io.Serializable;

public class Course implements Serializable {
    private String courseName;
    private Textbook textbook;
    private Instructor instructor;
    public Course(){
        courseName = "no name";
        instructor = null;
        textbook=null;
    }
    public Course(String courseName,Textbook textbook,Instructor instructor){
        this.courseName = courseName;
        this.textbook = new Textbook(textbook.getIsbn(), textbook.getTittle(), textbook.getAuthor());
        this.instructor = new Instructor(instructor.getName(), instructor.getSurname(), instructor.getDepartment(), instructor.getEmail());
    }

    public void setCourseName(String courseName) { this.courseName = courseName; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }
    public void setTextbook(Textbook textbook) { this.textbook = textbook; }

    public Instructor getInstructor() { return instructor; }
    public String getCourseName() { return courseName; }
    public Textbook getTextbook() { return textbook; }

    public boolean equals(Object obj){
        if(obj==null)return false;
        if(this==obj)return true;
        if(!(obj instanceof Course))return true;
        Course course = (Course)obj;
        if(this.courseName.equals(course.courseName) && this.textbook.equals(course.textbook) && this.instructor.equals(course.instructor))return true;
        else return false;
    }
    public String toString(){
        return "\nCourse{"+ "\nTittle: " + this.courseName +"\nBook"+ textbook.toString() +"\nInstructor: "+ instructor.toString()+"\n}";
    }

}
