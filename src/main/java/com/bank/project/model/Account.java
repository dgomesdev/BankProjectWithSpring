package com.bank.project.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Account {

    @Id
    private int accountNumber;
    private String accountType;
    private String ownerClient;

}
