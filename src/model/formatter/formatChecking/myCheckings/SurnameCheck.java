package model.formatter.formatChecking.myCheckings;

public class SurnameCheck {
    String surnameAnswer = "Фамилия введена верно. Проверяем формат остальных данных...";

    int result = 0;

    public int checkSurname(String[] infoArray) {
        String[] fioArray = infoArray[0].split(" ");
        if (fioArray[0].isEmpty()){
            System.out.println("Empty");
        }

        if (fioArray[0].equals(" ") || fioArray[0].isEmpty()) {
            result = -1;
        }
        return result;
    }

    public String getSurnameAnswer(int a) {
        if (a == -1)
            surnameAnswer = "Ошибка! Вместо фамилии введен пробел";
        return surnameAnswer;
    }
}

