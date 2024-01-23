package model.formatter;

public class Formatter {

    public String[] createInfoArray(String inText) {
        return inText.split(",");
    }

    public String[] createFioArray(String inText) {
        String[] infoArray = createInfoArray(inText);
        return infoArray[0].split(" ");
    }

    public String surname(String inText) {
        String[] fioArray = createFioArray(inText);
        return fioArray[0];
    }


    public String createTextToWrite(String inText) {
        StringBuilder sb = new StringBuilder();
        String[] infoArray = createInfoArray(inText);
        String[] fioArray = createFioArray(inText);
        for (int i = 0; i < fioArray.length; i++) {
            sb.append("<");
            sb.append(fioArray[i]);
            sb.append(">");
            }
        for (int i = 1; i < infoArray.length; i++) {
            sb.append("<");
            sb.append(infoArray[i]);
            sb.append(">");
        }
        return sb.toString();
    }
}
