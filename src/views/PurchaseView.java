package views;

import models.Purchase;

// View
public class PurchaseView {

    Purchase model;
    String title;
    String name;
    int quantity;
    double price;

    // Конструктор
    public PurchaseView(Purchase model) {

        this.model = model;
    }
}