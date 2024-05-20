public class opcion2 
{
    static validacionM1 vm1 = new validacionM1();
    static menuPrincipal mp = new menuPrincipal();

    public void opcion()
    {
        int opc;
        String menu = "\t\n1. ESTUDIANTES DE DISEÑO.\n" +
                    "2.1 Registrar préstamo de equipo.\n" + 
                    "2.2 Modificar préstamo de equipo. (Por serial o cedula).\n" + 
                    "2.3 Devolución de equipo (se elimina el registro). (Por serial o cedula\n" + 
                    "2.4 Buscar equipo (Por serial o cedula).\n"+
                    "2.5 Volver al menú principal.";

        do {

            opc = vm1.ValidacionM2(menu);

            switch (opc) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                    case 4:
                    
                    break;
            
                default:
                    break;
            }
        } while (opc>0 && opc <=4);

        if (opc == 5)
            mp.menu();
    }
}
