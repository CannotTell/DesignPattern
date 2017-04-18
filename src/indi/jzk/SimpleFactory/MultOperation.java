package indi.jzk.SimpleFactory;

/**
 * Created by zhukai.jiang on 4/18/2017.
 * Description：
 */
public class MultOperation extends Operation {
    @Override
    public double getResult() {
        return getParameterA() * getParameterB();
    }
}
