package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // напечатать на консоль накопления
        double money = 100000;
        int years = 5;
        int persentage = 7;


        for (int mounths = 0; mounths < (12 * years); mounths++) {
            money = money + ((money / 100 * persentage) / 12);
        }
        System.out.println(money);
    }
}
