package day03inheritanceHw;

public class InstructorManager extends UserManager {

    public void add(Instructor instructor) {
        super.add(instructor);
        System.out.println("Öğretmen başarıyla eklendi.");
    }

    public void add(Instructor[] instructors) {
        super.add(instructors);
        System.out.println("Öğretmenler başarıyla eklendi.");
    }

    public void update(Instructor instructor) {
        super.update(instructor);
        System.out.println("Öğretmen kaydı başarıyla güncellendi.");
    }

    public void delete(Instructor instructor) {
        super.delete(instructor);
        System.out.println("Öğretmen kaydı başarıyla silindi.");
    }
}
