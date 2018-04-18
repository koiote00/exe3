
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filipe
 */
public class Pratica33 {
    
     public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        Matriz transp = orig.getTransposta();
        System.out.println("Matriz original: " + orig);
        System.out.println("Matriz transposta: " + transp);
    }
    
}
