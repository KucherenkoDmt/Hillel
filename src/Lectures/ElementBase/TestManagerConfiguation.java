package Lectures.ElementBase;

public class TestManagerConfiguation {
    private static TestManagerConfiguation instance;

    TestManagerConfiguation() {
    }

    public static TestManagerConfiguation getInstance() {
        if (instance == null) {
            instance = new TestManagerConfiguation();
        }
        return instance;
    }

    public String getTestBrowser() {
        return System.getenv("testBrowser") == null ? "Crome" : System.getenv("testBrowser");
    }

    public String getTestEnv() {
        return valueOrDefault(System.getenv("testEnv"), "Prodaction");
    }

    private String valueOrDefault(String envVar, String defoltValue) {
        return envVar == null ? defoltValue : envVar;
    }
}
