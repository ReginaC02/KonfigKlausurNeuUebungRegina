package org.campus02;

public class CoffeeMachine {

    private int maxWaterLevel;
    private int maxCoffeeBeansLevel;
    private int currentWaterLevel;
    private int currentCoffeeBeansLevel;

    public CoffeeMachine(int maxWaterLevel, int maxCoffeeBeansLevel) {
        this.maxWaterLevel = getMaxWaterLevel();
        this.maxCoffeeBeansLevel = getMaxCoffeeBeansLevel();
        this.currentWaterLevel = 0;
        this.currentCoffeeBeansLevel = 0;
    }

    public int getMaxWaterLevel() {

        return maxWaterLevel;
    }

    public int getMaxCoffeeBeansLevel() {

        return maxCoffeeBeansLevel;
    }

    public int getCurrentWaterLevel() {

        return currentWaterLevel;
    }

    public int getCurrentCoffeeBeansLevel() {

        return currentCoffeeBeansLevel;
    }

    public void setMaxWaterLevel(int maxWaterLevel) {
        this.maxWaterLevel = maxWaterLevel;
    }

    public void setMaxCoffeeBeansLevel(int maxCoffeeBeansLevel) {
        this.maxCoffeeBeansLevel = maxCoffeeBeansLevel;
    }

    public void setCurrentWaterLevel(int currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }

    public void setCurrentCoffeeBeansLevel(int currentCoffeeBeansLevel) {
        this.currentCoffeeBeansLevel = currentCoffeeBeansLevel;
    }

    public void clean() {
        currentWaterLevel = 0;
        currentCoffeeBeansLevel = 0;
    }


    public void fill() {
        currentWaterLevel = maxWaterLevel;
        currentCoffeeBeansLevel = maxCoffeeBeansLevel;

    }


    public boolean checkMinimumLevel() {
        if (currentWaterLevel < 100 || currentCoffeeBeansLevel < 50) {
            return false;
        }
        return true;
    }


    public String brew(String coffee) {
        if (!checkMinimumLevel()) {
            return "Please fill coffeemachine";
        }

        switch(coffee) {
            case "espresso":
                currentWaterLevel -= 50;
                currentCoffeeBeansLevel -= 20;
            case "americano":
                currentWaterLevel -= 100;
                currentCoffeeBeansLevel -= 30;
                break;
            case "espresso doppo":
                currentCoffeeBeansLevel -= 100;
                currentCoffeeBeansLevel -= 50;
                break;
            default:
                currentWaterLevel -= 200;
                return "Coffee not offered";
        }
        return coffee + " brewed";
    }
}
