package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {

    CoffeeMachine coffeeMachine = new CoffeeMachine(300, 250);


    @Test
    @DisplayName("Test Konstruktor")
    void testConstructor() {
        assertEquals(300, coffeeMachine.getMaxWaterLevel());
        assertEquals(250, coffeeMachine.getMaxCoffeeBeansLevel());
        assertEquals(0, coffeeMachine.getCurrentWaterLevel());
        assertEquals(0, coffeeMachine.getCurrentCoffeeBeansLevel());


    }

    /**
     * verify currentValues
     */
    @Test
    void fill() {

        assertEquals(300);

    }

    /**
     * Verify current values
     */
    @Test
    void clean() {

    }

    /**
     * test result if one or more levels are lower than minimum level
     */
    @Test
    void checkMinimumLevelBeforeFill() {


    }

    /**
     * check current values beyond limits
     */
    @Test
    void checkMinimumLevelAfterFill() {


    }

    /**
     * Verify return message,
     * currentWaterLevel and currentCoffeeBeansLevel
     * (don't forget to fill the machine)
     */
    @Test
    void brewSuccessAmericano() {

    }

    /**
     * order a coffee type "melange"
     * Verify return message
     * (don't forget to fill the machine)
     */
    @Test
    void brewMelange() {

    }

    /**
     * brew 3 times espresso doppo
     * used coffeemachine should only have a maxWaterLevel of 250
     * (don't forget to fill the machine)
     */
    void brew3EspressoDoppoWithMaxWaterLevel250() {

    }
}