package behavioral.strategy.strategies;

public class JumpAttackStrategy implements IAttackStrategy {
    @Override
    public void attack() {
        System.out.println("🦶 Jump attack!");
    }
}
