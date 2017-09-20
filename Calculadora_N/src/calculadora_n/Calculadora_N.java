/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_n;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Julian peñuela
 */
public class Calculadora_N {

    /**
     * Este es el metodo principal
     *
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int option;
        do {
            option = option();
            int[] parameters = getParameters(option);
            operation(option, parameters);
        } while (option != 11);
    }

    /**
     * Este funcion escoje la operacion que el usuario escoja
     *
     * @return
     * @throws IOException
     */
    public static int option() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Seleccione alguna de las siguientes opciones: \n1. Suma\n2. Resta\n3. Multiplicacion."
                + "\n4. Division\n5. Residuo\n6. Factorial\n7. Exponente\n8. Seno\n9. Coseno\n10. Integral"
                + "\n11. Salir\n");
        bw.flush();

        int option = Integer.parseInt(br.readLine());
        return option;
    }

    /**
     * Esta funcion obtiene los parametros(numeros) deacuerdo a la opcion
     * escojida por el usuario
     *
     * @param option
     * @return
     * @throws IOException
     */
    public static int[] getParameters(int option) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int parameters[] = null;

        // switch se le manda un numero el cual escoje un case
        switch (option) {
            case 1: // Suma
            {
                parameters = new int[2];
                bw.write("Acontinuacion se va a realizar una suma: \n");
                bw.write("Escriba el primer numero: \n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

                bw.write("Escriba un segundo numero: \n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

            }
            break;// break sirve para romper, que el proceso no siga si no que pare hasta ahi
            case 2:// Resta
            {
                parameters = new int[2];
                bw.write("Acontinuacion se va a realizar una Resta: \n");
                bw.write("Escriba el primer numero: \n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

                bw.write("Escriba un segundo numero: \n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

            }
            break;
            case 3:// Multiplicación
            {
                parameters = new int[2];
                bw.write("Acontinuacion se va a realizar una Multiplicacion: \n");
                bw.write("Escriba el primer numero: \n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

                bw.write("Escriba un segundo numero: \n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

            }
            break;
            case 4:// Division
            {
                parameters = new int[2];
                bw.write("Acontinuacion se va a realizar una Division: \n");
                bw.write("Escriba el primer numero: \n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

                bw.write("Escriba un segundo numero: \n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

            }
            break;
            case 5:// Residuo
            {
                parameters = new int[2];
                bw.write("Acontinuacion se va a realizar un residuo de una division: \n");
                bw.write("Escriba el primer numero: \n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

                bw.write("Escriba un segundo numero: \n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola
            }
            break;
            case 6:// Factorial
            {
                parameters = new int[1];
                bw.write("Acontinuacion se va a realizar un factorial: \n");
                bw.write("Escriba un numero: \n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

            }
            break;
            case 7://Potenciacion
            {
                parameters = new int[2];
                bw.write("Acontinuacion se va a realizar una potencia: \n");
                bw.write("Escriba la base de la potencia: \n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                bw.write("Escriba el exponente de la potencia: \n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

            }
            break;
            case 8://Seno
            {
                parameters = new int[1];
                bw.write("Acontinuacion se va a realizar la operacion seno: \n");
                bw.write("Escriba un numero a calcular: \n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

            }
            break;
            case 9://Coseno
            {
                parameters = new int[1];
                bw.write("Acontinuacion se va a realizar la operacion coseno: \n");
                bw.write("Escriba un numero a calcular: \n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

            }
            break;
            case 10:// Integration 
            {
                parameters = new int[3];
                bw.write("A continuacion se va a realizar la suma de riemann\n");
                bw.write("Ingrese el punto inicial:\n");
                bw.flush();
                parameters[0] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

                bw.write("Ingrese el punto final:\n");
                bw.flush();
                parameters[1] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

                bw.write("Ingrese el incremento:\n");
                bw.flush();
                parameters[2] = Integer.parseInt(br.readLine());
                // se asigna un valor al parametro del arreglo desde la consola

            }
            break;

            default: //caso por defecto para terminar la calculadora 
            {

                System.exit(0);
            }
        }
        return parameters;
    }

    /**
     * Esta funcion envia los parametros a un objeto y realiza la operation
     *
     * @param option
     * @param parameters
     * @return
     * @throws IOException
     */
    public static void operation(int option, int[] parameters) throws IOException {

        Operations op = new Operations();// Aqui llamamos a la clase
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        switch (option) {
            case 1://suma
            {
                int resultado = op.addition(parameters[0], parameters[1]);
                bw.write("El resultado es: " + resultado + "\n");
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            case 2://resta
            {
                int resultado = op.subtraction(parameters[0], parameters[1]);
                bw.write("El resultado es: " + resultado + "\n");
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            case 3:// multiplicacion
            {
                int resultado = op.multiplication(parameters[0], parameters[1]);
                bw.write("El resultado es: " + resultado + "\n");
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            case 4://division
            {
                double resultado = op.division(parameters[0], parameters[1]);
                DecimalFormat df = new DecimalFormat("#0.0000");
                if (resultado == Double.NaN) {
                    bw.write("la division por 0 no es posible \n");
                    bw.flush();
                    // descarga todo el contenido en consola
                } else {
                    bw.write("El resultado es: " + df.format(resultado) + "\n");
                }
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            case 5://residuo
            {
                double resultado = op.residue(parameters[0], parameters[1]);
                bw.write("El resultado es: " + resultado + "\n");
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            case 6://factorial
            {
                int resultado = op.factorial(parameters[0]);
                bw.write("El resultado es: " + resultado + "\n");
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            case 7:// potenciacion
            {
                double resultado = op.potentiation(parameters[0], parameters[1]);
                bw.write("El resultado de la potencia es: " + resultado + "\n");
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            case 8://seno
            {
                double resultado = op.sine(parameters[0]);
                bw.write("El resultado del seno " + parameters[0] + " es: " + resultado + "\n");
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            case 9://coseno 
            {
                double resultado = op.cosine(parameters[0]);
                bw.write("El resultado del coseno " + parameters[0] + " es: " + resultado + "\n");
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            case 10:// integral suma de rieman
            {
                double resultado = op.integral(parameters[0], parameters[1], parameters[2]);
                bw.write("El resultado de la suma de rieman es: " + resultado + "\n");
                bw.flush();
                // descarga todo el contenido en consola
            }
            break;
            default: {
                System.exit(0);
            }
        }

    }

}
/