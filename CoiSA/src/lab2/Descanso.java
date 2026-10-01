package lab2;

public class Descanso {
    private int descanso = 1;
    private int semanas = 1;

    public Descanso(){

    }

    public void defineHorasDescanso(int descanso){
        this.descanso = descanso;
    }
    public void defineNumeroSemanas(int semanas) {
        this.semanas = semanas;
    }
    public String getStatusGeral(){
        if((this.descanso/this.semanas) >= 26){
            return "descansado";
        }else{
            return "cansado";
        }
    }
}