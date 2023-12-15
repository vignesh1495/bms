package com.javabrains.model;

import com.javabrains.enums.PaymentMethodType;
import com.javabrains.enums.PaymentStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="payment")
public class Payment extends BaseModel{

        private String reference;
        private Double amount;

        @Enumerated
        private PaymentMethodType paymentMethodType;

        @Enumerated
        private PaymentStatus paymentStatus;

}

