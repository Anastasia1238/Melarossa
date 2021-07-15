import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HeavyBox box1=new HeavyBox(10,"Апельсины");
        HeavyBox box2=new HeavyBox(20,"Яблоки");
        HeavyBox box3=new HeavyBox(30,"Бананы");
        HeavyBox box4=new HeavyBox(40,"Клубника");
        HeavyBox box5=new HeavyBox(50,"Ананасы");

        List<HeavyBox>boxList=new ArrayList<>();

        boxList.add(box1);
        boxList.add(box2);
        boxList.add(box3);
        boxList.add(box4);
        boxList.add(box5);
        boxList.get(0).setWeding(9);
        System.out.println("Коробка:");

        for (HeavyBox myBox:boxList){
            System.out.println(myBox);
        }
        boxList.remove(box5);
        System.out.println("++++++++++++++++");

        for (HeavyBox myBox:boxList){
            System.out.println(myBox);
        }
        Iterator myBox=boxList.iterator();
        while (myBox.hasNext()){
            System.out.println(myBox.next());
            myBox.remove();
        }
        for (int i=0;i<boxList.size()-1;i++){
            System.out.println(myBox);
        }
        System.out.println(boxList.size());
    }
}
