/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import dba.RetailStoreFiles;
import javax.swing.JOptionPane;

/**
 *
 * @author Jahid
 */
public class OpenPdf {

    public static void OpenById(String id) {
        try {
            if ((new File(RetailStoreFiles.billPath + id + ".pdf")).exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtectionHandler " + RetailStoreFiles.billPath + "" + id + ".pdf");
            } else {
                JOptionPane.showMessageDialog(null, "File doesn't exits");
            }

            {

            }
        } catch (Exception e) {
        }
    }
}
