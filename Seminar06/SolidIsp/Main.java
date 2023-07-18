package Projects_OOP.Seminar06.SolidIsp;

import Projects_OOP.Seminar06.SolidIsp.isp.InternetPaymentService;
import Projects_OOP.Seminar06.SolidIsp.isp.TerminalPaymentService;

public class Main {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payCreditCard(10);
        internetService.payPhoneNumber(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
    }
}
