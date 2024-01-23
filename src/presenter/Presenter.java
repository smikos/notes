package presenter;

import model.Service;
import view.View;


public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void getInfo(String text) {
        view.printAnswer("Ваши данные проверяются...");
        service.processData(text);

    }
}
