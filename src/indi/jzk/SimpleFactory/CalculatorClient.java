package indi.jzk.SimpleFactory;

/**
 * Created by zhukai.jiang on 4/18/2017.
 * Description： 简单工厂类或静态工厂类的客户端
 */
public class CalculatorClient {
    public static void main (String args []){
        Operation oper = SimpleFactory.getResult('+');
        oper.setParameterA(10);
        oper.setParameterB(2);
        System.out.println(oper.getResult());
    }
}
