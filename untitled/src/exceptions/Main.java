package exceptions;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String content = """
            До свиданья, друг мой, до свиданья.
            Милый мой, ты у меня в груди.
            Предназначенное расставанье
            Обещает встречу впереди.
            """;
        String newContent;
        Path path = Paths.get("D:\\textfile.txt");

        try{
            Files.write(path, content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new MyException("Custom Exception write file - " + e.getMessage(), e );
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            newContent = Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new MyException("Custom Exception read file - " + e.getMessage(), e );
        }

        System.out.println(newContent);
    }
}
