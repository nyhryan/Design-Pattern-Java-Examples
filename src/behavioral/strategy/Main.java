package behavioral.strategy;

import behavioral.strategy.strategies.*;

public class Main {
    public static void main(String[] args) {
        var mario = new Mario(); // Default Mario does jump attacks
        mario.attack(); // 🦶 Jump attack!

        System.out.println(">> Fire flower power up!");

        // Get various attack strategies from the factory
        mario.setAttackStrategy(AttackStrategyFactory.getStrategy(AttackType.FIRE));
        mario.attack(); // 🔥 Fire Attack!

        // Using enum instead of factory
        System.out.println(">> Ice flower power up!");
        mario.setAttackStrategy(AttackStrategyType.ICE.getStrategy());
        mario.attack(); // ❄️ Ice Attack!
    }
}
