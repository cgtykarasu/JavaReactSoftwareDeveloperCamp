package day03inheritanceHw;

/**
 * @author Çağatay KARASU
 * @since 04.2021
 **/

public class Main {

    public static void main(String[] args) {

        // USER
        User user1 = new User("Çağatay", "KARASU", "cag@cag.com","cagataykarasu", "123456");
        User user2 = new User("User2","USER2", "user@user.com", "user2user", "user123456");
        User[] users = {user1,user2};

        // INSTRUCTOR
        Instructor instructor1 = new Instructor("Engin", "Demiroğ","engin@engin.com","edemirog","asdasd","Java");
        Instructor instructor2 = new Instructor("Kerem","Varış","kerem@kerem.com","keremvaris","kerem123456","Eğitmen");
        Instructor[] instructors = {instructor1,instructor2};

        // STUDENT
        Student student1 = new Student("Abu","Zubu","abu@abu.com","abuzubu","abu123","ESTÜ","Engineering");
        Student student2 = new Student("Edi","Büdü","edi@budu.com","edibudu","edi123456","ODTÜ","Architecture");
        Student[] students = {student1,student2};


        UserManager userManager = new UserManager();

        userManager.add(user1);
        userManager.add(users);
        userManager.update(user1);
        userManager.delete(user2);
        userManager.listUsers(users);
        System.out.println("Değişmeden önce email adresi : " + user1.getEmail());
        userManager.changeEmail(user1);
        System.out.println("Değiştirdikten sonra email adresi : " + user1.getEmail());
        System.out.println("Değişmeden önce şifre : " + user2.getPassword());
        userManager.changePassword(user2);
        System.out.println("Değiştirdikten sonra şifre : " + user2.getPassword());
        System.out.println("Değişmeden önce kullanıcı adı : " + user1.getUsername());
        userManager.changeUsername(user1);
        System.out.println("Değiştirdikten sonra kullanıcı adı : " + user1.getUsername());

        InstructorManager instructorManager = new InstructorManager();

        instructorManager.add(instructor1);
        instructorManager.add(instructors);
        instructorManager.update(instructor1);
        instructorManager.delete(instructor2);
        instructorManager.listUsers(instructors);
        System.out.println("Değişmeden önce email adresi : " + instructor1.getEmail());
        instructorManager.changeEmail(instructor1);
        System.out.println("Değiştirdikten sonra email adresi : " + instructor1.getEmail());
        System.out.println("Değişmeden önce şifre : " + instructor2.getPassword());
        instructorManager.changePassword(instructor2);
        System.out.println("Değiştirdikten sonra şifre : " + instructor2.getPassword());
        System.out.println("Değişmeden önce kullanıcı adı : " + instructor1.getUsername());
        instructorManager.changeUsername(instructor1);
        System.out.println("Değiştirdikten sonra kullanıcı adı : " + instructor1.getUsername());

        StudentManager studentManager = new StudentManager();

        studentManager.add(student1);
        studentManager.add(students);
        studentManager.update(student1);
        studentManager.delete(student2);
        studentManager.listUsers(students);
        System.out.println("Değişmeden önce email adresi : " + student1.getEmail());
        studentManager.changeEmail(student1);
        System.out.println("Değiştirdikten sonra email adresi : " + student1.getEmail());
        System.out.println("Değişmeden önce şifre : " + student2.getPassword());
        studentManager.changePassword(student2);
        System.out.println("Değiştirdikten sonra şifre : " + student2.getPassword());
        System.out.println("Değişmeden önce kullanıcı adı : " + student1.getUsername());
        studentManager.changeUsername(student1);
        System.out.println("Değiştirdikten sonra kullanıcı adı : " + student1.getUsername());
        System.out.println("Değişmeden önce okulu : " + student2.getSchool());
        studentManager.changeSchool(student2);
        System.out.println("Değiştirdikten sonra okulu : " + student2.getSchool());

        System.out.println("ID kontrolü\n-----------\nUSER1 : " + user1.getId() + "\nUSER2 : " + user2.getId() +
                "\nINSTRUCTOR1 : " + instructor1.getId() + "\nINSTRUCTOR2 : " + instructor2.getId() +
                "\nSTUDENT1 : " + student1.getId() + "\nSTUDENT2 : " + student2.getId());
    }
}
