package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrillerTest {
    @Test
    public void DrillerTestOfCopiesBetween1_4() {
        Driller copy = new Driller();
        int quantity = copy.getPrice(4);
        assertEquals(8_000, quantity);
    }

    @Test
    public void DrillerTestOfCopiesBetween5_9() {
        Driller copy = new Driller();
        int quantity = copy.getPrice(9);
        assertEquals(16_200, quantity);
    }

    @Test
    public void DrillerTestOfCopiesBetween10_29() {
        Driller copy = new Driller();
        int quantity = copy.getPrice(29);
        assertEquals(46_400, quantity);
    }

    @Test
    public void DrillerTestOfCopiesBetween30_49() {
        Driller copy = new Driller();
        int quantity = copy.getPrice(49);
        assertEquals(73_500, quantity);
    }

    @Test
    public void DrillerTestOfCopiesBetween50_99() {
        Driller copy = new Driller();
        int quantity = copy.getPrice(99);
        assertEquals(128_700, quantity);
    }

    @Test
    public void DrillerTestOfCopiesBetween100_199() {
        Driller copy = new Driller();
        int quantity = copy.getPrice(199);
        assertEquals(238_800, quantity);
    }

    @Test
    public void DrillerTestOfCopiesBetween200_499() {
        Driller copy = new Driller();
        int quantity = copy.getPrice(499);
        assertEquals(548_900, quantity);
    }

    @Test
    public void DrillerTestOfCopiesBetween500AndAbove() {
        Driller copy = new Driller();
        int quantity = copy.getPrice(500);
        assertEquals(500_000, quantity);

    }
}
