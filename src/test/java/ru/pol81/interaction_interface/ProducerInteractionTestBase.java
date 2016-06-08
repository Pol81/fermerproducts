package ru.pol81.interaction_interface;

import org.junit.Before;
import ru.pol81.entity.Amount;
import ru.pol81.entity.AmountType;
import ru.pol81.entity.Producer;
import ru.pol81.entity.Product;
import ru.pol81.entity.ProductType;
import ru.pol81.entity.Storage;
import ru.pol81.entity.StorageType;
import ru.pol81.entity.WareHouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by SBT-Sarafanov-PV on 08.06.2016.
 */
public class ProducerInteractionTestBase {
    Producer producer1;
    Producer producer2;
    WareHouse wareHouse1;
    WareHouse wareHouse2;
    StorageType storageType1;
    StorageType storageType2;
    ProductType productType1;
    ProductType productType2;
    AmountType amountType1;
    AmountType amountType2;
    Product product1;
    Product product2;
    Product product3;
    Product product4;

    @Before
    public void setUp() {
        producer1 = new Producer();
        producer2 = new Producer();

        storageType1 = new StorageType();
        storageType2 = new StorageType();

        amountType1 = new AmountType();
        amountType2 = new AmountType();

        wareHouse1 = new WareHouse();
        wareHouse1.storages = new ArrayList<>();
        Storage storage1 = new Storage();
        storage1.type = storageType1;
        storage1.amountMap = new HashMap<>();
        storage1.amountMap.put(productType1, new Amount(amountType1, 100));
        wareHouse1.storages.add(storage1);

        wareHouse2 = new WareHouse();
        wareHouse2.storages = new ArrayList<>();
        Storage storage2 = new Storage();
        Storage storage3 = new Storage();
        storage2.type = storageType1;
        storage3.type = storageType2;
        storage2.amountMap = new HashMap<>();
        storage3.amountMap = new HashMap<>();
        storage2.amountMap.put(productType1, new Amount(amountType1, 150));
        storage3.amountMap.put(productType2, new Amount(amountType1, 300));

        wareHouse2.storages.add(storage2);
        wareHouse2.storages.add(storage3);

        productType1 = new ProductType();
        productType2 = new ProductType();

        wareHouse2 = new WareHouse();


        product1 = ProducerInteraction.produce(producer1, productType1, new Amount(amountType1, 50), LocalDate.now());
        product2 = ProducerInteraction.produce(producer1, productType1, new Amount(amountType1, 70), LocalDate.now());
        product3 = ProducerInteraction.produce(producer1, productType1, new Amount(amountType2, 170), LocalDate.now());
        product4 = ProducerInteraction.produce(producer1, productType1, new Amount(amountType2, 280), LocalDate.now());

    }

}
