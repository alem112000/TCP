package tcp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis Diego Jimenez Delgado  Alejandro Emanuel Rangel Mendez
 * grupo: 5IM6
 * fecha :25/08/17
 */
public class DesarrolloBinomio {
    // Recibe valores tipo INT, que son los coeficientes numéricos del binomio,
    // y devuelve un string con el binomio desarrollado
    public String desarrolla(int numa, int numb){
        String tcp="";
        int a,b,c;
        if(numa == 0)
        {
            c = numb*numb;
            tcp = Double.toString(c);
        }
        else if(numb == 0)
        {
            a = numa*numa;
            tcp = Double.toString(a)+"x^2";
        }
        else if(numa  > 0 && numb> 0)
        {
            a = numa*numa;
            tcp = Double.toString(a)+"x^2+";
            b = numa*numb*2;
            tcp= tcp+Double.toString(b)+"x+";
            c = numb*numb;
            tcp = tcp+Double.toString(c);
        }
         else if(numa  < 0 && numb < 0)
        {
            a = numa*numa;
            tcp = Double.toString(a)+"x^2+";
            b = numa*numb*2;
            tcp= tcp+Double.toString(b)+"x+";
            c = numb*numb;
            tcp = tcp+Double.toString(c);
        }
        else 
        {
            a = numa*numa;
            tcp = Double.toString(a)+"x^2";
            b = numa*numb*2;
            tcp= tcp+Double.toString(b)+"x+";
            c = numb*numb;
            tcp = tcp+Double.toString(c);
        }
        
        return tcp;
    }
}
