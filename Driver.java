public class Driver {    
    public static void main(String[] args) {
        String[] dish = {"Sandwich", "Coffee", "French Fries", "Salad"};
        double[] cost = {6.5, 3.2, 4.0, 3.5};
        Bill bill = new Bill();
        bill.addOrder("Sandwich", 2, dish, cost); 
        bill.addOrder("Coffee", 2, dish, cost); 
        bill.addOrder("French Fries", 1, dish, cost); 
        bill.addOrder("Salad", 1, dish, cost);
        bill.getOrder();
        System.out.println(bill.getTotal()); 
    }

}
