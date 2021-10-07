package Threads;

import appPack.CustomerPicture;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class AddOrderThread implements Runnable {

    private final JButton jbutton;
    private final JTable jtable;
    private final int selectedTable_Left;
    private final JFrame dashboardJframe;
    private final String satışEkle;

    public AddOrderThread(JButton jbutton, JTable jtable, int selectedTable_Left, JFrame dashboardJframe, String satışEkle) {
        this.jbutton = jbutton;
        this.jtable = jtable;
        this.selectedTable_Left = selectedTable_Left;
        this.dashboardJframe = dashboardJframe;
        this.satışEkle = satışEkle;
    }

    @Override
    public void run() {

        CustomerPicture addCustomer = new CustomerPicture(jbutton, jtable, selectedTable_Left, dashboardJframe, satışEkle);
        addCustomer.setVisible(true);

    }

}
