/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

/**
 *
 * @author johan_p9pyxb1
 */
public class NumeroMenorException extends RuntimeException{
    
    //tipo CHECKED--> que controlarla  extiende de EXCEPTIO(IOEXCEPTION)
    //tipo UNCHECK--> compila y no debo controlarla   extiendo de RuntimeException
    public String toString(){
   return "NumeroMenorException";
  }

}
