import java.math.BigDecimal;

public class TaxCalculator {
    public static void main(String[] args) {
        double productCost = 9.99;
        double VAT = (0.23 * productCost);
        double grossCost = (9.99 + VAT);

        BigDecimal newProductCost = new BigDecimal(productCost);
        BigDecimal newGrossCost = new BigDecimal(grossCost);
        BigDecimal numberOfProducts = new BigDecimal(10000);

        BigDecimal totalProductCost = newProductCost.multiply(numberOfProducts);
        System.out.println("The cost of all 10,000 products sold at net price is " + totalProductCost + ".");

        BigDecimal totalGrossCost = newGrossCost.multiply(numberOfProducts);
        System.out.println("The cost of all 10,000 products sold at gross price is " + totalGrossCost+ ".");

        int newGrossCostInt = totalGrossCost.intValue();
        int newProductCostInt = totalProductCost.intValue();

        System.out.println("The cost of all 10,000 products sold at net price in integer type is " + newProductCostInt+ ".");
        System.out.println("The cost of all 10,000 products sold at gross price in integer type is " + newGrossCostInt+ ".");

        //Conclusions: Products sold at Net Price are cheaper than products sold at Gross Price.
    }
}
