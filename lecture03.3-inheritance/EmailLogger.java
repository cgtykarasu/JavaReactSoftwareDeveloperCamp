package day03_3inheritance;

public class EmailLogger extends Logger{
    @Override
    public void log() {
        System.out.println("Email yollandı");
    }
}
