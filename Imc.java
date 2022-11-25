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


    public String result(){

        String resultado = " ";

        if(this.calculaImc() < 18.5){
            resultado ="Status: MAGREZA!";

        }else if(this.calculaImc() >= 18.5 || this.calculaImc() <= 24.9 ){
            resultado = "Status: NORMAL!";

        } else if (this.calculaImc() >= 25.0 || this.calculaImc() <= 29.9) {
            resultado = "Status: SOBREPRESO!";

        } else if (this.calculaImc() >= 30.0 || this.calculaImc() <= 39.9) {
            resultado = "Status: OBESIDADE!";

        }else if(this.calculaImc() >= 40.0){
            resultado = "Status: OBESIDADE GRAVE!";

        }

        return resultado;
    }

    private float arredonda(float entrada) {
        float aux = Math.round(100 * entrada);

        return aux / 100;
    }
}