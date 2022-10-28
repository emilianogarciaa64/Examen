public class Main {
    public static void main(String[] args) {

        User user1 = new User("Emiliano", "7861155269", "Catedral", "CU");
        Driver driver1 = new Driver("Motocicleta", "Pepe", "4438965769", "CU", "Zoo");
        System.out.print(driver1);
        System.out.print(user1);

        System.out.print("\nTu precio a pagar es: " + driver1.calculatePrice() + " pesos");
        
    }
    
}