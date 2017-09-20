package calculadora_n;

/**
 * Esta es la clase operations
 *
 * @author santo
 */
public class Operations {

    public void operations() {
    }// Esta es una clase constructor

    //esta funcion returna el resultado de la operacion suma
    public int addition(int number_1, int number_2) {
        return number_1 + number_2;
    }

    //esta funcion returna el resultado de la operacion resta
    public int subtraction(int number_1, int number_2) {
        if (number_1 > number_2) {
            return number_1 - number_2;
        } else {
            return -(number_2 - number_1);
        }
    }

    //esta funcion returna el resultado de la operacion multiplicacion
    public int multiplication(int number_1, int number_2) {
        return number_1 * number_2;
    }

    //esta funcion returna el resultado de la operacion division
    public double division(int number_1, int number_2) {
        if (number_2 != 0) {
            return (int) number_1 / number_2;
        } else {
            return Double.NaN;
        }
    }

    //esta funcion returna el resultado de la operacion residuo
    public double residue(int number_1, int number_2) {
        if (number_2 != 0) {
            return number_1 % number_2;
        }
        return Double.NaN;
    }

    //esta funcion returna el resultado de la operacion factorial
    public int factorial(int number_1) {
        int solucion = 1;
        if (number_1 == 0) {
            return 1;
        } else {
            for (int i = 1; i <= number_1; i++) {
                solucion = solucion * i;
            }
        }
        return solucion;
    }

    //esta funcion returna el resultado de la operacion potenciacion
    public double potentiation(int number_1, int number_2) {
        if (number_2 == 0) {
            return 1;
        } else if (number_2 == 1) {
            return number_1;
        } else if (number_2 > 1) {
            return (int) Math.pow(number_1, number_2);
        } else {
            return 1 / (double) Math.pow(number_1, (number_2 * -1));
        }

    }

    //esta funcion returna el resultado de la operacion seno
    public double sine(int number_1) {
        return Math.sin(number_1 * Math.PI / 180);
    }

    //esta funcion returna el resultado de la operacion coseno
    public double cosine(int number_1) {
        if (number_1 == 90) {
            return 0;
        } else {
            return Math.cos(number_1 * Math.PI / 180);
        }
    }

    //esta funcion returna el resultado de la operacion suma de rieman
    public double integral(int number_1, int number_2, int number_3) {
        double response = 0.0;
        double temp;
        int x_i, x_i_1, y_i;
        x_i_1 = number_1;
        x_i = number_3 + x_i_1;

        for (int i = x_i; i <= number_2; i += number_3) {
            y_i = (x_i_1 * x_i_1);
            temp = (y_i) + (x_i - x_i_1);
            response += temp;
            // Suma el area de los triangulos
            x_i_1 = x_i;
            x_i = number_3 + x_i_1;
        }

        return response;
    }
}

