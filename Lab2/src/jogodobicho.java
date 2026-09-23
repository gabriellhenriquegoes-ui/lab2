import java.util.*;

public class jogodobicho {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bicho a1 = new Bicho();
        String aposta = sc.nextLine();
        String[] bichossorteados1 = a1.aposta();
        String[] bichossorteados2 = a1.apostadousuario(aposta);
        System.out.println(Arrays.toString(bichossorteados1));
        System.out.println(Arrays.toString(bichossorteados2));
        int contador = 0;
        for(String animal1:bichossorteados1){
            for(String animal2:bichossorteados2){
                if(animal1.equals(animal2)){
                    contador++;
                }
            }
        }
        if(contador>=1){
            System.out.println("Parabéns, Você ganhou no jogo do bicho!");
        }else{
            System.out.println("Mais sorte na proxima!");
        }
    }
}
