public class Academician extends Employee {
    private String classes;
    private String title;

    public  Academician(){

    }
    public Academician(String nameSurname, String phone, String email, String classes, String title) {
        super(nameSurname, phone, email);
        this.classes = classes;
        this.title = title;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void joinCourse(){
        System.out.println(this.getNameSurname()+ " derse giriş yaptı.");

    }
}
