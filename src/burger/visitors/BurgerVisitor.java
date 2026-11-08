package burger.visitors;

import burger.elements.Bun;
import burger.elements.Patty;
import burger.elements.Topping;

public interface BurgerVisitor {
    void visitBun(Bun bun);
    void visitPatty(Patty patty);
    void visitTopping(Topping topping);
}