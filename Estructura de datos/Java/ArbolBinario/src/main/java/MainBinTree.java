/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class MainBinTree {

    public static void main(String[] args) {
        BinTree bt = new BinTree();
        bt.insert(198);
        bt.insert(177);
        bt.insert(204);
        
        System.out.println("Pre-order: ");
        System.out.println(bt.preOrder(bt.root));
        System.out.println("In-order: ");
        System.out.println(bt.inOrder(bt.root));
        System.out.println("Pos-order: ");
        System.out.println(bt.posOrder(bt.root));
    }
}
