package Projects_OOP.Seminar06.SolidDip;

import Projects_OOP.Seminar06.SolidDip.dip.PrintReport;
import Projects_OOP.Seminar06.SolidDip.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
    }
}
