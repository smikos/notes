package model.formatter.formatChecking.myCheckings;

import model.formatter.formatChecking.FormatChecking;

public class ParametersQtyCheck {

    int inDataQty = FormatChecking.getInDataQty();
    String paramAnswer = "Количество данных верное. Проверяем формат данных...";

    public int checkParametersQty(String[] infoArray) {

        int result = inDataQty;

        if (infoArray.length < inDataQty) {
            result = -1;
        }
        if (infoArray.length > inDataQty) {
            result = 1;
        }
        return result;
    }

    public String getAnswer(int a) {
        if (a < 0) {
            paramAnswer = "Ошибка! Вы ввели меньше данных, чем требуется!";
        }
        if (a != inDataQty) {
            paramAnswer = "Ошибка! Вы ввели больше данных, чем требуется!";
        }
        return paramAnswer;
    }
}

