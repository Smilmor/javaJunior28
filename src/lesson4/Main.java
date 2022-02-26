package lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 366; day++) {
            for (int hour = 0; hour < 24; hour++) {
                for (int min = 0; 0 < 60; min++) {
                    for (int sec = 0; 0 < 60; sec++) {
                        //выполнится = 366 * 24 * 60 * 60
                        System.out.printf("Со старта прошло: %d дня, %d часа, %d минуты, %d секунды \n", day, hour, min, sec); //если текст то %s
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
