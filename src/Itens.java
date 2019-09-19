/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ACER
 */
public class Itens extends Personagens {

    int vidaInicial = 100;
    int vidaAtual1; //dos personagens
    int vidaAtual2;
    int cinturao; // ganha vida +30
    int blade;    // da dano +20
    int colete;  // ganha vida +15
    int machete; // da dano +15
    int dano1; // 
    int dano2; //

    public Itens(int cinturao, int blade, int colete, int machete) {
        this.cinturao = 30;
        this.blade = 20;
        this.colete = 15;
        this.machete = 15;

    }

    public void recebeItens(int cinturao, int blade, int colete, int machete) {

        this.vidaAtual1 = vidaAtual1 + cinturao;
        System.out.println("Recebeu +30HP ");
        this.vidaAtual1 = vidaAtual1 + colete;
        System.out.println("Recebeu +15HP ");
        
        this.vidaAtual2 = vidaAtual2 + cinturao;
        System.out.println("Recebeu +30HP ");
        this.vidaAtual2 = vidaAtual2 + colete;
        System.out.println("Recebeu +15HP ");

        this.vidaAtual1 = vidaAtual1 - blade;
        //boolean(dano1 += blade);
          
        //boolean(vidaAtual2 - blade);
    
    
        System.out.println("Recebeu +20damage ");
        this.vidaAtual1 = vidaAtual1 - machete;
        System.out.println("Recebeu +15damage ");
    }

}
