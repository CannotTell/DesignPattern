package indi.jzk.SimpleFactory;

/**
 * Created by zhukai.jiang on 4/18/2017.
 * Description：减法实现类
 */
public class SubOperation extends Operation {
    @Override
    public double getResult() {
        return getParameterA() - getParameterB();
        //return super.getResult();
    }
}
