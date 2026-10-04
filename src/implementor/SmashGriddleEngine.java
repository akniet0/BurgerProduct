package implementor;

public class SmashGriddleEngine implements CookingEngine {
    @Override
    public void prepareBun(String bunType) {
        System.out.println("  [SmashGriddle] Butter-toasting " + bunType + " on flat-top cast iron plate.");
    }

    @Override
    public void searPatty(String pattyType, int cookTimeSeconds) {
        System.out.println("  [SmashGriddle] Smashed thin onto 200°C chrome flat-top for crispy crust ("
                + cookTimeSeconds + "s).");
    }

    @Override
    public void applyHeatTreatment() {
        System.out.println("  [SmashGriddle] Covered with stainless steel dome and water steam injection.");
    }
}