package subsystem;

public class PackagingStation {

    public void packageItem(String burgerName, boolean isCombo) {
        if (isCombo) {
            System.out.println("[PackagingStation] Boxing " + burgerName + " into eco-friendly combo box.");
            System.out.println("[PackagingStation] Adding hot fries, dipping sauce, fountain drink, and napkins.");
        } else {
            System.out.println("[PackagingStation] Wrapping " + burgerName + " in heat-retention paper with napkins.");
        }
        System.out.println("[PackagingStation] Order sealed and stamped with pickup receipt.");
    }
}