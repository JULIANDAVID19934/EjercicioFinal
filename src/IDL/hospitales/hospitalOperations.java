package IDL.hospitales;


public interface hospitalOperations 
{
  boolean insertarHospital (int codigoHospital, String nombre, String direccion, String telefono, char estado);
  boolean actualizarHospital (int codigoHospital, String nombre, String direccion, String telefono, char estado);
  boolean eliminarHospital (int codigoHospital);
  String consultarHospital (int codigoHospital);
  void shoutdown ();
} // interface hospitalOperations
