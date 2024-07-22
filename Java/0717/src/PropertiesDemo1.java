import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        Properties info = new Properties();
        info.load(new FileInputStream("src/productinfo.properties"));
        System.out.println("나이 = " + info.getProperty("age"));
        System.out.println("사는 곳 = " + info.getProperty("city"));
    }
}
