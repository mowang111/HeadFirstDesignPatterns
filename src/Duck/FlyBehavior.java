package Duck;

public interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I'm flying!");
    }
}

class FlyNoWay implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I can't fly");
    }
}