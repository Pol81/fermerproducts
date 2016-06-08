package ru.pol81.entity;

import java.time.LocalDate;

/**
 * Created by SBT-Sarafanov-PV on 08.06.2016.
 */
public class Product {
    public Producer producer;
    public ProductType type;
    public Amount amount;
    public LocalDate createDate;
    public BarCode barCode;
}
