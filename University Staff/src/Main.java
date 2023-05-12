public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mustafa Çetindağ","055555555", "mdcengar@gmail.com" );

        Academician academician = new Academician("Selami Ateş", "054353434", "selami@gmail.com","Mühendis","Prof.");
        academician.joinCourse();

        Teacher teacher = new Teacher("Memati Ateş", "0", "asdad", "fizik","doçent", "110");
        System.out.println(teacher.getDoorNo());

        Assistant assistant = new Assistant("SS", "0", "ASDASD", "asdasd","asistan","121");
        assistant.quiz();

        LabAssistant labAssistant = new LabAssistant("BB" , " 0", "ASASDSA" ,"123213","labas.", "123");
        labAssistant.joinCourse();

        Computing computing = new Computing();
        computing.network();
    }
}