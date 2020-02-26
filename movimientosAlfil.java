/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class movimientosAlfil {

    char matriz[][];
    int posicionX;
    int posicionY;

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public movimientosAlfil(int posicionX, int posicionY, char[][] matriz) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.matriz = matriz;
    }

    public boolean diagonalPrincipal(int posicionX, int posicionY, char[][] matriz) {
        boolean comprobar=false;
        for (int x = posicionX++, y = posicionY++ ; x < matriz.length ; x++, y++) {
            //System.out.println(x+","+y+" "+posicionX+" "+posicionY);
            if ( x == posicionX && posicionY == y)
                comprobar = true;
        }        
         return comprobar;
        
    }
    public boolean diagonalSecundaria(int posicionX, int posicionY, char[][] matriz) {
        boolean comprobar=false;
        for (int x = posicionX, y = posicionY; x < matriz.length; x++, y--) {
             if (matriz[posicionX][posicionY] == matriz[x][y])
                comprobar = true;
        }        
         return comprobar;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese una posicion X_");
        int posicionX = reader.nextInt();
        System.out.println("Y_");
        int posicionY = reader.nextInt();        
        char matriz[][];
        matriz = new char[8][8];
        System.out.println("el alfil puede moverse a las siguienes posiciones:");
        //llamado al constructor
        movimientosAlfil tablero = new movimientosAlfil(posicionX, posicionY, matriz);
        
        for (int x = 0; x < matriz.length; x++) {
            
            for (int y = 0; y < matriz[x].length; y++) {    
                
                if (tablero.diagonalPrincipal(posicionX, posicionY, matriz)){                 
                    System.out.print(x+","+ y+" "); 
                }
            }
            System.out.println(" ");
        }
    }

}
