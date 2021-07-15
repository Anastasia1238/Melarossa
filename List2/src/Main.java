import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.
public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> toyNameEndNumber = new HashMap<>();

        toyNameEndNumber.put(123, "Машинка");
        toyNameEndNumber.put(145, "Медведь");
        toyNameEndNumber.put(195, "Единорог");
        toyNameEndNumber.put(200, "Чупакабра");
        System.out.println(toyNameEndNumber);

        Set<Integer>keys=toyNameEndNumber.keySet();
        System.out.println("Ключи:"+keys);

        ArrayList<String>values=new ArrayList<>(toyNameEndNumber.values());
        System.out.println("Значения:"+values);

      for (Map.Entry entry:toyNameEndNumber.entrySet()){
          System.out.println(entry);
      }


    }
}
