package indi.jzk.SimpleFactory;

/**
 * Created by zhukai.jiang on 4/18/2017.
 * Description：抽象运算方法
 */
public abstract class Operation {
    public double getParameterA() {
        return parameterA;
    }

    public double getParameterB() {
        return parameterB;
    }

    public void setParameterA(double parameterA) {
        this.parameterA = parameterA;
    }

    public void setParameterB(double parameterB) {
        this.parameterB = parameterB;
    }

    private double parameterA;
    private double parameterB;

    public double getResult(){
        double result = 0;
        return result;
    }
}
