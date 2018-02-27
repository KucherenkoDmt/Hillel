package HomeWork.Log;

import java.io.IOException;

public class TextAndFileLogger extends AbstractLogger{
    @Override
    public void doLogging(String stringToLog) {
        System.out.println(stringToLog);
        try {
            toFile(stringToLog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
