public class Course {
    Teacher teacher;
    String name;
    int  code;
    String prefix;
    int note;


    Course(String name, int code, String prefix, Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else
            System.out.println("Öğretmen derse uygun değil");
    }

    void  printTeacher(){
        this.teacher.print();
    }

}

