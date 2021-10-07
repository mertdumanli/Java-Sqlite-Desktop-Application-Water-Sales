package DB;

import Utils.Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import props.Admin;
import props.Customer;

public class DB {

    private final String driver = "org.sqlite.JDBC";
    private final String url = "jdbc:sqlite:db/db.db";

    private Connection conn = null;
    private PreparedStatement pre = null;

    public static Admin admin = new Admin();

    public DB() {//Constructor
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
            System.out.println("Connection Success");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error : " + e);
        }
    }

    // admin login
    public boolean fncAdminLogin(String username, String password) {
        boolean status = false;
        try {
            String sql = " SELECT * FROM admin WHERE admin_password = ? and admin_username = ? ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, Utils.MD5(password));
            pre.setString(2, username);
            ResultSet rs = pre.executeQuery();
            status = rs.next();
            if (status) {
                admin.setA_id(rs.getInt("a_id"));
                admin.setAdmin_username(rs.getString("admin_username"));
                admin.setAdmin_password(rs.getString("admin_password"));
                admin.setAdmin_name(rs.getString("admin_name"));
                admin.setAdmin_surname(rs.getString("admin_surname"));
            }
        } catch (SQLException e) {
            System.err.println("fncAdminLogin : " + e);
        }
        return status;
    }

    // Product List Table Left
    public DefaultTableModel allProductLeft() {
        DefaultTableModel dtm = new DefaultTableModel();

        // add Cloumn
        dtm.addColumn("Id");
        dtm.addColumn("Adı");
        dtm.addColumn("Soyadı");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");

        // add Rows
        try {
            String sql = "select * from customer";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int c_id = rs.getInt("c_id");
                String customer_name = rs.getString("customer_name");
                String customer_surname = rs.getString("customer_surname");
                String customer_tel = rs.getString("customer_tel");//benzersiz
                String customer_address = rs.getString("customer_address");

                Object[] row = {c_id, customer_name, customer_surname, customer_tel, customer_address};
                dtm.addRow(row);
            }
        } catch (SQLException e) {
            System.err.println("allProductLeft Error : " + e);
        }

        return dtm;
    }

    // Product List Table Right
    public DefaultTableModel allProductRight() {
        DefaultTableModel dtm = new DefaultTableModel();

        // add Cloumn
        dtm.addColumn("Id");
        dtm.addColumn("Müşteri Adı");
        dtm.addColumn("Müşteri Soyadı");
        dtm.addColumn("Durum");
        dtm.addColumn("Adres");
        dtm.addColumn("Tutar");

        // add Rows
        try {
            String sql = "select * from orders";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int o_id = rs.getInt("o_id");
                String customer_name = rs.getString("customer_name");
                String customer_surname = rs.getString("customer_surname");
                String status = rs.getString("status");
                String customer_address = rs.getString("customer_address");
                String amount = rs.getString("amount");

                Object[] row = {o_id, customer_name, customer_surname, status, customer_address, amount};
                dtm.addRow(row);
            }
        } catch (SQLException e) {
            System.err.println("allProductRight Error : " + e);
        }

        return dtm;
    }

    //customer Searching
    public DefaultTableModel customerSearching(String inputMüşteriAdı, String inputMüşteriSoyadı) {
        DefaultTableModel dtm = new DefaultTableModel();

        dtm.addColumn("Id");
        dtm.addColumn("Adı");
        dtm.addColumn("Soyadı");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");

        try {
            String sql = " select * from customer where customer_name = ? COLLATE NOCASE and customer_surname = ? COLLATE NOCASE";
            pre = conn.prepareStatement(sql);
            pre.setString(1, inputMüşteriAdı);
            pre.setString(2, inputMüşteriSoyadı);
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                int c_id = rs.getInt("c_id");
                String customer_name = rs.getString("customer_name");
                String customer_surname = rs.getString("customer_surname");
                String customer_tel = rs.getString("customer_tel");//benzersiz
                String customer_address = rs.getString("customer_address");

                Object[] row = {c_id, customer_name, customer_surname, customer_tel, customer_address};
                dtm.addRow(row);

            }
        } catch (SQLException e) {
            System.err.println("customerSearching Error : " + e);

        }

        return dtm;

    }

    //Customer Adding
    public DefaultTableModel customerAdding(String name, String surname, String tel, String address, JTextField error1, JTextField error2) {
        try {
            String sql = " insert into customer values ( null, ?, ?, ?, ? ) ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, tel);
            pre.setString(4, address);
            pre.executeUpdate();

            error1.setText("");
            error2.setText("");

        } catch (SQLException e) {
            System.err.println("customerAdding Error : " + e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                error1.setText("A customer with this phone");
                error2.setText("number already exists.");
            }
        }
        return allProductLeft();
    }

    //Customer Editing
    public DefaultTableModel customerEditing(String name, String surname, String tel, String address, JTextField error1, JTextField error2, int selectedTable_Left) {

        //Düzenlenen kişi bir başkasının telefon numarasını alamaz.
        Customer customer = getCustomerInfo(selectedTable_Left);//Sileceğim kişinin bilgelerini yedekledim.(Eğerki farklı birinin numarasını kendi numarası yapmaya çalışırsa iptal edeceğim işlemi.)
        customerDeleting(selectedTable_Left);//Düzenlenen kişiyi listeden sildim.

        try {
            String sql = " insert into customer values ( ?, ?, ?, ?, ? ) ";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, selectedTable_Left);
            pre.setString(2, name);
            pre.setString(3, surname);
            pre.setString(4, tel);
            pre.setString(5, address);
            pre.executeUpdate();
        } catch (SQLException e) {
            System.err.println("customerAdding Error : " + e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                try {
                    error1.setText("A customer with this phone");
                    error2.setText("number already exists.");

                    System.out.println("İşlemi iptal ettim. Başka birinin telefon numarasını almaya çalışıyor!");

                    String sql = "insert into customer values (?, ?, ?, ?, ?)";

                    pre = conn.prepareStatement(sql);
                    pre.setInt(1, selectedTable_Left);
                    pre.setString(2, customer.getCustomer_name());
                    pre.setString(3, customer.getCustomer_surname());
                    pre.setString(4, customer.getCustomer_tel());
                    pre.setString(5, customer.getCustomer_address());
                    pre.executeUpdate();
                } catch (SQLException ex) {
                    System.err.println("2.try on customerEditing -  Error: " + ex);
                }
            }
        }
        return allProductLeft();
    }

    //Customer Getting Information for edit picture
    public Customer getCustomerInfo(int id) {

        Customer customer = new Customer();

        try {
            String sql = " SELECT * FROM customer WHERE c_id = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, id);

            ResultSet rs = pre.executeQuery();
            customer.setCustomer_name(rs.getString("customer_name"));
            customer.setCustomer_surname(rs.getString("customer_surname"));
            customer.setCustomer_tel(rs.getString("customer_tel"));
            customer.setCustomer_address(rs.getString("customer_address"));

        } catch (SQLException e) {
            System.err.println("getCustomerInfo : " + e);
        }

        return customer;
    }

    //Customer Deleting
    public void customerDeleting(int selectedTable_Left) {

        try {
            String sql = "Delete From customer Where c_id = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, selectedTable_Left);
            pre.executeUpdate();
        } catch (SQLException e) {
            System.err.println("customerDeleting Error : " + e);
        }
    }

    public void orderDeleting(int selectedTable_Right) {
        try {
            String sql = "Delete From orders Where o_id = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, selectedTable_Right);
            pre.executeUpdate();
        } catch (SQLException e) {
            System.err.println("ordersDeleting Error : " + e);
        }
    }

    public void orderAllDeleting() {
        try {
            String sql = "Delete From orders";
            pre = conn.prepareStatement(sql);
            pre.executeUpdate();
        } catch (SQLException e) {
            System.err.println("orderAllDeleting Error : " + e);
        }
    }

    public DefaultTableModel orderAdding(String name, String surname, String address, String amount, String tel) {
        String status = "Hazırlanıyor.";
        String processingTime = java.time.LocalDate.now().toString();

        try {
            String sql = " insert into orders values ( null, ?, ?, ?, ?, ?, ? ,? ) ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, status);
            pre.setString(4, address);//unique
            pre.setString(5, amount);
            pre.setString(6, tel);
            pre.setString(7, processingTime);
            pre.executeUpdate();
        } catch (SQLException e) {
            System.err.println("orderAdding Error : " + e);
        }
        return allProductRight();
    }

    public void setOff(int selectedTable_Right, int selection) {
        String status0 = "Hazırlanıyor.";
        String status1 = "Yola Çıktı.";
        String status2 = "Teslim Edildi.";

        if (selection == 1) {
            try {
                String sql = "UPDATE orders set status = ? where o_id = ? and status = ? and status != ?";
                pre = conn.prepareStatement(sql);
                pre.setString(1, status1);//Yola çıktı olacak...
                pre.setInt(2, selectedTable_Right);
                pre.setString(3, status0);
                pre.setString(4, status2);
                pre.executeUpdate();
            } catch (SQLException e) {
                System.err.println("setOff Error selection = 1 : " + e);
            }
        } else if (selection == 2) {
            try {
                String sql = "UPDATE orders set status = ? where o_id = ? and status = ? and status != ?";
                pre = conn.prepareStatement(sql);
                pre.setString(1, status2);//Teslim Edildi olacak...
                pre.setInt(2, selectedTable_Right);
                pre.setString(3, status1);
                pre.setString(4, status0);
                pre.executeUpdate();
            } catch (SQLException e) {
                System.err.println("setOff Error selection = 2 : " + e);
            }

        }

    }

    public void listTodaysOrders(String currentTime, JTable table2) {

        DefaultTableModel dtm = new DefaultTableModel();

        // add Cloumn
        dtm.addColumn("Id");
        dtm.addColumn("Müşteri Adı");
        dtm.addColumn("Müşteri Soyadı");
        dtm.addColumn("Durum");
        dtm.addColumn("Adres");
        dtm.addColumn("Tutar");

        // add Rows
        try {
            String sql = "SELECT * from orders where processing_time = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, currentTime);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int o_id = rs.getInt("o_id");
                String customer_name = rs.getString("customer_name");
                String customer_surname = rs.getString("customer_surname");
                String status = rs.getString("status");
                String customer_address = rs.getString("customer_address");
                String amount = rs.getString("amount");

                Object[] row = {o_id, customer_name, customer_surname, status, customer_address, amount};
                dtm.addRow(row);
            }
        } catch (SQLException e) {
            System.err.println("listTodayOrders Error : " + e);
        }
        table2.setModel(dtm);
    }

    public void close() {
        try {
            if (!conn.isClosed()) {
                conn.close();
            }
            if (pre != null) {
                pre.close();
            }
        } catch (SQLException e) {
            System.err.println("Close Error : " + e);
        }
    }
}
