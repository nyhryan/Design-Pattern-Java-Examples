package structural.decorator;

import structural.decorator.decorators.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n> Normal Text:");
        Component textComponent = new TextComponent("Hello, World!");
        textComponent.draw();

        System.out.println("\n> Dashed Text:");
        Component dashedTextComponent = new DashedDecorator(textComponent);
        dashedTextComponent.draw();

        System.out.println("\n> Asterisk Text:");
        Component asteriskTextComponent = new AsteriskDecorator(textComponent);
        asteriskTextComponent.draw();

        System.out.println("\n> Dashed and Asterisk Text:");
        Component dashedAsteriskTextComponent = new DashedDecorator(new AsteriskDecorator(textComponent));
        dashedAsteriskTextComponent.draw();

        System.out.println("\n> Asterisk and Dashed Text:");
        Component asteriskDashedTextComponent = new AsteriskDecorator(new DashedDecorator(textComponent));
        asteriskDashedTextComponent.draw();
    }
}
