/**
 * @author Çağatay KARASU
 * @since 04.2021
 **/

public class Main {

    public static void main(String[] args) {

        Course course01 = new Course(01, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "Engin Demiroğ");
        Course course02 = new Course(02,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "Engin Demiroğ");
        Course course03 = new Course(03, "Programlamaya Giriş için Temel Kurs", "Engin Demiroğ");

        Course[] courses = {
                course01,
                course02,
                course03
        };

        for (Course course : courses) {

            System.out.println(course.id + " - " + course.name);
        }

        CourseManager courseManager = new CourseManager();

        Course course04 = new Course(04,"Test","Çağatay KARASU");
        courseManager.addCourse(course04);
        courseManager.deleteCourse(course02);

    }
}
