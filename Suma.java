import java.text.DecimalFormat;

class Suma extends Operaciones{

    private double resultado;
    DecimalFormat df1 = new DecimalFormat("#0.00");

    public Suma(double n1, double n2){
        super(n1, n2);
    }

    public double getResultado() {
        return resultado;
    }
    
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double sumar(){

        resultado = getN1() + getN2();

        return resultado;
    }
    
    public void MostrarRes(){
        System.out.println("El resultado es: " + getResultado());
    }
}