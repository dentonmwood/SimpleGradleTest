package org.example.mock;

import org.example.better.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class CatanResourceCalculatorTest {
    @Test void testLoadPlayers() {
        CatanResourceRepository catanResourceRepository = mock(CatanResourceRepository.class);
        List<Player> expectedList = Arrays.asList(new Player("Jamie", new HashMap<>()));
        when(catanResourceRepository.loadPlayers()).thenReturn(expectedList);
        assertEquals(expectedList, CatanResourceCalculator.initializePlayers(catanResourceRepository));
    }
}
