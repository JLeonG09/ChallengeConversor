import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        Operaciones operacion;
        while(opcion!=7){


            System.out.println("------------Menu del Conversor----------\n");
            System.out.println("Seleccione una de las siguientes conversiones: \n");
            System.out.println("1. De USD a Colon Costarricense.\n2. De Colon Costarricence a USD. \n3. De USD a Peso Mexicano. \n4. De Peso Mexicano a USD. \n5. De USD a Bolivar Venezolano. \n6. De Bolivar Venezolano a USD. \n7. Salir.");

            opcion = scanner.nextInt();
            String base;
            String destino;
            double monto;
            double resultado;

            switch (opcion){
                case 1:
                    System.out.println("Digite el monto en Dolares que desea convertir: ");
                    base = "USD";
                    destino = "CRC";
                    monto = scanner.nextDouble();
                    operacion = new Operaciones();
                    resultado = operacion.convertir(base, destino, monto);

                    System.out.println("Resultado: " + resultado + " " + destino);
                    break;
                    case 2:
                        System.out.println("Digite el monto en Colones que desea convertir: ");
                        base = "CRC";
                        destino = "USD";
                        monto = scanner.nextDouble();

                        if(monto < 0 ){
                            System.out.println("No se permiten valores negativos");
                            continue;
                        }
                        operacion = new Operaciones();
                        resultado = operacion.convertir(base,destino,monto);

                        System.out.println("Resultado: " + resultado + " " + destino);
                        break;
                        case 3:
                            System.out.println("Digite el monto en Dolares que desea convertir: ");
                            base = "USD";
                            destino = "MXN";
                            monto = scanner.nextDouble();
                            operacion = new Operaciones();
                            resultado = operacion.convertir(base,destino,monto);

                            System.out.println("Resultado: " + resultado + " " + destino);
                            break;
                            case 4:
                                System.out.println("Digite el monto en Pesos Mexicanos que desea convertir: ");
                                base = "MXN";
                                destino = "USD";
                                monto = scanner.nextDouble();
                                operacion = new Operaciones();
                                resultado = operacion.convertir(base,destino,monto);

                                System.out.println("Resultado: " + resultado + " " + destino);
                                break;
                                case 5:
                                    System.out.println("Digite el monto en Dolares que desea convertir: ");
                                    base = "USD";
                                    destino = "VES";
                                    monto = scanner.nextDouble();
                                    operacion = new Operaciones();
                                    resultado = operacion.convertir(base,destino,monto);

                                    System.out.println("Resultado: " + resultado + " " + destino);
                                    break;
                                    case 6:
                                        System.out.println("Digite el monto en Bolivares que desea convertir: ");
                                        base = "VES";
                                        destino = "USD";
                                        monto = scanner.nextDouble();
                                        operacion = new Operaciones();
                                        resultado = operacion.convertir(base,destino,monto);

                                        System.out.println("Resultado: " + resultado + " " + destino);
                                        break;
                                        case 7:
                                            System.out.println("Gracias por usar el conversor, nos vemos pronto.");
                                            continue;
                                            default:
                                                System.out.println("Opcion invalida! Intente nuevamente.\n");
            }
        } scanner.close();
    }
}