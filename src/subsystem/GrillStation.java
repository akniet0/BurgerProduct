package subsystem;

public class GrillStation {

    public void heatGrill() {
        System.out.println("[GrillStation] Heating grill surfaces to optimal temperature...");
    }

    public void cookPatty(String pattyType) {
        if (pattyType == null) {
            throw new IllegalArgumentException("Patty type cannot be null.");
        }

        switch (pattyType.toLowerCase()) {
            case "beef" -> System.out.println("[GrillStation] Searing beef patty to medium well (4 minutes at 200°C)...");
            case "chicken" -> System.out.println("[GrillStation] Grilling chicken breast thoroughly (6 minutes at 180°C)...");
            case "veggie" -> System.out.println("[GrillStation] Grilling plant-based patty on low heat (3 minutes at 160°C)...");
            default -> System.out.println("[GrillStation] Grilling custom patty: " + pattyType);
        }
    }

    public void cleanGrill() {
        System.out.println("[GrillStation] Scraping and sanitizing grill surface.");
    }
}