package com.learn.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreditAccount extends Account{
    private BigDecimal creditLimit;
}
