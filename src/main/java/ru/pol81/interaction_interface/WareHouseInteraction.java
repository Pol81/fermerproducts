package ru.pol81.interaction_interface;

import ru.pol81.entity.Amount;
import ru.pol81.entity.Product;
import ru.pol81.entity.Storage;
import ru.pol81.entity.WareHouse;

import java.util.Iterator;

/**
 * Created by SBT-Sarafanov-PV on 08.06.2016.
 */
public interface WareHouseInteraction {

    static boolean receive(WareHouse wareHouse, Product... productArray) {
        for (Product product:productArray) {
            Iterator<Storage> iterator = wareHouse.storages.iterator();
            while (iterator.hasNext()) {
                Storage storage = iterator.next();
                Amount amount = storage.amountMap.get(product.type);
                if (amount-product.amount)
            }
        }
        return false;
    }
}
