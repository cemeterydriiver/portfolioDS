package convertetemperatura;

import java.util.Scanner;

public class ConverteTemperatura {

    public static void main(String[] args) {
       

    static double celsiusParaFahrenheit(double c) {
        return 9.0 * c / 5.0 + 32.0;
    }

    static double fahrenheitParaCelsius(double f) {
        return 5.0 * (f - 32.0) / 9.0;
    }

    public static void main(String[] args) {
        double far, cel;

        System.out.print("Temperatura em graus Fahrenheit: ");
        far = SavitchIn.readDouble();
        cel = fahrenheitParaCelsius(far);
        System.out.println("igual a " + cel + " graus Celsius");

        System.out.print("Temperatura em graus Celsius: ");
        cel = SavitchIn.readDouble();
        far = celsiusParaFahrenheit(cel);
        System.out.println("igual a " + far + " graus Fahrenheit");
    }
}
}
}
