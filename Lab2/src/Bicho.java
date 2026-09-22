import java.util.*;

public class Bicho {
    String[] bichos = {"Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "cabra", "Carneiro",
            "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco",
            "Porco", "Pavão", "Peru", "touro", "Tigre", "Urso", "Veado", "Vaca"};

    private int[] nums;
    private int nume;
    public Bicho(String num){
        String[] partes = num.split(" ");
        this.nums = new int[partes.length];
        for(int i = 0; i < partes.length; i++){
            nums[i] = Integer.parseInt(partes[i]);
        }
    }
    public String Num_bicho(nume){
      this.num = nume;
    }
    public String getbichos(){
        String[] nome_bichos = new String[nums.length];
        for(int i = 0; i<nums.length; i++){
            nome_bichos[i] = bichos[nums[i]-1];
        }
        Arrays.sort(nome_bichos);
        return Arrays.toString(nome_bichos);
    }
    public String getbicho(){
        return bichos[nume];
    }
}
