public class InventoryValidator {
    public static void main(String[] args) {
        
        // Simulating data grabbed from a website's product grid
        String[] productNames = {"Laptop", "Smartphone", "Wireless Mouse", "Keyboard"};
        double[] productPrices = {999.99, 0.00, 25.50, 45.00}; // Oh no, a $0.00 bug!
        int[] stockCounts = {15, 5, 0, 82}; // Wireless mouse is out of stock

        System.out.println("📦 RUNNING STOREFRONT DATA VALIDATION...");

        // We use productNames.length to know how many times to loop
        for (int i = 0; i < productNames.length; i++) {
            
            System.out.println("\nAnalyzing Item #" + (i + 1) + ": " + productNames[i]);

            // QA Critical Check 1: Is the price broken/free?
            if (productPrices[i] <= 0.0) {
                System.out.println("🚨 QA CRITICAL ERROR: " + productNames[i] + " has an invalid price of $" + productPrices[i] + "!");
            }

            // QA Critical Check 2: Is it out of stock?
            if (stockCounts[i] == 0) {
                System.out.println("⚠️ QA WARNING: " + productNames[i] + " is out of stock. Verify 'Add to Cart' button is disabled.");
            }

            // If everything is completely normal
            if (productPrices[i] > 0.0 && stockCounts[i] > 0) {
                System.out.println("✅ Product data verified successfully.");
            }
        }

        System.out.println("\n🏁 INVENTORY VALIDATION COMPLETE.");
    }
}


