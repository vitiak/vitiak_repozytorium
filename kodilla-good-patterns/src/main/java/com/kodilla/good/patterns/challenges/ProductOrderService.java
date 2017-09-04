package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class ProductOrderService {

    public InformationService informationService;
    public TransactionService transactionService;

    public ProductOrderService(final InformationService informationService,
                           final TransactionService transactionService ) {
        this.informationService = informationService;
        this.transactionService = transactionService;
    }

    public void process(String requestBuy, ArrayList<String> productList)
    {
        Cargo cargo= new Cargo();
        boolean possibilityToBuy = cargo.existsProduct(productList, requestBuy);
        informationService.sendingMessage("Request to buy", possibilityToBuy);

        if (possibilityToBuy) {
            transactionService.realization();
            informationService.sendingMessage("Request to sending", true);
        }

/*
        ArrayList<String> warehouse = new ArrayList<>();
        Cargo cargo = new Cargo();
        TransactionService transactionService = new TransactionService();

        warehouse.add("Kapcie");
        warehouse.add("Buty");
        warehouse.add("Piżama");
        warehouse.add("Koszulka");
        warehouse.add("Spodnie");
        warehouse.add("Skarpety");
        warehouse.add("Kurtka");

        String clientRequest = "Kapcie";
        boolean possibilityToBuy = cargo.existsProduct(warehouse, clientRequest);

        InformationService informationService = null;
        informationService.sendingMessage("Request to buy", possibilityToBuy);

        if (possibilityToBuy) {
            informationService.sendingMessage("Request to sending", possibilityToBuy);
            transactionService.realization();
        }
*/    }
}