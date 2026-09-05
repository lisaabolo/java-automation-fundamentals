public class ShoppingCartCounter {
     public static void main(String[] args) {
        
        // A simulated shopping cart with item prices
        double[] cartItemPrices = {12.99, 24.50, 5.00, 99.99, 3.50};
        
        // This variable will hold our running total. It must start at 0.0!
        double calculatedTotal = 0.0;

        System.out.println("🧮 QA CHECK: Calculating shopping cart total...");

        // Loop through every item price in the cart
        for (int i = 0; i < cartItemPrices.length; i++) {
            
            // Add the current item's price to our running total
            calculatedTotal = calculatedTotal + cartItemPrices[i];
            
            System.out.println("Added item worth $" + cartItemPrices[i] + ". Current subtotal: $" + calculatedTotal);
        }

        // Simulating the final checkout page total displayed on a website
        double websiteDisplayedTotal = 145.98; 

        System.out.println("\n--- FINAL VERIFICATION ---");
        System.out.println("Expected (Our Code): $" + calculatedTotal);
        System.out.println("Actual (Website UI): $" + websiteDisplayedTotal);

        // QA Assert Logic
        if (calculatedTotal == websiteDisplayedTotal) {
            System.out.println("✅ TEST PASSED: Checkout math matches perfectly!");
        } else {
            System.out.println("❌ TEST FAILED: Math mismatch! Check for calculation bugs.");
        }
    }
}

