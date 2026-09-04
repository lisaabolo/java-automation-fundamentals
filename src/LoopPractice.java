public class LoopPractice {
    public static void main(String[] args) {
        
        // A list of search queries entered on an e-commerce site
        // Notice some have messy spaces or wrong capitalization!
        String[] searchQueries = {"  iphone 17 ", "macbook pro", "  ", "AIRPODS"};

        System.out.println("🔍 STARTING DATA CLEANING TEST...");

        // Loop through each search query
        for (int i = 0; i < searchQueries.length; i++) {
            
            String original = searchQueries[i];
            
            // 1. Clean up the data using Java String methods
            String cleaned = original.trim().toLowerCase(); 

            // 2. QA Validation: Check if the query is blank after trimming
            if (cleaned.isEmpty()) {
                System.out.println("❌ Item #" + i + ": FAIL - Search query cannot be blank!");
            } else {
                System.out.println("✅ Item #" + i + ": PASS - Cleaned Query: \"" + cleaned + "\"");
            }
        }

        System.out.println("🏁 DATA CLEANING COMPLETE.");
    }
}
