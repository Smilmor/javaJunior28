package lesson5;

public class StringUtils {
    // 1 - переменные. могут быть или не быть
    // 2 - конструкторы. могут быть а могут не быть
    // 3 - методы. могут быть а могут и не быть

    /** Метод, который будет принимать текскт, и возвращать количество гласных букв в тексте
     * 1- модификатор доступа (определитель области видимости)
     * public - видимость внутри всего проекта
     * protected - видимость вгутри текущего пакета, внутри класса и дочерним классам
     * ______ - внутри текщего пакета
     * private - только внутри текущего класса
     *
     * 2 - static - (пиишем или нет)
     * 3 - возвращаемый тип (int, String, и любой другой)
     * void - если нет возвращаемого типа
     * 4 - название метода (с маленькой буквы, придумываем сами)
     * 5 - входящие параметры (данные, без которых невозможно выполнить данный метод)
     * (int a, int b, int c или int count и прочее) если нет входящих то ()
     * 6 - тело (то что будет выполняться при вызове метода
     */

    public static int countVowel(String text) {
        // text - все что угодно может быть
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' ||
                text.charAt(i) == 'u' || text.charAt(i) == 'y') {
                count++;
            }
        }
        return count;
    }
    //  метод, который будет принимать входящим параметром текст и возвращать текст полностью наоборот каждое слово
    public static String reversedByWords(String text) {
        String[] words = text.split("\\s+");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = result + new StringBuilder(words[i]).reverse().toString() + " ";
        }
        return result;
    }

    // метод который выводит считанную букву в виде буквы следующей по алфавиту
    public static void coddingText(String text) {
        String althabet = "abcdefghijklmnopqrstuvwxyza";
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int index = althabet.indexOf(text.charAt(i));
            if (index != -1) {
                result = result + althabet.charAt(index+1);
            } else {
                result = result + text.charAt(i);
            }
        }
        System.out.println(result);
    }




}
