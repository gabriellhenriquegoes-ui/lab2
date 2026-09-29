package lab2;

public class Descanso {
    private int descanso;
    private int semanas;

    public void defineHorasDescanso(int descanso){
        this.descanso = descanso;
    }
    public void defineNumeroSemanas(int semanas) {
        this.semanas = semanas;
    }
    public String getStatusGeral(){
        if(this.descanso/this.semanas >= 26){
            return "descansado"
        }else{
            return "cansado"
        }
    }
}