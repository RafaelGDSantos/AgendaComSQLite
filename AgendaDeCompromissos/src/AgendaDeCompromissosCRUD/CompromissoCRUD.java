/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaDeCompromissosCRUD;

import AgendaDeCompromissos.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael Giovanni
 */
public class CompromissoCRUD {
    
    public static void Create(String nome, String data, String hora, String informaçao){ 
        Connection conn = DBConnection.openConnection();
        PreparedStatement sql;
        try {
            sql = conn.prepareStatement ("INSERT INTO agenda(nome, data, hora, informaçao)VALUES ('"+nome+"''"+data+"''"+hora+"''"+informaçao+"')");
                    sql.executeUpdate();
                    } 
        catch (SQLException ex) {
            Logger.getLogger(CompromissoCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBConnection.closeConnection(conn);
    }
}
}
