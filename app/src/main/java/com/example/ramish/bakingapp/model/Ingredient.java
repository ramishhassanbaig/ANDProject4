
package com.example.ramish.bakingapp.model;

import java.io.Serializable;

public class Ingredient implements Serializable
{

    private int quantity;
    private String measure;
    private String ingredient;
    private final static long serialVersionUID = -8053630518152144327L;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

}
