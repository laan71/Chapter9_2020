public class Stock {

    /* Follow the example of the Circle class in  Section 9.2, design a class named Stock that contains:
       A String data field named symbol for the stock´s symbol.
       A String data field named name for the stock´s name.
       A double data field named previousClosingPrice that stores the stock price for the previous day.
       A double data field named currentPrice that stores the stock price for the current time.
       A constructor that creates a stock with the specified symbol and name.
       A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.

       Draw the UML diagram for the class than implement the class. Write a test program that creates a Stock object
       with the stock symbol ORCL, the name Oracle Corporation, and the previous closing price of 34.5.
       Set a new current price to 34.35 and display the price-change percentage.
    */

    // The 4 data fields
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // constructor that creates a stock with the specified symbol and name
    Stock(String specifiedSymbol, String specifiedName) {
        symbol = specifiedSymbol;
        name = specifiedName;
    }

    // a method named getChangePercent
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    void setPrice(double specifiedPreviousClosingPrice, double specifiedCurrentPrice) {
        previousClosingPrice = specifiedPreviousClosingPrice;
        currentPrice = specifiedCurrentPrice;
    }

    // Test program
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setPrice(34.5, 34.35);
        System.out.printf("The percentage change in price is %.2f%%", stock1.getChangePercent());
    }
}