package implementor;

public class FlameGrillEngine implements CookingEngine {
    @Override
    public void prepareBun(String bunType) {
        System.out.println("  [FlameGrill] Toasting " + bunType + " over open char-broil flames.");
    }

    @Override
    public void searPatty(String pattyType, int cookTimeSeconds) {
        System.out.println("  [FlameGrill] Flame-grilling " + pattyType
                + " patty with smoky grill marks for " + cookTimeSeconds + "s.");
    }

    @Override
    public void applyHeatTreatment() {
        System.out.println("  [FlameGrill] Melting toppings under radiant gas flame broiler.");
    }
}