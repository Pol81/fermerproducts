package ru.pol81.entity;

/**
 * Created by SBT-Sarafanov-PV on 08.06.2016.
 */
public class Amount {
    public AmountType type;
    public int amount;

    public Amount(AmountType type, int amount) {
        this.type = type;
        this.amount = amount;
    }
}
