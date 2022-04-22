package controllers;

import models.Purchase;
import views.PurchaseView;

public class PurchaseController {

    Purchase model;
    PurchaseView view;

    // Конструктор
    public PurchaseController(Purchase model, PurchaseView view) {
        this.model = model;
        this.view = view;
    }
}