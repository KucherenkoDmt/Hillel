package HomeWork.Log;


public class Log extends AbstractLogger {

    @Override
    protected void doLogging(String stringToLog) {
        System.out.println(stringToLog);
    }

}
