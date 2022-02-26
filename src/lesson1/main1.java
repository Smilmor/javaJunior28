package lesson1;

public class main1 {
    public static void main(String[] args) {
        int a = 4, b = 5, c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник!");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний теругольник!");
        } else //if ((b == c && a != b && a != c) || (a == b && b != c && c != a) ||
        //        (a == c && a != b && c != b))
        {
            System.out.println("Это равнобедренный треугольник");
        }

    }
}
