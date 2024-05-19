public class ESTUDIANTE_INGENIERIA 
{
            private String Cedula;
            private String Nombre;
            private String Apellido;
            private String Telefono;
            private int semestreAct;
            private String Serial;
            private float Prom;
            public ESTUDIANTE_INGENIERIA(String cedula, String nombre, String apellido,String telefono, 
                                        int semestreact, String serial, float prom) 
            {
        
                Cedula = cedula;
                Nombre = nombre;
                Apellido = apellido;
                Telefono = telefono;
                semestreAct = semestreact;
                Serial = serial;
                Prom = prom;
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
            public int getsemestreAct() {
                return semestreAct;
            }
            public void setsemestreAct(int semestreact) {
                semestreAct = semestreact;
            }
            public String getSerial() {
                return Serial;
            }
            public void setSerial(String serial) {
                Serial = serial;
            }  

            public float getProm() {
                return Prom;
            }
            public void setProm(float prom) {
                Prom = prom;
            }  
    }

