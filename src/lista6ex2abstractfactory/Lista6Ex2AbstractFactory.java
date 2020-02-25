/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6ex2abstractfactory;

import java.util.Scanner;
import modelo.Figura2DFactory;
import modelo.FiguraFactory;
import modelo.FiguraGeometrica;

/**
 *
 * @author alunocmc
 */
public class Lista6Ex2AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numLados = 0;
        boolean is3D = false;
        
        System.out.println("O desenho é 3D?");
        Scanner sc = new Scanner(System.in);
        is3D = sc.nextBoolean();
        System.out.println("Defina o numero de lados");
        Scanner sc2 = new Scanner(System.in);
        numLados = sc2.nextInt();
        
        FiguraFactory figuraFactory = FiguraFactory.criarFactory(is3D);
        
        
        FiguraGeometrica figura = figuraFactory.criarFigura(numLados);
        
        figura.desenhar();
    }
    
}
