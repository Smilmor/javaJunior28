package lesson7;

public class ExcellentStudent extends Student {
    // переопределить метод


    public ExcellentStudent() {
    }

    public ExcellentStudent(int age, String name) {
        super(age, name);
    }

    @Override
    public  int perimetrTriangle(int a, int b, int c) {
        // делаем проверку как пример

        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("Это не треугольник");
            return -1;

        }

        //return super.perimetrTriangle(a, b, c); обычно не используем
        return a + b + c;
    }

}
