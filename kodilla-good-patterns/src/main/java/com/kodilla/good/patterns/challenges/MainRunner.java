package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class MainRunner {
    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<String> warehouse = new GenerationList().newList();
        String clientRequest = "Smartfon";
//        String clientRequest = "Kurtka";

        Cargo cargo = new Cargo();
        boolean possibilityToBuy = cargo.existsProduct(warehouse, clientRequest);
        TransactionService transactionService = new TransactionService();
        InformationService informationService = new InformationService(clientRequest, possibilityToBuy);
        ProductOrderService productOrderService = new ProductOrderService(informationService, transactionService);

        productOrderService.process(clientRequest, warehouse);
   }
}