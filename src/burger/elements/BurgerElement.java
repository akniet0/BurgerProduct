package burger.elements;

import burger.visitors.BurgerVisitor;

public interface BurgerElement {
    void accept(BurgerVisitor visitor);
}