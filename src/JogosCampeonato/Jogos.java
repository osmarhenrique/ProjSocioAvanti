
package JogosCampeonato;

import java.util.ArrayList;

    public class Jogos {
    ArrayList <Jogos> campeonato = new ArrayList();   
    
    private String timeCasa;
    private String timeVisitante;
    private String estadio;
    //private Date data;

    public Jogos(String timeCasa, String timeVisitante, String estadio ) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.estadio = estadio;
        //this.data = data;
    }

    public Jogos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

//sobrescrita do método
    @Override
    public String toString() {
        return timeCasa+" x "+timeVisitante+" em: "+ estadio; 
    }
    
    public void listaJogos(){
         for (Object j : campeonato)
            System.out.println(j);
        }
    }    
      
