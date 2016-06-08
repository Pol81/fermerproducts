package ru.pol81.interaction_interface;

import ru.pol81.entity.BarCode;
import ru.pol81.entity.Product;
import ru.pol81.entity.WareHouse;

/**
 * Created by SBT-Sarafanov-PV on 08.06.2016.
 */
public interface BarCodeInteraction {
    static BarCode create (WareHouse wareHouse, Product product){
        return new BarCode();
    }
}
