public class Main {

    public static void main(String[] args) {

        SmartKitchen kithcen = new SmartKitchen();

        kithcen.getDishWasher().setHasWorkToDo(true);
        kithcen.getIceBox().setHasWorkToDo(true);
        kithcen.getBrewMaster().setHasWorkToDo(true);

        kithcen.getDishWasher().doDishes();
        kithcen.getIceBox().orderFood();
        kithcen.getBrewMaster().brewCoffee();
    }
}
