/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alunocmc
 */
public class Figura3DFactory extends FiguraFactory{
    @Override
    public FiguraGeometrica criarFigura(int numLados){
       FiguraGeometrica figuraGeometrica = null;
        
        if(numLados == 1){
            figuraGeometrica = new Esfera();
            
        } else if(numLados == 5){
            figuraGeometrica = new Piramide();
            
        }else if(numLados == 6){
            figuraGeometrica = new Paralelepipedo();
            
        }
        return figuraGeometrica; 
    }
}
