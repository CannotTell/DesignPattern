package indi.jzk.SimpleFactory;

/**
 * Created by zhukai.jiang on 4/18/2017.
 * Description：简单工厂类或静态工厂类
 */
public class SimpleFactory {
    public static Operation getResult(char Operation){
        Operation oper = null;
        switch (Operation){
            case '*':
                oper = new MultOperation();
                break;
            case '-':
                oper = new SubOperation();
                break;
            default:
                System.out.println("Non-existent Operator");
        }
        return oper;
    }
}
