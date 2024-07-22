import java.util.Enumeration;
import java.util.Properties;

//Property : 속성, 재산, SystemPropertiesAdvanced
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties infos = System.getProperties();
        Enumeration<Object> enums = infos.keys();
        while (enums.hasMoreElements()) {
            String key = (String) enums.nextElement(); //Object를 String으로 강제 형변환
            System.out.println(key + "  => " + System.getProperty(key));
        }
    }
}
