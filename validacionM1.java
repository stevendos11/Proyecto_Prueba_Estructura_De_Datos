import javax.swing.JOptionPane;

public class validacionM1 
{
   public int Validacion ( String Texto )
    { try 
      {  int Dato = Integer.parseInt ( JOptionPane.showInputDialog(null, Texto ));
         if ( Dato > 0 && Dato < 5 )
            return Dato;
         else {
            Mensaje( "Opcion no valida, Intentar de nuevo." );
          return Validacion(Texto);
         }
      }catch (Exception ex){
          Mensaje( "Error, Tipo de dato no válido" );
          return Validacion(Texto);
      }
    }    

    public void   Mensaje ( String Texto )
    {
       JOptionPane.showMessageDialog ( null, Texto );
    }

    public int ValidacionM2 ( String Texto )
    { try 
      {  int Dato = Integer.parseInt ( JOptionPane.showInputDialog(null, Texto ));
         if ( Dato > 0 && Dato <= 5 )
            return Dato;
         else {
            Mensaje( "Opcion no valida, Intentar de nuevo." );
          return Validacion(Texto);
         }
      }catch (Exception ex){
          Mensaje( "Error, Tipo de dato no válido" );
          return Validacion(Texto);
      }
    }  
        
        public String noContieneEspecialesONumeros(String Texto) 
        {
                try 
                    {   String Dato = JOptionPane.showInputDialog(null, Texto );
                        if (Dato != null && !Dato.isEmpty()) {
                            for (int i = 0; i < Dato.length(); i++) {
                                char c = Dato.charAt(i);
                                if (!Character.isLetter(c)) {
                                    Mensaje("Opción no válida. La cadena no debe contener caracteres especiales ni números.");
                                    return noContieneEspecialesONumeros(Texto);
                                }
                            }
                            return Dato;
                            }
                        else {
                            Mensaje( "Opcion no valida, Intentar de nuevo." );
                            return noContieneEspecialesONumeros(Texto);
                        }
                    }
                catch (Exception ex)
                {
                    Mensaje( "Error, Tipo de dato no válido" );
                    return noContieneEspecialesONumeros(Texto);
                }
    }

    public String noContieneEspeciales(String Texto) 
    {
            try 
                {   String Dato = JOptionPane.showInputDialog(null, Texto );
                    if (Dato != null && !Dato.isEmpty()) {
                        for (int i = 0; i < Dato.length(); i++) {
                            char c = Dato.charAt(i);
                            if (!Character.isLetterOrDigit(c)) {
                                Mensaje("Opción no válida. La cadena no debe contener caracteres especiales ni números.");
                                return noContieneEspecialesONumeros(Texto);
                            }
                        }
                        return Dato;
                        }
                    else {
                        Mensaje( "Opcion no valida, Intentar de nuevo." );
                        return noContieneEspecialesONumeros(Texto);
                    }
                }
            catch (Exception ex)
            {
                Mensaje( "Error, Tipo de dato no válido" );
                return noContieneEspecialesONumeros(Texto);
            }
    }   

    public String VirtoPres (String Texto)
    {
        try 
        {  String Dato = JOptionPane.showInputDialog(null, Texto ).toLowerCase();
            if ( Dato.equals("virtual") || Dato.equals("presencial") )
                return Dato;
            else {
                Mensaje( "Opcion no valida, Intentar de nuevo." );
            return VirtoPres(Texto);
            }
        }catch (Exception ex){
            Mensaje( "Error, Tipo de dato no válido" );
            return VirtoPres(Texto);
        }
    }
}