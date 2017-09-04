package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.food2doors.*;

import java.util.ArrayList;

public class ProductOrderServiceF2D {

    public InformationServiceF2D informationService;
    public TransactionServiceF2D transactionService;

    public ProductOrderServiceF2D(final InformationServiceF2D informationService,
                                  final TransactionServiceF2D transactionService ) {
        this.informationService = informationService;
        this.transactionService = transactionService;
    }

    public void process(String requestBuy, ArrayList<String> productList, String clientTypeRequest)
    {
        Cargo cargo= new Cargo();
        boolean possibilityToBuy = cargo.existsProduct(productList, requestBuy);
        informationService.sendingMessage("Request to buy", possibilityToBuy);

        if (possibilityToBuy) {
            if (clientTypeRequest.equals("GlutenFreeShop")){
                OrderProcessGFS orderProcess = new OrderProcessGFS();
                orderProcess.inform();
                orderProcess.process();
            } else if (clientTypeRequest.equals("HealthyShop")) {
                OrderProcessHS orderProcess = new OrderProcessHS();
                orderProcess.inform();
                orderProcess.process();

            }  else if (clientTypeRequest.equals("ExtraFoodShop")) {
                OrderProcessEFS orderProcess = new OrderProcessEFS();
                orderProcess.inform();
                orderProcess.process();

            }

            transactionService.realization();
            informationService.sendingMessage("Request to sending", true);
        }

    }
}