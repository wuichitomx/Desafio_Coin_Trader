import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        System.out.println("Que moneda intentas tradear");
        String tipoDeMoneda = String.valueOf(lectura.nextLine());
        Moneda moneda = consulta.buscaMoneda(tipoDeMoneda);
        System.out.println(moneda);
    }
}
