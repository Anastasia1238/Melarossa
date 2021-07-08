import java.util.PriorityQueue;
//Создать очередь, содержащую объекты класса HeavyBox.
//Используем класс ArrayDeque.
//Поместить объекты в очередь с помощью метода offer().
//Удалить объекты методом poll().

public class Main {
    public static void main(String[] args) {


        PriorityQueue<Integer> boxQueue = new PriorityQueue<>();

        boxQueue.add(1);
        boxQueue.add(2);
        boxQueue.add(3);
        boxQueue.add(4);
        boxQueue.offer(15);


for (int myBox:boxQueue){
    System.out.println(myBox);

    boxQueue.poll();
    System.out.println("КофеЁк");

    for (int myBox1:boxQueue){
        System.out.println(myBox1);
    }


}
    }
}
