package com.example.fastpassservice.fastpassservice;

import java.math.BigDecimal;

public class FastPassCustomer {

    private String fastPassId;
    private String customerFullName;
    private String fastPassPhone;
    private BigDecimal currentBalance;

    public FastPassCustomer() {
    }

    public FastPassCustomer(String fastPassId, String customerFullName, String fastPassPhone, BigDecimal currentBalance) {
        this.fastPassId = fastPassId;
        this.customerFullName = customerFullName;
        this.fastPassPhone = fastPassPhone;
        this.currentBalance = currentBalance;
    }

    public String getFastPassId() {
        return fastPassId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public String getFastPassPhone() {
        return fastPassPhone;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }
}
