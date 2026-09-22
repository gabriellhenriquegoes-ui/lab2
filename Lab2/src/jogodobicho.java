import java.util.*;

public class jogodobicho {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Num_Bicho a1 = new Bicho(num);
        System.out.println(a1.getbicho());

    }
}
