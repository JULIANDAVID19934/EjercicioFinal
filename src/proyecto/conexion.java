package proyecto;
import java.sql.*;


public class conexion {
    
    public static void main(String[] args) {
        conexion c = new conexion();
        
        c.conectar();
    }
    
    public Connection conex;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conex=DriverManager.getConnection("jdbc:mysql://localhost/hopitalneiva","root","");
            System.out.println("Conexion Establecida");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conex;
    }
    
}
