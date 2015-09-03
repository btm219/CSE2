public class Interest {
    
    public static void main(String [] args) {
        
        float interest;
        float balance;
        float simplify;
        float newbalance;
        float roundedbalance;
        
        interest = 0.21f;
        balance = 1200.10f;
        
        simplify = interest * balance;
        
        newbalance = simplify + balance;
        
        roundedbalance = Math.round(newbalance);
        
        System.out.println("Balance after interest = " + roundedbalance);
    }
}