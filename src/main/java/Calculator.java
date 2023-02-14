public class Calculator {
    String name;
    double cost;
    Calculator(String productName, double productCost){
        name = productName;
        cost = productCost;
    }
    void fullProductName(String productName){
        name = name + "\n" + productName;
    }

    void fullProductCost(double productCost){
        cost += productCost;
    }
}