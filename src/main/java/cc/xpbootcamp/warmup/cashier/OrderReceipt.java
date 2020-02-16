package cc.xpbootcamp.warmup.cashier;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 *
 */
public class OrderReceipt {
    private Order order;
    private final StringBuilder output = new StringBuilder();
    private final String HEADER_TEXT = "======Printing Orders======\n";
    private final String SALES_TAX_TEXT = "Sales Tax";
    private String TOTAL_AMOUNT_TEXT = "Total Amount";

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        appendHeader();

        appendCustomerInfo();
        appendLineItemInfo();

        appendTheStateTax();
        appendTheTotalAmount();

        return output.toString();
    }

    double calculateTotalAmount() {
        double total = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            total += lineItem.getTotal();
        }
        return total;
    }

    double calculateTotalSalesTax() {
        double totalSalesTax = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            totalSalesTax += lineItem.getSalesTax();
        }
        return totalSalesTax;
    }

    void appendLineItemInfo() {
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');
        }
    }

    void appendTheStateTax() {
        output.append(SALES_TAX_TEXT).append('\t').append(calculateTotalSalesTax());
    }

    void appendTheTotalAmount() {
        output.append(TOTAL_AMOUNT_TEXT).append('\t').append(calculateTotalAmount());
    }

    private void appendCustomerInfo() {
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
    }

    private StringBuilder appendHeader() {
        return output.append(HEADER_TEXT);
    }
}