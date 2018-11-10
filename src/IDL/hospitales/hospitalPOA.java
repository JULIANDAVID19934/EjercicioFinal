package IDL.hospitales;


public abstract class hospitalPOA extends org.omg.PortableServer.Servant
 implements IDL.hospitales.hospitalOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarHospital", new java.lang.Integer (0));
    _methods.put ("actualizarHospital", new java.lang.Integer (1));
    _methods.put ("eliminarHospital", new java.lang.Integer (2));
    _methods.put ("consultarHospital", new java.lang.Integer (3));
    _methods.put ("shoutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // hospitales/hospital/insertarHospital
       {
         int codigoHospital = in.read_long ();
         String nombre = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         char estado = in.read_char ();
         boolean $result = false;
         $result = this.insertarHospital (codigoHospital, nombre, direccion, telefono, estado);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // hospitales/hospital/actualizarHospital
       {
         int codigoHospital = in.read_long ();
         String nombre = in.read_wstring ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         char estado = in.read_char ();
         boolean $result = false;
         $result = this.actualizarHospital (codigoHospital, nombre, direccion, telefono, estado);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // hospitales/hospital/eliminarHospital
       {
         int codigoHospital = in.read_long ();
         boolean $result = false;
         $result = this.eliminarHospital (codigoHospital);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // hospitales/hospital/consultarHospital
       {
         int codigoHospital = in.read_long ();
         String $result = null;
         $result = this.consultarHospital (codigoHospital);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // hospitales/hospital/shoutdown
       {
         this.shoutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:hospitales/hospital:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public hospital _this() 
  {
    return hospitalHelper.narrow(
    super._this_object());
  }

  public hospital _this(org.omg.CORBA.ORB orb) 
  {
    return hospitalHelper.narrow(
    super._this_object(orb));
  }


} // class hospitalPOA
