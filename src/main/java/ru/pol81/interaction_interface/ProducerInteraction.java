package ru.pol81.interaction_interface;

import ru.pol81.entity.Amount;
import ru.pol81.entity.Producer;
import ru.pol81.entity.Product;
import ru.pol81.entity.ProductType;

import java.time.LocalDate;

/**
 * Created by SBT-Sarafanov-PV on 08.06.2016.
 */
public interface ProducerInteraction {
    static Product produce(Producer producer, ProductType type, Amount amount, LocalDate createDate) {
        Product result = new Product();
        result.producer = producer;
        result.type = type;
        result.amount = amount;
        result.createDate = createDate;
        return result;
    }

}
