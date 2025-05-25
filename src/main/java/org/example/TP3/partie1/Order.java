public class Order {
    private String id;
    private String customerId;
    private List<String> productIds;
    private double totalAmount;

    // Constructeur, getters et setters...
    public Order(String id, String customerId, List<String> productIds, double totalAmount) {
        this.id = id;
        this.customerId = customerId;
        this.productIds = productIds;
        this.totalAmount = totalAmount;
    }
}