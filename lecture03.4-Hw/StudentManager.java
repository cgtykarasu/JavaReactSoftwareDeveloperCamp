package day03inheritanceHw;

public class StudentManager extends UserManager {

    public void add(Student student) {
        super.add(student);
        System.out.println("Öğrenci başarıyla eklendi.");
    }

    public void add(Student[] students) {
        super.add(students);
        System.out.println("Öğrenciler başarıyla eklendi.");
    }

    public void update(Student student) {
        super.update(student);
        System.out.println("Öğrenci kaydı başarıyla güncellendi.");
    }

    public void delete(Student student) {
        super.delete(student);
        System.out.println("Öğrenci kaydı başarıyla silinmiştir.");
    }

    public void changeSchool (Student student) {

        System.out.println("Yeni okul bilgisini giriniz : ");
        String newSchool = scn.nextLine();
        student.setSchool(newSchool);
        System.out.println(student.getfName() + " " + student.getlName() + " öğrencisinin okulu " +
                student.getSchool() + " ile başarıyla değiştirilmiştir.");
    }
}
