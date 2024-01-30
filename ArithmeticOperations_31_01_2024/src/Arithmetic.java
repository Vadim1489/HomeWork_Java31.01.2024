public class Arithmetic {
    double number1;
    double number2;
    public Arithmetic(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public double addition() {
        return this.number1 + this.number2;
    }
    public double substraction() {
        return this.number1 - this.number2;
    }
    public double division() {
        return this.number1 / this.number2;
    }
    public double miltiply() {
        return this.number1 * this.number2;
    }
}
