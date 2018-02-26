package HomeWork.Log;

import java.io.IOException;

public class TextAndFilleLogger extends AbstractLogger{
    @Override
    protected void doLogging(String stringToLog) {
        System.out.println(stringToLog);
        try {
            toFile(stringToLog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
