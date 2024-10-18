package behavioral.strategy.strategies;

// You can also use an enum instead of Factory
public enum AttackStrategyType {
    JUMP(new JumpAttackStrategy()),
    FIRE(new FireAttackStrategy()),
    ICE(new IceAttackStrategy());
    
    private final IAttackStrategy strategy;
    AttackStrategyType(IAttackStrategy strategy) {
        this.strategy = strategy;
    }
    
    public IAttackStrategy getStrategy() {
        return strategy;
    }
}