//Создать новый проект. Написать метод, который принимает список чисел и возвращает
// минимальное число из списка чисел. В main продемонстрировать работу этого метода.
// Закоммитить, затем запушить эту з-чу в отдельный репозиторий. Скинуть ссылку на этот репозиторий в чат.

import java.util.ArrayList;
import java.util.Collections;

public class HW {

  public static void main(String[] args) {
    ArrayList<Integer> numbers= new ArrayList<>();
    numbers.add(1);
    numbers.add(100);
    numbers.add(-5);
    numbers.add(85);
    numbers.add(36);
    numbers.add(1158);
    numbers.add(583);
    System.out.println(numbers);
    System.out.println("min number "+ Collections.min(numbers));
  }
}
