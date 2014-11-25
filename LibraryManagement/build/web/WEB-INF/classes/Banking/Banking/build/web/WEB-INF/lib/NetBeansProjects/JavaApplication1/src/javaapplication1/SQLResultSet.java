/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class SQLResultSet 
{
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String name="system";
        String pass="tiger";
        
        Connection con=null;
        
        
        try{    
            Class.forName("oracle.jdbc.driver.OracleDriver");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLResultSet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
}
