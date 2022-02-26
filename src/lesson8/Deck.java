package lesson8;

import java.util.concurrent.ThreadLocalRandom;

public class Deck implements IDeck {

    private ICard[] cards = new ICard[52];

    public Deck() {
        cards[0] = new Card("Двойка трефа", 2);
        cards[1] = new Card("Двойка пики", 2);
        cards[2] = new Card("Двойка буби", 2);
        cards[3] = new Card("Двойка черви", 2);

        cards[4] = new Card("Тройка трефа", 3);
        cards[5] = new Card("Тройка пики", 3);
        cards[6] = new Card("Тройка буби", 3);
        cards[7] = new Card("Тройка черви", 3);

        cards[8] = new Card("Четверка трефа", 4);
        cards[9] = new Card("Четверка пики", 4);
        cards[10] = new Card("Четверка буби", 4);
        cards[11] = new Card("Четверка черви", 4);

        cards[12] = new Card("Пятерка трефа", 5);
        cards[13] = new Card("Пятерка пики", 5);
        cards[14] = new Card("Пятерка буби", 5);
        cards[15] = new Card("Пятерка черви", 5);

        cards[16] = new Card("Шестерка трефа", 6);
        cards[17] = new Card("Шестерка пики", 6);
        cards[18] = new Card("Шестерка буби", 6);
        cards[19] = new Card("Шестерка черви", 6);

        cards[20] = new Card("Семерка трефа", 7);
        cards[21] = new Card("Семерка пики", 7);
        cards[22] = new Card("Семерка буби", 7);
        cards[23] = new Card("Семерка черви", 7);

        cards[24] = new Card("Восьмерка трефа", 8);
        cards[25] = new Card("Восьмерка пики", 8);
        cards[26] = new Card("Восьмерка буби", 8);
        cards[27] = new Card("Восьмерка черви", 8);

        cards[28] = new Card("Девятка трефа", 9);
        cards[29] = new Card("Девятка пики", 9);
        cards[30] = new Card("Девятка буби", 9);
        cards[31] = new Card("Девятка черви", 9);

        cards[32] = new Card("Десятка трефа", 10);
        cards[33] = new Card("Десятка пики", 10);
        cards[34] = new Card("Десятка буби", 10);
        cards[35] = new Card("Десятка черви", 10);

        cards[36] = new Card("Валет трефа", 10);
        cards[37] = new Card("Валет пики", 10);
        cards[38] = new Card("Валет буби", 10);
        cards[39] = new Card("Валет черви", 10);

        cards[40] = new Card("Дама трефа", 10);
        cards[41] = new Card("Дама пики", 10);
        cards[42] = new Card("Дама буби", 10);
        cards[43] = new Card("Дама черви", 10);

        cards[44] = new Card("Король трефа", 10);
        cards[45] = new Card("Король пики", 10);
        cards[46] = new Card("Король буби", 10);
        cards[47] = new Card("Король черви", 10);

        cards[48] = new Card("Туз трефа", 11);
        cards[49] = new Card("Туз пики", 11);
        cards[50] = new Card("Туз буби", 11);
        cards[51] = new Card("Туз черви", 11);

    }



    @Override
    public ICard randomeCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 52);
        return cards[randomIndex];
    }
}
