package day03_3inheritance;

public class FileLogger extends Logger {
    @Override
    public void log() {
        System.out.println("Dosyaya loglandı");
    }
}
