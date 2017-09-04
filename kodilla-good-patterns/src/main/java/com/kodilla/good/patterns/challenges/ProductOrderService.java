package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.lang.Exception;

public class ProductOrderService {

    private InformationService informationService;
    private TransactionService transactionService;

    public ProductOrderService(final InformationService informationService,
                           final TransactionService transactionService ) {
        this.informationService = informationService;
        this.transactionService = transactionService;
    }

    public static void main (String[] args)  throws java.lang.Exception
    {
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
    }
}