package com.example.food.delivery.main.delivery.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "cooks")
public class Cook extends User {
    private String bio;
    private String bankAccount;

    @OneToMany(mappedBy = "cook", cascade = CascadeType.ALL)
    private List<Meal> menu;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public List<Meal> getMenu() {
        return menu;
    }

    public void setMenu(List<Meal> menu) {
        this.menu = menu;
    }
}
