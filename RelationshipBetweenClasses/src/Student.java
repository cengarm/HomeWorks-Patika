public class Student {
    private  String name;
    private  String surname;
    private  String idno;
    private  String address;
    private  int note;

    public Student(String name, String surname, String idno, String address, int i) {
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.address = address;
        this.note = note;
        if (note > 100 || note < 0 ){
            note = 0;
        }
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getAddress() {
        return address;
    }

    public Student(int note) {
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setAddress(String address) {
        this.address = address;

    }
}
