package model.formatter.formatChecking.myCheckings;

public class PhoneNumCheck {

    public String getWrongPhoneNumAnswer() {
        return "Ошибка! Неправильный формат номера телефона";
    }
    public String phoneNumCheckAnswer= "Номер телефона введен верно. Проверяем формат остальных данных...";

    public String checkPhoneNum(String[] infoArray) throws NumberFormatException {
        Long.parseLong(infoArray[2]);
        return phoneNumCheckAnswer;
    }
}
