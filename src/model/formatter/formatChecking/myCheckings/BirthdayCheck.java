package model.formatter.formatChecking.myCheckings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayCheck {

    public String getWrongDateCheckAnswer() {
        return "Ошибка! Дата введена неверно";
    }

    public String dateCheckAnswer= "Дата введена верно. Проверяем формат остальных данных...";

    public String birthdayFormatCheck(String[] infoArray) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat();
        df.applyPattern("dd.MM.yyyy");
        df.parse(infoArray[1]);
        return dateCheckAnswer;
    }
}
