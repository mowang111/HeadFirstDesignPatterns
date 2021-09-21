package Duck;

public interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Quack");
    }
}

class MuteQuack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("<< Slience >>");
    }
}

class queak implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("duc.Squeak");
    }
}