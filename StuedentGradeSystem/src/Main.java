public class Main {
        public static void main(String[] args) {
                Teacher teacher = new Teacher("Mustafa Hoca", "TRH", "90555555555555");
                Teacher teacher1 = new Teacher("XXXX", "FZK", "00505050");
                Teacher teacher2 = new Teacher("XXXXXXXXX", "BIO", "005054434050");

                Course Tarih = new Course("Tarih", 101, "TRH", teacher);
                Tarih.addTeacher(teacher);

                Course Biyoloji = new Course("Bio", 103, "BIO", teacher2);
                Biyoloji.addTeacher(teacher1);

                Course Fizik = new Course("Fizik", 102, "FZK", teacher1);
                Fizik.addTeacher(teacher1);


                Student student = new Student("Mustafa", "123", "5", Tarih, Fizik, Biyoloji);
                student.addBulkExamNote(100,50,70);
                student.printNote();

        }
}

