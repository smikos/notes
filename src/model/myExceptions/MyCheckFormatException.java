package model.myExceptions;

public class MyCheckFormatException extends RuntimeException{

    public MyCheckFormatException() {
        super("Некоторые данные введены неверно. см.выше строчки со словом \"Ошибка!\".\n" +
                "Если хотите, то повторите ввод. Что вы хотите сделать? Укажите цифру.");
    }
}