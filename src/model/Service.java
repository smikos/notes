package model;

import model.formatter.Formatter;
import model.formatter.formatChecking.FormatChecking;
import model.myExceptions.MyCheckFormatException;
import model.writer.Writer;
import model.writer.WriterToFile;

import java.io.IOException;
import java.util.Arrays;

public class Service {

    Formatter formatter;
    FormatChecking formatChecking;
    private Writer writer = new WriterToFile();
    String filePath;
    boolean work;
    private int checkSum;

    public void processData(String text) {
        Formatter formatter = new Formatter();
        FormatChecking formatChecking = new FormatChecking();
        work = true;
        while (work) {
            String[] infoArray = formatter.createInfoArray(text);
            System.out.println("Вы ввели следующие данные: " + Arrays.toString(infoArray));
            try {
                checkSum = formatChecking.formatCheck(infoArray);
                if (checkSum > 0) {
                    throw new MyCheckFormatException();
                }
            } catch (MyCheckFormatException e) {
                System.out.println(e.getMessage());
            }
            if (!mistakeFinish(checkSum)) {
                filePath = formatter.surname(text);
                System.out.println("Имя файла, куда будут записаны данные: " + filePath);
                String textToWrite = formatter.createTextToWrite(text);
                try {
                    writer.write(textToWrite, filePath);
                    System.out.println("Данные успешно записаны!");
                } catch (Exception e) {
                    System.out.println("Ошибка при записи файла: " + e.getMessage());
                }
            }

            work = false;
        }
    }

    private boolean mistakeFinish(int a) {
        return a > 0;
    }
}
