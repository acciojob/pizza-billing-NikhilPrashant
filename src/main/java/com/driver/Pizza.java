package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) price = 300;
        else price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    boolean isCheeseAdded = false;
    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded) {
            price += 80;
            isCheeseAdded = true;
        }
    }

    boolean areToppingsAdded = false;
    public void addExtraToppings(){
        // your code goes here
        if (!areToppingsAdded) {
            price += isVeg? 70 : 120;
            areToppingsAdded = true;
        }
    }

    boolean isTakeAwayAdded = false;
    public void addTakeaway(){
        // your code goes here
        if (!isTakeAwayAdded) {
            price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: " + (isVeg? 300 : 400)
                + (isCheeseAdded? "\nExtra Cheese Added: " + 80 : "")
                + (areToppingsAdded ? "\nExtra Toppings Added: " + (isVeg ? 70: 120) : "")
                + (isTakeAwayAdded ? "\nPaperbag Added: " + 20 : "")
                + "\nTotal Price: " + price + "\n";
        return this.bill;
    }
}
