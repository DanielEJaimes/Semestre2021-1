/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class MainAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AVLTree arbolAVL = new AVLTree();
        arbolAVL.insert(130);
        arbolAVL.insert(100);
        arbolAVL.insert(46);
        arbolAVL.insert(140);
        arbolAVL.insert(164);
        arbolAVL.insert(136);
        arbolAVL.insert(78);
        arbolAVL.posOrder(arbolAVL.raiz);
    }
}
