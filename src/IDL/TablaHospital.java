package IDL;

import IDL.hospitales.hospitalPOA;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto.conexion;

/**
 *
 * @author J.David Paez Ortiz
 */
public class TablaHospital extends hospitalPOA{

    conexion objConec = new conexion();
    
    @Override
    public boolean insertarHospital(int codigoHospital, String nombre, String direccion, String telefono, char estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarHospital(int codigoHospital, String nombre, String direccion, String telefono, char estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarHospital(int codigoHospital) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarHospital(int codigoHospital) {
        String resultado = "";

        try {
            String sqlConsultar = "Select * from hospital where hos_codigo = " + codigoHospital;
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            while (rs.next()) {
                resultado += rs.getString(2) + " - "
                        + rs.getString(3) + " - "
                        + rs.getString(4);
            }
            //Se cierran las conexiones
            rs.close();
            objConec.conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(TablaHospital.class.getName()).log(Level.SEVERE, null, ex);
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
