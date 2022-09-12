package dao;

import java.util.ArrayList;
import java.util.List;

import classesBase.HabitoSemanal;

public class BancoHabitos { 
     public List<HabitoSemanal> listaSemanal;
     
     public BancoHabitos(){
         this.listaSemanal = new ArrayList<HabitoSemanal>();
         
     }
     
     public List<HabitoSemanal> getHabitosemanal() {
        return listaSemanal;
    }
     
     public void novoHabitoDatado(HabitoSemanal hd){
         
     listaSemanal.add(hd);
         
     }
}
