package structural.decorator.decorators;

import structural.decorator.Component;

// Concerete Decorator class - adds dashes to the text
// can decorate other concrete decorators or concrete components
public class DashedDecorator extends Decorator {
    public DashedDecorator(Component component) {
        super(component);
    }

    @Override
    public void draw() {
        System.out.println("-".repeat(super.getLength()));
        super.draw();
        System.out.println("-".repeat(super.getLength()));
    }
}
