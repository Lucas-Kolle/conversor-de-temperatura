import java.util.Scanner;

public class conversorDeTemperatura {

    double temperaturaEmCelsius;
    double temperaturaConvertidaEmFahrenheit;
    double temperaturaConvertidaEmKelvin;


    public void coletarDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a Temperatura em Celsius (Cº):");
        temperaturaEmCelsius = leitor.nextDouble();

        calculoDeconversao();
    }

    public void calculoDeconversao() {
        temperaturaConvertidaEmKelvin = temperaturaEmCelsius + 273.15;
        temperaturaConvertidaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32.0;

        System.out.println("CALCULANDO RESULTADO...");
        System.out.println("");

        exibirTemperaturasConvertidas();

    }

    public void exibirTemperaturasConvertidas(){

        String temperaturaConvertidaEmFahrenheitComDoisDecimais = String.format("%.2f", temperaturaConvertidaEmFahrenheit);
        String temperaturaConvertidaEmKelvinComDoisDecimais = String.format("%.2f", temperaturaConvertidaEmKelvin);

        System.out.println("****************************");
        System.out.println(temperaturaEmCelsius + "Cº Equivalem a:");
        System.out.println(temperaturaConvertidaEmFahrenheitComDoisDecimais + " (FAHRENHEIT)");
        System.out.println(temperaturaConvertidaEmKelvinComDoisDecimais + " (KELVIN)");
        System.out.println("****************************");
    }
}