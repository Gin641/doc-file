import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String path = "C\\Gin\\module 2\\IO Text File\\doc file\\src\\example.csv";
        File file = new File(path);
        ReadFileCSV.readCSV(file);
    }
}
