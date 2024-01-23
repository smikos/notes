package model.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterToFile implements Writer {

    public WriterToFile() {
    }

    @Override
    public boolean write(String inData, String filePath){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));){
            bw.write(inData);
            bw.write("\n");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
