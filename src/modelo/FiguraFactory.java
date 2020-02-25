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
public abstract class FiguraFactory {
    
    public abstract FiguraGeometrica criarFigura(int numLados);
    
    public static FiguraFactory criarFactory(boolean usar3D){
        FiguraFactory figuraFactory = null;
        if(usar3D == true){
         figuraFactory = new Figura3DFactory();
         
        }else if(usar3D == false){
          figuraFactory = new Figura2DFactory();
          
        }
        return figuraFactory;
    }
}
