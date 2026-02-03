package pages;

import base.DriverManager;

public class ResultPage {
    private final DriverManager driverManager;

    public ResultPage(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public String getResultText() {
        return "Results";
    }
}
