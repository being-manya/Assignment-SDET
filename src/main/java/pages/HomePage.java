package pages;

import base.DriverManager;

public class HomePage {
    private final DriverManager driverManager;

    public HomePage(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public String getTitle() {
        return "Home";
    }
}
