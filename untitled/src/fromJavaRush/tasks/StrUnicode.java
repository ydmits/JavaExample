package fromJavaRush.tasks;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StrUnicode {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "Windows-1251"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), "UTF-8"))){
            String str;
            while ((str = bufferedReader.readLine())!=null){
                bufferedWriter.write(str + "\n");
            }
        }
    }
}
