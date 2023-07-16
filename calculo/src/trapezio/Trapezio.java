package trapezio;

import entities.Erros;

public class Trapezio {
	
    private int baseMaior;
    private int baseMenor;
    private int altura;

    public Trapezio(int baseMaior, int baseMenor, int altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;

        if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0) {
            throw new Error("Valor inválido. As bases e a altura devem ser maiores que zero");
        }
    }

    public int getBaseMaior() {
        return baseMaior;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public int getAltura() {
        return altura;
    }
}




