package Duck;

public class MiniDuckSimulator {
    public static void main(String[] args){
//        Duck mallard=new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();
        Duck model=new ModelDuck();
        model.performFly();
        //这里new FlyRocketPowered()为什么时接口类型的
        //public void setFlyBehavior(FlyBehavior fb)
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}