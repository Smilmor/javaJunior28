package lesson6;

public class Main1 {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 15, 17);
        Triangle triangle1 = new Triangle();
//        triangle.setA(12); сетерами можно переустановить уже установленные параметры
//        triangle.setB(15);
//        triangle.setC(17);

        int perimetr1 = triangle.perimetr();
        System.out.println(perimetr1);

        int perimetr2 = triangle1.perimetr();
        System.out.println(perimetr2); // вернет 0

        RightTriangle triangle2 = new RightTriangle();

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        Object[] objects = new Object[5];
        Triangle a = (Triangle) objects[0];


    }
}
