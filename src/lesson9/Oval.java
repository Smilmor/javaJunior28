package lesson9;

public class Oval extends Krug{
    private int secondRadius;

    public Oval() {
        // в каждом конструкторе первой сторой ВСЕГДА вызывается родительский конструктор
        super(); // - по умолчанию в каждом конструкторе ВСЕГДА ПЕРВОЙ СТРОКОЙ
    }

    public Oval(int radius, int secondRadius) {
        // третий вариант сохранения переменной в родительский класс
        // с помощью вызова родительского конструктора
        super(radius);
        this.secondRadius = secondRadius;

        // первый вариант сохранения переменной в родительский класс
        // увеличение области видимости переменной
        //this.radius = radius;

        // второй вариант сохранения переменной в родительский класс
        // с помощью вызова метода set
        //this.setRadius(radius);

    }

    public int getSecondRadius() {
        return secondRadius;
    }

    public void setSecondRadius(int secondRadius) {
        this.secondRadius = secondRadius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt(((double) radius * radius + secondRadius * secondRadius) / 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Oval oval = (Oval) o;

        return secondRadius == oval.secondRadius;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + secondRadius;
        return result;
    }

    @Override
    public String toString() {
        return "Oval{" +
                "radius=" + radius +
                ", secondRadius=" + secondRadius +
                '}';
    }
}
