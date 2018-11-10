package IDL.hospitales;


/**
* hospitales/hospitalHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hospital.idl
* s�bado 10 de noviembre de 2018 06:30:26 PM COT
*/

abstract public class hospitalHelper
{
  private static String  _id = "IDL:hospitales/hospital:1.0";

  public static void insert (org.omg.CORBA.Any a, IDL.hospitales.hospital that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IDL.hospitales.hospital extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (IDL.hospitales.hospitalHelper.id (), "hospital");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static IDL.hospitales.hospital read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_hospitalStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IDL.hospitales.hospital value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static IDL.hospitales.hospital narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof IDL.hospitales.hospital)
      return (IDL.hospitales.hospital)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      IDL.hospitales._hospitalStub stub = new IDL.hospitales._hospitalStub ();
      stub._set_delegate(delegate);
      return (hospital) stub;
    }
  }

  public static IDL.hospitales.hospital unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof IDL.hospitales.hospital)
      return (IDL.hospitales.hospital)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      IDL.hospitales._hospitalStub stub = new IDL.hospitales._hospitalStub ();
      stub._set_delegate(delegate);
      return (hospital) stub;
    }
  }

}