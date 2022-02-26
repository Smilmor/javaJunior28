package lesson4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[][] tours = {{"1", "Италия", "5 дней", "самолет", "100000", "4 звезды", "полупансионат", "да"},
                            {"2", "Испания", "6 дней", "самолет", "110000", "3 звезды", "пансионат", "да"},
                            {"3", "Португалия", "8 дней", "самолет", "130000", "5 звезд", "только завтрак", "нет"},
                            {"4", "Доминикана", "14 дней", "самолет", "210000", "4 звезды", "полупансионат", "да"},
                            {"5", "Куба", "12 дней", "самолет", "205000", "4 звезды", "полупансионат", "да"},
                            {"6", "Мальдивы", "9 дней", "самолет", "350000", "5 звезд", "пансионат", "нет"}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну:");
        String country = scanner.nextLine();

        System.out.println("На какой бюджет рассчитываете?");
        String moneyStr = scanner.nextLine();
        int money = Integer.parseInt(moneyStr);

        System.out.println("Вы можете поехать в такие туры:");
        for (int i = 0; i < tours.length; i++) {
            int costTour = Integer.parseInt(tours[i][4]);
            if (country.equals(tours[i][1]) && costTour > money - 30000 && costTour < money + 30000) {
                System.out.printf("%s. %s: %s, %s, за %s руб, %s, %s, трансфер - %s \n",
                                  tours[i][0], tours[i][1], tours[i][2], tours[i][3],
                                  tours[i][4], tours[i][6], tours[i][5], tours[i][7]);

            }
        }
// напевчатать на консоль:
// 1) туры в такую-то страну.... только пансионат
// 2) туры в ... страну от ... звезд и выше
// 3) туры в любые страны от ... бюджета до .... бюджета
// 4) среднюю стоимость тура нешего турагенства

    }
}
