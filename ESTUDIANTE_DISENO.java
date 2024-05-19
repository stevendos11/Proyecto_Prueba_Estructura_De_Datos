public class ESTUDIANTE_DISENO 
{
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int AsigV;
    private int Serial;
    private String Modalidad;
    public ESTUDIANTE_DISENO(String cedula, String nombre, String apellido,String telefono, 
                                int Asigv, int serial, String modalidad) 
    {

        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        AsigV = Asigv;
        Serial = serial;
        Modalidad = modalidad;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public int getAsigV() {
        return AsigV;
    }
    public void setsAsigV(int Asigv) {
        AsigV = Asigv;
    }
    public int getSerial() {
        return Serial;
    }
    public void setSerial(int serial) {
        Serial = serial;
    }  

    public String getModalidad() {
        return Modalidad;
    }
    public void setModalidad(String modalidad ) {
        Modalidad = modalidad;
    }  
}
