package controller;

import models.Purchase;
import utils.Rounder;
import views.PurchaseView;

public class PurchaseController {

    Purchase model;
    PurchaseView view;

    // Конструктор
    public PurchaseController(Purchase model, PurchaseView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getClientName();

        double paymentInitial = model.calculatePayment(
                model.getQuantity(), model.getPrice()
        );
        String paymentInitialRounded = Rounder.roundValue(paymentInitial);

        double discount = model.calculateDiscount(paymentInitial);
        String discountRounded = Rounder.roundValue(discount);

        String paymentRounded = Rounder.roundValue(
                model.calculatePayment(paymentInitial, discount)
        );

        String output = "------------------------------\n" +
                "Client name: " + name + "\n" +
                "Purchase amount: " + paymentInitialRounded + "\n" +
                "Discount amount: " + discountRounded + "\n" +
                "For payment: " + paymentRounded;

        view.getOutput(output);
    }
}
