package appPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import props.Admin;

public class DB {

    private final String driver = "org.sqlite.JDBC";
    private final String url = "jdbc:sqlite:db/DB.db";

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
    public boolean fncAdminLogin(String email, String password) {
        boolean status = false;
        try {
            String sql = " SELECT * FROM admin WHERE password = ? and email = ? ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, Utils.MD5(password));
            pre.setString(2, email);
            ResultSet rs = pre.executeQuery();
            status = rs.next();
            if (status) {
                admin.setAid(rs.getInt("aid"));
                admin.setEmail(rs.getString("email"));
                admin.setName(rs.getString("name"));
            }
        } catch (SQLException e) {
            System.err.println("Login Error : " + e);
        }

        return status;
    }

    // Product List
    public DefaultTableModel allProduct() {
        DefaultTableModel dtm = new DefaultTableModel();

        // add Cloumn
        dtm.addColumn("Sıra No");
        dtm.addColumn("Başlık");
        dtm.addColumn("Detay");

        // add Rows
        try {
            String sql = "select * from Notlar";
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                int nid = rs.getInt("nID");
                String title = rs.getString("title");
                String detail = rs.getString("detail");
                Object[] row = {nid, title, detail};
                dtm.addRow(row);
            }
        } catch (SQLException e) {
            System.err.println("allProduct Error : " + e);
        }

        return dtm;
    }

    // Product Insert
    public int productInsert(String title, String detail) {
        int status = 0;

        try {
            String sql = " insert into Notlar values ( null, ?, ? ) ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, title);
            pre.setString(2, detail);
            status = pre.executeUpdate();
        } catch (SQLException e) {
            System.err.println("productInsert Error : " + e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                status = -1;
            }
        }
        return status;
    }

    // Product Update
    public int productUpdate(int nid, String title, String detail) {

        int status = 0;

        try {
            String sql = " update Notlar set title = ?, detail = ? where nId = ? ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, title);
            pre.setString(2, detail);
            pre.setInt(3, nid);
            status = pre.executeUpdate();
        } catch (SQLException e) {
            System.err.println("productUpdate Error : " + e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                status = -1;
            }
        }

        return status;

    }

    //Product Delete
    public int productDelete(int nid) {

        int status = 0;

        try {
            String sql = "Delete From Notlar Where nId = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, nid);
            status = pre.executeUpdate();
        } catch (SQLException e) {
            System.err.println("productDelete Error : " + e);
        }

        return status;

    }

    //Change Pass
    public boolean changePassword(String email, String oldPass, String newPass) {

        boolean status = false;
        try {
            String sql = " SELECT * FROM admin WHERE password = ? and email = ? ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, Utils.MD5(oldPass));
            pre.setString(2, email);
            ResultSet rs = pre.executeQuery();
            status = rs.next();

            if (status) {
                if (rs.getString("email").equals(email) && rs.getString("password").equals(Utils.MD5(oldPass))) {
                    int id = rs.getInt("aid");

                    try {
                        sql = "UPDATE ADMIN SET password = ? WHERE aID = ?";
                        pre = conn.prepareStatement(sql);
                        pre.setString(1, Utils.MD5(newPass));
                        pre.setInt(2, id);
                        int i = pre.executeUpdate();
                        /*if (i != 0) {
                            System.out.println("eski şifre yenisiyle aynı.");
                        }*/
                    } catch (SQLException e) {
                        System.err.println("changePassword(2) Error : " + e);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("changePassword(1) Error : " + e);
        }

        return status;
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
