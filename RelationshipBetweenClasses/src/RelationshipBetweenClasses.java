public class RelationshipBetweenClasses {
    public static void main(String[] args) {
        Student student = new Student("Mustafa", "Cengar", "123", "aa",85);
        Student student1 = new Student("Hüseyin", "Cengar", "122323", "bb", 85);
        student1.setNote(100);
        System.out.println(student1.getNote());

        Course mat = new Course("Mat101", "Mat");
        Student[] stu = {student,student1};
        mat.calcAvarage(stu);

        System.out.println("Ortalama : " + mat.calcAvarage(stu));
    }
}