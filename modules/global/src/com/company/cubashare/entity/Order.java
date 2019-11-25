package com.company.cubashare.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import java.math.BigDecimal;
import java.util.Date;

@MetaClass(name = "cubashare_Order")
public class Order extends BaseUuidEntity {
    private static final long serialVersionUID = 1677948234694312116L;

    public BigDecimal amount;
    public Date date;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}