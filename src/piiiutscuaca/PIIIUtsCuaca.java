/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import piiiutscuaca.res.Service;
import piiiutscuaca.view.FrmCuaca;
import piiiutscuaca.view.koneksi;

/**
 * main class
 * @author hahn
 */
public class PIIIUtsCuaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("");
        dataSource.setDatabaseName("p3_java?serverTimezone=UTC");
        dataSource.setServerName("localhost");

        dataSource.setPortNumber(3306);
        Service service = new Service();
        service.setDataSource(dataSource);
        
        koneksi koneksi = new koneksi();
        koneksi.setLocationRelativeTo(null);
        koneksi.setVisible(true);
        
        //FrmCuaca frmCuaca = new FrmCuaca();
        //frmCuaca.setLocationRelativeTo(null);
        //frmCuaca.setVisible(true);
    }
    
}
