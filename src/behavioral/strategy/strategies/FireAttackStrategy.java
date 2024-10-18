package behavioral.strategy.strategies;

public class FireAttackStrategy implements IAttackStrategy {
    @Override
    public void attack() {
        System.out.println("🔥 Fire Attack!");
    }
}
