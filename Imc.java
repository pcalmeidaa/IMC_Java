import java.lang.Math;

public class Imc {
    //
    // Atributos
    //

    private float altura;
    private float peso;

    //
    // Construtores (Objetos)
    //

    public Imc(float p, float a) {
        this.peso = p;
        this.altura = a;
    }

    //
    // Métodos
    //

    public void setAltura(float a) {
        this.altura = a;
    }

    public void setPeso(float p) {
        this.peso = p;
    }

    public float calculaImc() {
        return this.arredonda(this.peso / (this.altura * this.altura));
    }

    public static String result(float imc) {

        if (imc < 18.5) {
            return "Status: MAGREZA!";

        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Status: NORMAL!";

        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Status: SOBREPRESO!";

        } else if (imc >= 30.0 && imc <= 39.9) {
            return "Status: OBESIDADE!";

        } else if (imc >= 40.0) {
            return "Status: OBESIDADE GRAVE!";

        } else {
            return "Status: OBESIDADE MORBIDA!";
        }

    }

    private float arredonda(float entrada) {
        float aux = Math.round(100 * entrada);

        return aux / 100;
    }
}