import java.util.ArrayList;
import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> testList = new ArrayList<>();
    testList.add("Один");
    testList.add("Два");
    testList.add("Три");
    System.out.println("Обход testList при помощи улучшенного цикла for: ");
    for (String s : testList) {
      System.out.println(s);
    }
    System.out.println("Обход testList при помощи цикла for: ");
    for (int i = 0; i < testList.size(); i++) {
      System.out.println(testList.get(i));
    }
    System.out.println("Обход testList при помощи цикла while и итератора: ");
    Iterator iterator = testList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("Обход testList при помощи цикла while и переменной y: ");
    int y =0;
    while (y<3){
      System.out.println(testList.get(y));
      y++;
    }
  }
}
