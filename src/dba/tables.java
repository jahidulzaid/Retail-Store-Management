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
        Statement st   = null;
        try {
            con = ConnectionProvider.getCon();
            st  = con.createStatement();
            st.executeUpdate("INSERT INTO appuser(\n" +
"    userRole,\n" +
"    NAME,\n" +
"    mobileNumber,\n" +
"    email,\n" +
"    password,\n" +
"    address,\n" +
"STATUS\n" +
")\n" +
"VALUES(\n" +
"    'Admin',\n" +
"    'Jahidul Islam',\n" +
"    '1234567890',\n" +
"    'jahidul@gmail.com',\n" +
"    'password123',\n" +
"    '123 Kanchan, Vulta, Rupgonj',\n" +
"    'Active'\n" +
");");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
            
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally{
            try {
               con.close();
               st.close();
            } catch (Exception e) {
            }
        }
        
    }
    
}
