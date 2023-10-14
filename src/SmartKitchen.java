public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}

class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {

        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {

        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {

        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}