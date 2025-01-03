package com.renepont.bussmanager.domain.enumeration;

/**
 * The TransactionType enumeration.
 */
public enum TransactionType {
    INCOME("Receita"),
    EXPENSE("Despesa");

    private final String value;

    TransactionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
