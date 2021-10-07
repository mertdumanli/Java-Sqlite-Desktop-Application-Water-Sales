package Threads;

import appPack.CustomerPicture;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class EditCustomerThread implements Runnable {

    private final JButton jbutton;
    private final JTable jtable;
    private final int selectedTable_Left;
    private final JFrame dashboardJframe;

    public EditCustomerThread(JButton jbutton, JTable jtable, int selectedTable_Left, JFrame dashboardJframe) {
        this.jbutton = jbutton;
        this.jtable = jtable;
        this.selectedTable_Left = selectedTable_Left;
        this.dashboardJframe = dashboardJframe;
    }

    @Override
    public void run() {

        CustomerPicture addCustomer = new CustomerPicture(jbutton, jtable, selectedTable_Left, dashboardJframe);
        addCustomer.setVisible(true);

    }

}
