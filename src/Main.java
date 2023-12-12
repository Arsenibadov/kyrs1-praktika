
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
String[] strName = {" Андрей", "Александр", "Елена", "Андрей", // Дубликат
        "Анатолий", "Анатолий" // Дубликат
};
strName = Arrays.stream ( strName ).distinct ().toArray (String[]::new);
    System.out.println (  "Массив после удаления дубликатов" + Arrays.toString ( strName ));
  }
}







