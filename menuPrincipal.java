public class menuPrincipal 
{
    static validacionM1 vm1 = new validacionM1();
    static opcion1 op1 = new opcion1();
    static opcion2 op2 = new opcion2();

    public void menu()
    {
        int opc;
        String menu = "\t\nMenú\n" +
                    "1. Estudiante de Ingenieria.\n" + 
                    "2. Estudiante de diseño.\n" + 
                    "3. Inventario Total.\n" + 
                    "4. Salir del programa.";

        do {

            opc = vm1.Validacion(menu);

            switch (opc) {
                case 1:
                    op1.opcion();
                    break;
                case 2:
                    op2.opcion();
                    break;
                case 3:
                    
                    break;
                default:
                    vm1.Mensaje("Gracias por utilizar el programa. ");
                    break;
            }
        } while (opc>0 && opc <=4);
    }
}
