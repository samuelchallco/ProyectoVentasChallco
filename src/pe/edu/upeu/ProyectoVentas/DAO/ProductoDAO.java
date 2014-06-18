/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.ProyectoVentas.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import pe.edu.upeu.ProyectoVentas.config.Conexion;

/**
 *
 * @author alum.fial7
 */
public class ProductoDAO {
    int op = 0;
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    public int registrarProducto(int idc, String prod, double pr, int cant){
        sql="INSERT INTO Producto VALUES(null,'"+prod+"','"+pr+"','"+cant+"','"+idc+"')";
        try{ 
            cx = Conexion.getConex();
            st = cx.createStatement();
            op = st.executeUpdate(sql);
            cx.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        return op;
    }
}
