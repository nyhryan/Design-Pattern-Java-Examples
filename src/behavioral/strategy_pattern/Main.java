package behavioral.strategy_pattern;

import behavioral.strategy_pattern.strategies.*;

public class Main {
    public static void main(String[] args) {
        var mario = new Mario(); // Default Mario does jump attacks
        mario.attack(); // 🦶 Jump attack!

        System.out.println(">> Fire flower power up!");

        // Get various attack strategies from the factory
        mario.setAttackStrategy(AttackStrategyFactory.getStrategy(AttackType.FIRE));
        mario.attack(); // 🔥 Fire Attack!

        System.out.println(">> Ice flower power up!");
        mario.setAttackStrategy(AttackStrategyFactory.getStrategy(AttackType.ICE));
        mario.attack(); // ❄️ Ice Attack!
    }
}
