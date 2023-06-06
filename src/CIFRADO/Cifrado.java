
package CIFRADO;

/**
 *
 * @author Miguel
 */
public class Cifrado {
   public static String cesar(String texto, int n) {
      String cifrado = "";
      for (int i = 0; i < texto.length(); i++) {
         char c = texto.charAt(i);
         if (Character.isLetter(c)) {
            c = (char) (c + n % 26);
            if ((Character.isLowerCase(texto.charAt(i)) && c > 'z')
             || (Character.isUpperCase(texto.charAt(i)) && c > 'Z')) {
               c = (char) (c - 26);
            }
         }
         cifrado += c;
      }
      return cifrado;
   }
}
    

