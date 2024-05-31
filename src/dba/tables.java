/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dba;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jahid
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();

            //st.executeUpdate("INSERT INTO appuser( userRole, NAME, mobileNumber, email, password, address, STATUS) VALUES('Admin', 'Jahidul Islam', '1234567890', 'jahidul@gmail.com', 'password123',  '123 Kanchan, Vulta, Rupgonj', 'Active');");
            //create table: Category
            //st.executeUpdate("CREATE TABLE category(category_sl INT AUTO_INCREMENT PRIMARY KEY, NAME VARCHAR(200))");
            //st.executeUpdate("CREATE TABLE product(product_sl INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), quantity INT, price FLOAT, description VARCHAR(500), category_fk INT);");
            //st.executeUpdate("CREATE TABLE customer(customer_sl INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200),mobileNumber VARCHAR(50), email VARCHAR(200) );");
            st.executeUpdate("CREATE TABLE orderDetail(order_sl INT AUTO_INCREMENT PRIMARY KEY, orderId VARCHAR(200), customer_fk int, orderDate varchar(200),totalPaid float);");

            JOptionPane.showMessageDialog(null, "Table Created Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {
            }
        }

    }

}
