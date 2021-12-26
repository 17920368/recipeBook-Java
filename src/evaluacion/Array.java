/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

import java.util.ArrayList;
/**
 *
 * @author Victor Rodriguez
 */
public class Array {
    ArrayList <Postre> lista;
    
    public Array(){
        lista= new ArrayList();
    }
    
    public void Agregar(Postre nombre){
        lista.add(nombre);
    }
        public int size(){
        return lista.size();
    }
    public int buscar(String nombre){
        int tam= size();
        for(int x=0; x<tam; x++){
            if(nombre.equals(lista.get(x).getNombre())){
                return x;
            }
        }
        return -1;
    }
    public int buscarI(String nombre){
        int tam= size();
        ArrayList <String> a = new ArrayList();
        ArrayList <String> b = new ArrayList();
        ArrayList <String> c = new ArrayList();
        JPostre obj = new JPostre();
        //a=obj.otroingrediente1;
        //b=obj.otroingrediente2;
        //c=obj.otroingrediente3;
        for(int x=0; x<tam; x++){
            if(nombre.equals(lista.get(x).getI1())||nombre.equals(lista.get(x).getI2())||nombre.equals(lista.get(x).getI3()) || nombre.equals(obj.getOtroingrediente1(x))
                   || nombre.equals(obj.getOtroingrediente2(x)) || nombre.equals(obj.getOtroingrediente3(x)) ){
                return x;
            }
            }
        return -1;
    }
    /*
    public void agregarmas(String nom, String ingrediente){
        ArrayList <Postre> lista;
        lista= new ArrayList();
        int tam= size();
        for(int x=0; x<tam; x++){
            if(nom.equals(lista.get(x).getNombre())){
            
            }
        }
        
    }*/

    public Postre valor(int x) {
        return lista.get(x);
    }
    
   
}
