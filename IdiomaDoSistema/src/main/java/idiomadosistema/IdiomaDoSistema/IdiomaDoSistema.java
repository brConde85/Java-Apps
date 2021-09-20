/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema.IdiomaDoSistema;

import java.util.Locale;

/**
 *
 * @author bruno
 */
public class IdiomaDoSistema {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Locale locale = Locale.getDefault();
        String lang = locale.getDisplayLanguage();
        String country = locale.getDisplayCountry();
        System.out.println("the language of the system is:");
        System.out.println(locale.toString()+" - "+lang+" - "+country);
    }
}
