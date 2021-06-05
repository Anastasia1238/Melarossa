public class Main {
    public static void main(String[] args) {

        Shape shape[] = new Shape[2];
        shape[0] = new Circle();
        shape[1] = new Rectangle();

    }
}

class Shape {
    int color = 10;

    Shape(){
    }
    public void point() {
        System.out.println("Метод Рисовать:");
    }
}
class Circle extends Shape {
    int form;

    Circle() {
        System.out.println("Конструктор Circle");
    }
}

class Rectangle extends Shape {
    int form1;

    Rectangle() {
        System.out.println("Конструктор Rectangle");
    }

}