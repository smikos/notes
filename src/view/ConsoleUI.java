package view;

import presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {

    private Presenter presenter;
    private Scanner scanner;
    boolean work;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
    }

    @Override
    public void start() {
        System.out.println("Здравствуйте. Что выбираете? Укажите цифру: ");
        while (work) {
            System.out.println("1 - Ввести данные.");
            System.out.println("2 - Выйти из приложения.");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Введите через пробел фамилию, имя и отчество, \n" +
                            "поставьте запятую и далее в этой же строке введите через запятую следующие данные:\n" +
                            "- дату рождения (текст в формате dd.mm.yyyy),\n" +
                            "- номер телефона (10 цифр подряд без пробелов и тире),\n" +
                            "- пол (один символ латиницей (f или m)).\n" +
                            "Например: Иванов Иван Иванович,31.12.1998,9991234567,m");
                    String inText = scanner.nextLine();
                    presenter.getInfo(inText);
                    break;
                case "2":
                    finish();
            }
        }
    }

    private void finish() {
        System.out.println("Спасибо, что воспользовались нашим сервисом. Ждем вас снова!");
        work = false;
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}

