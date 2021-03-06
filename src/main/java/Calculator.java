public class Calculator {

    private int result;

    public Calculator() {
       this.result = result;
    }

    public int reset() {
        result = 0;
        return 0;
    }

    public int getResult() {
        return this.result;
    }

    public int add(int value) {
       return this.result += value;
    }

    public int subtract(int value) {
        return this.result -= value;
    }

    public int multiply(int value) {
        return this.result *= value;
    }

    public int divide(int value) {
        return this.result /= value;
    }

}
