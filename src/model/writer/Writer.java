package model.writer;

import java.io.Serializable;

public interface Writer {

    boolean write(String inData, String filePath) throws Exception;
}
