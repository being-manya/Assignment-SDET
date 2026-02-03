package base;

public class DriverManager {
    private static final DriverManager INSTANCE = new DriverManager();
    private Object driver;

    private DriverManager() {
    }

    public static DriverManager getInstance() {
        return INSTANCE;
    }

    public Object getDriver() {
        return driver;
    }

    public void setDriver(Object driver) {
        this.driver = driver;
    }

    public void quit() {
        this.driver = null;
    }
}
