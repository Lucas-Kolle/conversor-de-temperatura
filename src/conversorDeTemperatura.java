import java.util.Scanner;

public class conversorDeTemperatura {

    // adicionando variaveis para coletar os dados
    double temperaturaEmCelsius;
    double temperaturaConvertidaEmFahrenheit;
    double temperaturaConvertidaEmKelvin;


    public void coletarDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a Temperatura em Celsius (Cº):");
        temperaturaEmCelsius = leitor.nextDouble();

        calcularConversao();
    }

    public void calcularConversao() {
        temperaturaConvertidaEmKelvin = temperaturaEmCelsius + 273.15;
        temperaturaConvertidaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32.0;

        // println = vai pra linha de baixo / print = fica na mesma linha
        System.out.println("CALCULANDO RESULTADO...");

        exibirTemperaturas();

    }

    public void exibirTemperaturas(){

        //exibir o resultado com 2 casas após a virgula
        String temperaturaConvertidaEmFahrenheitComDoisDecimais = String.format("%.2f", temperaturaConvertidaEmFahrenheit);
        String temperaturaConvertidaEmKelvinComDoisDecimais = String.format("%.2f", temperaturaConvertidaEmKelvin);

        System.out.println("****************************");
        System.out.println(temperaturaEmCelsius + "Cº Equivalem a:");
        System.out.println(temperaturaConvertidaEmFahrenheitComDoisDecimais + "°F (FAHRENHEIT)");
        System.out.println(temperaturaConvertidaEmKelvinComDoisDecimais + "K (KELVIN)");
        System.out.println("****************************");
    }
}