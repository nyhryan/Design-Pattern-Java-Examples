package behavioral.strategy;

import behavioral.strategy.strategies.*;

// Context : Uses strategy, Can swap strategies freely
public class Mario {
    private IAttackStrategy attackStrategy = AttackStrategyFactory.getStrategy(AttackType.JUMP);

    public void setAttackStrategy(IAttackStrategy strategy) { attackStrategy = strategy; }

    public void attack() { attackStrategy.attack(); }
}