package model.formatter.formatChecking.myCheckings;

import model.formatter.formatChecking.FormatChecking;

import java.util.Arrays;

public class FIOArrayCheck {

    private int fioDataQty = 3;
    int result = fioDataQty;
    String fioAnswer = "ФИО введены верно. Проверяем формат остальных данных...";

    public int checkFioArray(String[] infoArray) {
        String[] fioArray = infoArray[0].split(" ");

        if (fioArray.length != result) {
            result = -1;
        }

        for (String s : fioArray) {
            if (s.isEmpty()) {
                result = -1;
            }
        }
        return result;
    }

    public String getFioAnswer(int a) {
        if (a == -1)
            fioAnswer = "Ошибка! ФИО введены неверно. Должно быть три слова.";
        return fioAnswer;
    }
}
