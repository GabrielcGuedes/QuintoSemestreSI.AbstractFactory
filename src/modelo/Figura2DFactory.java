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
public class Figura2DFactory extends FiguraFactory{
    @Override
    public FiguraGeometrica criarFigura(int numLados){
        FiguraGeometrica figuraGeometrica = null;
        
        if(numLados == 1){
            figuraGeometrica = new Circulo();
            
        } else if(numLados == 3){
            figuraGeometrica = new Triangulo();
            
        }else if(numLados == 4){
            figuraGeometrica = new Retangulo();
            
        }
        return figuraGeometrica;
    }
}
