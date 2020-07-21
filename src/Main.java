import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error=true;

        while (error){
            System.out.println("Escibe una contraseña que solo puede incluir letras mayusculas o minusculas");
            String pass = sc.nextLine();
            ComparacionAsci comparacion = new ComparacionAsci(pass);

            if(comparacion.check()){
                System.out.println("La contraseña es válida");
                error=false;
            }else{
                System.out.println("La contraseña no es válida. Solo se permite letras");
                error=true;
            }
        }

    }
}
