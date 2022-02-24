package org.selenium.pom.objects;

public class Order {
    private String name;
    private String number;

    public Order(){}
    public Order(String nama , String nomor){
        this.name = nama;
        this.number = nomor;
    }
    public String getName() {
        return name;
    }

    public Order setName(String name) {
        this.name = name;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Order setNumber(String number) {
        this.number = number;
        return this;
    }

}
