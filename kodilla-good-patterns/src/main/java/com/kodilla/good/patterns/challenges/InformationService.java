package com.kodilla.good.patterns.challenges;

public class InformationService {
    private String typeProcess;
    private boolean possibilityToBuy;

    public InformationService(String typeProcess, boolean possibilityToBuy) {
        this.typeProcess = typeProcess;
        this.possibilityToBuy = possibilityToBuy;
    }

    public String getTypeProcess() {
        return typeProcess;
    }

    public boolean isPossibilityToBuy() {
        return possibilityToBuy;
    }

    public void sendingMessage(String typeProcess, boolean possibilityToBuy) {
        String message;
        if (typeProcess.equals("Request to buy") && possibilityToBuy) {
            message = "We prepare the goods for shipping";
        } else if (typeProcess.equals("Request to buy") ) {
            message = "Sorry, but we can not sell this item";
        } else if (typeProcess.equals("Request to sending")) {
            message = "Actual we sending article";
        } else {
            message = "Transaction is not possibly to realization";
        }
        System.out.println(message);
    }
}
