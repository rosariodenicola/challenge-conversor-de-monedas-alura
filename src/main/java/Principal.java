import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consultarMoneda = new ConsultarMoneda();

        eleccionUserMenu(consultarMoneda, lectura);
    }

    public static void eleccionUserMenu(ConsultarMoneda consultarMoneda, Scanner lectura) {

        int opcion = 0;

        while (opcion != 8) {

            System.out.println("""
                **************************************
                Sea bienvenido/a al Conversor de Moneda =]

                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileño
                4) Real brasileño => Dólar
                5) Dólar => Peso chileno
                6) Peso chileno => Dólar
                7) Convertir otra moneda
                8) Salir

                Elija una opción válida:
                **************************************
                """);

            opcion = lectura.nextInt();
            lectura.nextLine(); // limpiar salto de línea

            switch (opcion) {

                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consultarMoneda, lectura);
                    break;

                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consultarMoneda, lectura);
                    break;

                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consultarMoneda, lectura);
                    break;

                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consultarMoneda, lectura);
                    break;

                case 5:
                    ConvertirMoneda.convertir("USD", "CLP", consultarMoneda, lectura);
                    break;

                case 6:
                    ConvertirMoneda.convertir("CLP", "USD", consultarMoneda, lectura);
                    break;

                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consultarMoneda, lectura);
                    break;

                case 8:
                    System.out.println("Saliendo del conversor...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta nuevamente.");
                    break;
            }
        }
    }
}