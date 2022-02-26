package lesson6;

public class Triangle {
    // поля класса
    private int a;
    private int b;
    private int c;

    //конструкторы (после полей и перед методами обычно создаются)
    public Triangle() { //после создания конструктора мы не можем создать пустой объект
        // поэтому создаем еще один конструктор пустым, чтобы можно было создавать пустой объект (в мейне)
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //методы
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int perimetr() {
        return a + b + c;
    }

}
