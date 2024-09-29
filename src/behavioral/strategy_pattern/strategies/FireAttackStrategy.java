package behavioral.strategy_pattern.strategies;

public class FireAttackStrategy implements IAttackStrategy {
    @Override
    public void attack() {
        System.out.println("🔥 Fire Attack!");
    }
}
