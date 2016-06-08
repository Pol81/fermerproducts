package ru.pol81.interaction_interface;

import org.junit.Test;
import ru.pol81.entity.Amount;
import ru.pol81.entity.Product;

import java.time.LocalDate;

import static org.junit.Assert.*;

/**
 * Created by SBT-Sarafanov-PV on 08.06.2016.
 */
public class ProducerInteractionTest extends ProducerInteractionTestBase {
    @Test
    public void produce() throws Exception {


        assertTrue(WareHouseInteraction.receive(wareHouse1, product1));
        assertFalse(WareHouseInteraction.receive(wareHouse1, product2));

        assertTrue(WareHouseInteraction.receive(wareHouse2, product1));
        assertTrue(WareHouseInteraction.receive(wareHouse2, product2));

    }

}