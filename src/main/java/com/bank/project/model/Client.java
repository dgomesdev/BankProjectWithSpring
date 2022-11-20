package com.bank.project.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Client implements ClientInterface{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String nature;

    @Override
    public void openAccount() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdrawaw() {

    }

    @Override
    public void transfer() {

    }

    @Override
    public void printStatement() {

    }

    @Override
    public void closeAccount() {

    }
}
