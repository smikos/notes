package model.formatter.formatChecking;

import model.formatter.formatChecking.myCheckings.*;
import model.myExceptions.MyCheckFormatException;

import java.text.ParseException;

public class FormatChecking {

    public static int inDataQty = 4;
    //TODO Заменить "4" на ссылку

    int checkSum = 0;

    public static int getInDataQty() {
        return inDataQty;
    }

    public FormatChecking() {
    }

    ParametersQtyCheck parametersQtyCheck = new ParametersQtyCheck();
    FIOArrayCheck fioArrayCheck = new FIOArrayCheck();
    SurnameCheck surnameCheck = new SurnameCheck();
    BirthdayCheck birthdayCheck = new BirthdayCheck();
    PhoneNumCheck phoneNumCheck = new PhoneNumCheck();
    GenderCheck genderCheck = new GenderCheck();

    String answer = "Ваши данные успешно прошли проверку. Идет сохранение....";


    public int formatCheck(String[] infoArray) {

        StringBuilder sb = new StringBuilder();

        // проверка №1 на общее кол-во параметров
        int result = parametersQtyCheck.checkParametersQty(infoArray);
        if (result != inDataQty) {
            checkSum += 1;
            sb.append(parametersQtyCheck.getAnswer(result));
            sb.append("\n");
        }
        System.out.println(parametersQtyCheck.getAnswer(result));


        // проверка №2 на кол-во параметров ФИО
        result = fioArrayCheck.checkFioArray(infoArray);
        if (result == -1) {
            checkSum += 1;
            sb.append(fioArrayCheck.getFioAnswer(result));
            sb.append("\n");
        }
        System.out.println(fioArrayCheck.getFioAnswer(result));

        // проверка №2а на то, что Фамилия - не пробел
        result = surnameCheck.checkSurname(infoArray);
        if (result == -1) {
            checkSum += 1;
            sb.append(surnameCheck.getSurnameAnswer(result));
            sb.append("\n");
        }
        System.out.println(surnameCheck.getSurnameAnswer(result));

        // проверка №3 на формат даты рождения
        try {
            System.out.println(birthdayCheck.birthdayFormatCheck(infoArray));
        } catch (ParseException e) {
            checkSum += 1;
            sb.append(birthdayCheck.getWrongDateCheckAnswer());
            sb.append("\n");
            System.out.println(birthdayCheck.getWrongDateCheckAnswer());
        }

        // проверка №4 на формат номера телефона
        try {
            System.out.println(phoneNumCheck.checkPhoneNum(infoArray));
        } catch (NumberFormatException e) {
            checkSum += 1;
            sb.append(phoneNumCheck.getWrongPhoneNumAnswer());
            sb.append("\n");
            System.out.println(phoneNumCheck.getWrongPhoneNumAnswer());
        }

        // проверка №5 на формат данных о поле
        result = genderCheck.genderFormatCheck(infoArray);
        if (result == -1) {
            checkSum += 1;
            sb.append(genderCheck.getGenderCheckAnswer(result));
            sb.append("\n");
        }
        System.out.println(genderCheck.getGenderCheckAnswer(result));

        return checkSum;
    }
}

