package Projects_OOP.Seminar06.SolidDip.src.solid.dip;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;	// Отчетные данные
    private Printable printable;

    public Report(Printable printable) {
        this.printable = printable;
    }

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        printable.output(items);
    }
}