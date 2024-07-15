public class Complexo {
    double real;
    double imaginario;

    Complexo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    double copiaReal(){
        return real;
    }

    double copiaImaginario(){
        return imaginario;
    }

    void novoReal(double real){
        this.real = real;
    }

    void novoImaginario(double imaginario){
        this.imaginario = imaginario;
    }

    Complexo adiciona(Complexo c){
        double novoReal = this.real + c.copiaReal();
        double novoImaginario = this.imaginario + c.copiaImaginario();
        return new Complexo(novoReal, novoImaginario);
    }

    Complexo subtrai(Complexo c){
        double novoReal = this.real - c.copiaReal();
        double novoImaginario = this.imaginario - c.copiaImaginario();
        return new Complexo(novoReal, novoImaginario);
    }

    Complexo multiplica(Complexo c){
        double novoReal = this.real * c.copiaReal() - this.imaginario * c.copiaImaginario();
        double novoImaginario = this.real * c.copiaImaginario() + this.imaginario * c.copiaReal();
        return new Complexo(novoReal, novoImaginario);
    }

    Complexo divide(Complexo c){
        double divisor = c.copiaReal()*c.copiaReal() + c.copiaImaginario()*c.copiaImaginario();
        double novoReal = (this.real * c.copiaReal() + this.imaginario * c.copiaImaginario()) / divisor;
        double novoImaginario = (this.imaginario * c.copiaReal() - this.real * c.copiaImaginario()) / divisor;
        return new Complexo(novoReal, novoImaginario);
    }

    String converteParaString(){
        return String.format("%.2f + %.2fi", this.real, this.imaginario);
    }
}