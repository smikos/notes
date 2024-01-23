package model.formatter.formatChecking.myCheckings;

public class GenderCheck {

    public String genderCheckAnswer = "Формат данных о поле корректен. Завершаем проверку...";
    int result = 0;

    public String getGenderCheckAnswer(int a) {
        if (a == -1) {
            genderCheckAnswer = "Ошибка! Неверный формат данных о поле";
        }
        return genderCheckAnswer;
    }

    public int genderFormatCheck(String[] infoArray) {
        if (!infoArray[3].equals("m") && !infoArray[3].equals("f")) {
            result = -1;
        }
        return result;
    }
}
