package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        System.out.println("Выберите фигуру");
        System.out.println("1 - круг");
        System.out.println("2 - овал");
        System.out.println("3 - квадрат");
        System.out.println("4 - треугольник");
        System.out.println("5 - трапеция");

        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equalsIgnoreCase("круг") || figure.equals("1")) {
            System.out.println("Окружность или площадь?");
            String action = scanner.nextLine();
            System.out.println("Введите радиус круга: ");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius);

            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь круга: " + (Math.PI*(r*r)));
            } else {
                System.out.println("Окружность круга: " + (2 * Math.PI*r));
            }

        } else if (figure.equalsIgnoreCase("овал") || figure.equals("2")) {
            System.out.println("Периметр или площадь?");
            String action2 = scanner.nextLine();
            System.out.println("Введите малый радиус овала: "); //так как в примере с кругом идет вычисления от радиуса, логично продолжить по овалу тоже с радиусом
            String smallRadius = scanner.nextLine();
            int sr = Integer.parseInt(smallRadius);
            System.out.println("Введите ,большой радиус овала: ");
            String bigRadius = scanner.nextLine();
            int br = Integer.parseInt(bigRadius);

            if (action2.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь овала: " + (Math.PI*((sr*br)/4))); //делю на 4 так как в формуле полурадиусы, делю на 4, а не на 2 из за произведения радиусов
            } else {
                double elips = 4 * ((Math.PI*(((double) (sr*br))/4)+(((double) (br-sr))/2)*(((double) (br-sr))/2)))/((((double)(sr + br))/2));
                //чтобы строка ниже не была слишком длинной ввел переменную, также "команда" (double), чтоб делил сразу как дробное число
                System.out.println("Периметр овала: " + elips);
            }

        } else if (figure.equalsIgnoreCase("квадрат") || figure.equals("3")) {
            System.out.println("Периметр или площадь?");
            String action3 = scanner.nextLine();
            System.out.println("Введите длинну стороны квадрата: ");
            String squareSide = scanner.nextLine();
            int s = Integer.parseInt(squareSide);

            if (action3.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь квадрата: " + (s * s));
            } else {
                System.out.println("Периметр квадрата: " + (4 * s));
            }

        } else if (figure.equalsIgnoreCase("треугольник") || figure.equals("4")) {
            System.out.println("Периметр или площадь?");
            String action4 = scanner.nextLine();
            System.out.println("Введите длинну сторон треугольника: ");
            String triangleSide1 = scanner.nextLine();
            int ts1 = Integer.parseInt(triangleSide1);
            String triangleSide2 = scanner.nextLine();
            int ts2 = Integer.parseInt(triangleSide2);
            String triangleSide3 = scanner.nextLine();
            int ts3 = Integer.parseInt(triangleSide3);

            if (ts1 >= ts2 + ts3 || ts2 >= ts1 + ts3 || ts3 >= ts1 + ts2) {
                System.out.println("Такого треугольника не существует!");
            } else if (action4.equalsIgnoreCase("площадь")) {
                double hP = (((double) (ts1 + ts2 + ts3)) / 2); //halfPerimetr
                // (double) для того чтоб делил сразу как дробное число
                System.out.println("Площадь треугольника: " + (Math.sqrt(hP * (hP - ts1) * (hP - ts2) * (hP - ts3))));
            } else {
                System.out.println("Периметр треугольника: " + (ts1 + ts2 + ts3));
            }

        } else if (figure.equalsIgnoreCase("трапеция") || figure.equals("5")) {
            System.out.println("Периметр или площадь?");
            String action5 = scanner.nextLine();
            System.out.println("Введите длинну оснований трапеции: ");
            String baseTrapezoid1 = scanner.nextLine();
            int bT1 = Integer.parseInt(baseTrapezoid1);
            String baseTrapezoid2 = scanner.nextLine();
            int bT2 = Integer.parseInt(baseTrapezoid2);
            System.out.println("Введите длинну сторон трапеции: ");
            String sideTrapezoid1 = scanner.nextLine();
            int sT1 = Integer.parseInt(sideTrapezoid1);
            String sideTrapezoid2 = scanner.nextLine();
            int sT2 = Integer.parseInt(sideTrapezoid2);

            if (Math.abs(bT1 - bT2) >= sT1 + sT2 || sT2 >= Math.abs(bT1 - bT2) + sT2 || sT2 >= sT1 + Math.abs(bT1 - bT2)) {
                System.out.println("Такой трапеции не существует!");
            } else if (action5.equalsIgnoreCase("площадь")) {
                double hPT = ((double) (bT1 + bT2 + sT1 + sT2)) / 2; //halfPerimetrTrapezoid
                double sOT = (((double) (bT1 + bT2)) / Math.abs(bT1 - bT2)) * Math.sqrt((hPT - bT1) * (hPT - bT2) * ((hPT - bT1 - sT1) * (hPT - bT1 - sT2)));
                System.out.println("Площадь трапеции: " + (sOT)); //ввел доп. переменную, чтобы хоть как-то урезать длинну строки с формулой
            } else {
                System.out.println("Периметр трапеции: " + (bT1 + bT2 + sT1 + sT2));
            }

        } else {
            System.out.println("Неверная фигура! Перезапустите программу и попробуйте еще раз!");

        }

    }
}
