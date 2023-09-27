package calculator;

public class Calculator {
    public int add(int opG, int opD)
    {
        if(opG > 100 || opG < -100 || opD > 100 || opD < -100)
        {
            throw new IllegalArgumentException("Valeur entrée trop grande");
        }
        return opG + opD;
    }

    public int divide(int opG, int opD)
    {
        if(opD == 0)
        {
            throw new IllegalArgumentException("Division par zéro impossible");
        }

        return opG / opD;
    }
}
