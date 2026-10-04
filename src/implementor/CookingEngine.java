package implementor;

public interface CookingEngine {
    void prepareBun(String bunType);
    void searPatty(String pattyType, int cookTimeSeconds);
    void applyHeatTreatment();
}