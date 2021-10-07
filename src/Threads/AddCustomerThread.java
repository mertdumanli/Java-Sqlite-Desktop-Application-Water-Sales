package Threads;

import appPack.CustomerPicture;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class AddCustomerThread implements Runnable {

    private final JButton jbutton;
    private final JTable jtable;
    private final JFrame dashboardJframe;

    public AddCustomerThread(JButton jbutton, JTable jtable, JFrame dashboardJframe) {
        this.jbutton = jbutton;
        this.jtable = jtable;
        this.dashboardJframe = dashboardJframe;
    }

    @Override
    public void run() {
        CustomerPicture addCustomer = new CustomerPicture(jbutton, jtable, dashboardJframe);
        addCustomer.setVisible(true);
    }

}
