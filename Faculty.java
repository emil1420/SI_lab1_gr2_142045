import java.util.List;

class Faculty extends Student {

    List<Student>  student;
    String facultyName;

    Faculty(String i, String name, String surname, int[] grade) {
        super(i, name, surname, grade);
    }

    public void removeStudent(String name){
        if(student.equals(name))
            student.remove(name);
    }

}
