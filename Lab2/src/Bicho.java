import java.util.*;

public class Bicho {
    String[] bichos = {"Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "cabra", "Carneiro",
            "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco",
            "Porco", "Pavão", "Peru", "touro", "Tigre", "Urso", "Veado", "Vaca"};

    public String pegarbicho(int numero){
        if(numero >= 1 && numero <= 25){
            return bichos[numero-1];
        }else{return "Número invalido";}
    }

    public String[] aposta(){
        Random rd = new Random();
        Set<Integer> numerosorteados = new LinkedHashSet<>();

        while(numerosorteados.size() < 5){
            int numerosorteado = rd.nextInt(25)+1;
                numerosorteados.add(numerosorteado);
        }
        String[] bichossorteados = new String[5];
        int i = 0;
        for(int numero:numerosorteados){
            bichossorteados[i] = bichos[numero-1];
            i++;
        }
        Arrays.sort(bichossorteados);
        return bichossorteados;
    }

    public String[] apostadousuario(String numeros){
        String[] numerosapostados = numeros.split(" ");
        String[] animaissorteados = new String[5];
        int i = 0;
        for(String nume:numerosapostados){
            animaissorteados[i] = bichos[Integer.parseInt(nume)-1];
            i++;
        }
        Arrays.sort(animaissorteados);
        return animaissorteados;
    }
}
