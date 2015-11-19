package boletín.pkg10.ej.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Metodos {

    private int naa;
    private int ndi;
    private int naz;

    public void Metodos(int naa, int ndi, int naz) {
        this.naa = naa;
        this.ndi = ndi;
        this.naz = naz;
    }

    public void all() {

        naa = Integer.parseInt(JOptionPane.showInputDialog("Número a adivinar"));
        ndi = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos"));
        
       int contador = 0;

        

            do {
 
                contador++;
                
                naz = Integer.parseInt(JOptionPane.showInputDialog("¿Qué número crees que es?"));

                if (naz > 0 && naa > naz) {
                    JOptionPane.showMessageDialog(null, "INCORRECTO: El número es mayor");

                } 
                if (naz < 50 && naa < naz) {
                    JOptionPane.showMessageDialog(null, "INCORRECTO: El número es menor");
                } 
                if (naz > 50 || naz < 0) {
                    JOptionPane.showMessageDialog(null, "Invalid choice #ERROR");

                } 
                if (naz == naa){
                    JOptionPane.showMessageDialog(null, "GANASTE, el número es correcto");
                    break;
                    
                }
                if(contador==ndi){
                    JOptionPane.showMessageDialog(null, "GAME OVER");
                    break;
            }

            } while (naa <= 50 && naa >= 1);

        }
        
    }

