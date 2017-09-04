package com.kodilla.good.patterns.food2doors;

import java.util.ArrayList;

public class CargoF2D {
    public boolean existsProduct(ArrayList<String> productList, String product) {
        boolean possibilityToBuy = false;

        for(int n = 0; n < productList.size(); n++) {
            if (product.equals(productList.get(n))) {
                possibilityToBuy = true;
            }
        }
        return possibilityToBuy;
    }

}
