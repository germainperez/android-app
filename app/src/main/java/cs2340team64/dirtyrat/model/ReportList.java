package cs2340team64.dirtyrat.model;

import java.util.ArrayList;

/**
 * Created by diogo on 10/12/2017.
 */

public class ReportList {

    public static ArrayList<Report> reports = new ArrayList<>();

    private static Report currentReport;

    public static void setCurrentReport(Report report) {
        currentReport = report;
    }

    public static Report getCurrentReport() {
        return currentReport;
    }

}