package lesson2;

public class Main4 {
    public static void main(String[] args) {
        // ищем общий знаменатель для дробей
        int znamenatel1 = 13;
        int znamenatel2 = 23;

        int startCommonZnamenatel;

        if (znamenatel1 > znamenatel2) {
            startCommonZnamenatel = znamenatel1;
        } else {
            startCommonZnamenatel = znamenatel2;
        }

        for (int i = startCommonZnamenatel; i <= (znamenatel1 * znamenatel2); i++) {
            if (i % znamenatel1 == 0 && i % znamenatel2 == 0) {
                System.out.println("Минимальный общий знаменатель: " + i);
                break;
            }

        }

    }
}
