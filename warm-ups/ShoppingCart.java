public class Order {

    private String itemName;
    private int priceInCents;
    private String discountCode;

    public Order(String itemName, int priceInCents) {
        this.itemName = itemName;
        this.priceInCents = priceInCents;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    private String normalizeDiscountCode(String discountCode) {
        for (char letter : discountCode.toCharArray()) {
            if (! Character.isLetter(letter) && letter != '$') {
                throw new IllegalArgumentException("Invalid discount code");
            }
        }
        return discountCode.toUpperCase();
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void applyDiscountCode(String discountCode) {
        this.discountCode = normalizeDiscountCode(discountCode);
    }
}
