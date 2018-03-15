package calclogic;

import main.Calculator;

public class CalcLogic {

    public double add(double first, double second) {

        return first+second;
    }

    public double sub(double first, double second) {

        return first-second;
    }

    public double div(double first, double second) {

        if(second==0)
            throw new ArithmeticException();

        return first/second;
    }

    public double multi(double first, double second) {

        return first*second;
    }

    public double mod(double first, double second) {

        return first%second;
    }

}
