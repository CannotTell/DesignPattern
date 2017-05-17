package indi.jzk.Polymorphism;

/**
 * Created by zhukai.jiang on 5/17/2017.
 * Description：
 */
public class Main {

    public static void main(String [] args){
        People p = new Chinese();
        System.out.println(p.name);
        System.out.println(p.Value);
        p.run();
        p.look();
    }
}
