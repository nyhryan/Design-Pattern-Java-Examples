package behavioral.strategy_pattern.strategies;

import java.util.HashMap;
import java.util.Map;

// Keep all the strategies in this factory
public class AttackStrategyFactory {
    private static final Map<AttackType, IAttackStrategy> strategies = new HashMap<>();
    static {
        strategies.put(AttackType.JUMP, new JumpAttackStrategy());
        strategies.put(AttackType.FIRE, new FireAttackStrategy());
        strategies.put(AttackType.ICE, new IceAttackStrategy());
    }

    // Get the strategy based on the AttackType enum
    public static IAttackStrategy getStrategy(AttackType type) {
        return strategies.get(type);
    }
}

