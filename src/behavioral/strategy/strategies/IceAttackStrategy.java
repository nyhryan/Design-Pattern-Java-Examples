package behavioral.strategy.strategies;

public class IceAttackStrategy implements IAttackStrategy {
    @Override
    public void attack() {
        System.out.println("❄️ Ice Attack!");
    }
}
