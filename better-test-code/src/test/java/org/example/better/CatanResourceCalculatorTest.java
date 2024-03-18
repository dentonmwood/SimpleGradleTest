package org.example.better;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

class CatanResourceCalculatorTest {
    @Test void testCatanResourceEmptyHand() {
        Player player = new Player("Denton", new HashMap<>());
        assertEquals(false, CatanResourceCalculator.hasEnoughResourcesForSettlement(player));
    }

    @Test void testCatanResourceNotEnoughResources() {
        Map<ResourceType, Integer> insufficientHand = new HashMap<>();
        insufficientHand.put(ResourceType.SHEEP, 2);
        insufficientHand.put(ResourceType.WOOD, 3);
        Player player = new Player("Emma", insufficientHand);
        assertEquals(false, CatanResourceCalculator.hasEnoughResourcesForSettlement(player));
    }

    @Test void testCatanResourceEnoughResources() {
        Map<ResourceType, Integer> sufficientHand = new HashMap<>();
        sufficientHand.put(ResourceType.SHEEP, 2);
        sufficientHand.put(ResourceType.WOOD, 1);
        sufficientHand.put(ResourceType.BRICK, 1);
        sufficientHand.put(ResourceType.WHEAT, 1);
        Player player = new Player("Andrew", sufficientHand);
        assertEquals(true, CatanResourceCalculator.hasEnoughResourcesForSettlement(player));
    }
}
