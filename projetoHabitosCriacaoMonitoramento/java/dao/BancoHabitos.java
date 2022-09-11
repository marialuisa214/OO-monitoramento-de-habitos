package dao;

import java.util.ArrayList;
import java.util.List;
import model.HabitoDatado;

public class BancoHabitos { 
     public List<HabitoDatado> listaDatado;
     
     public BancoHabitos(){
         this.listaDatado = new ArrayList<HabitoDatado>();
         
     }
     
     public List<HabitoDatado> getHabitoDatado() {
        return listaDatado;
    }
     
     public void novoHabitoDatado(HabitoDatado hd){
         
     listaDatado.add(hd);
         
     }
}
