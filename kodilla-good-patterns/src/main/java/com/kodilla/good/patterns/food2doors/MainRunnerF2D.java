package com.kodilla.good.patterns.food2doors;

import com.kodilla.good.patterns.challenges.ProductOrderServiceF2D;

import java.util.ArrayList;

public class MainRunnerF2D {

    public static void main(String[] args) throws java.lang.Exception {

        ArrayList<String> warehouse = new GenerationListF2D().newList();
        String clientRequest = "Milk";
//        String clientRequest = "Eggs";
//        String clientTypeRequest = "GlutenFreeShop";
        String clientTypeRequest = "ExtraFoodShop";

        CargoF2D cargo = new CargoF2D();
        boolean possibilityToBuy = cargo.existsProduct(warehouse, clientRequest);
        TransactionServiceF2D transactionService = new TransactionServiceF2D();
        InformationServiceF2D informationService = new InformationServiceF2D(clientRequest, possibilityToBuy);

        ProductOrderServiceF2D productOrderServiceF2D = new ProductOrderServiceF2D(informationService, transactionService);

        productOrderServiceF2D.process(clientRequest, warehouse, clientTypeRequest);
    }

}
