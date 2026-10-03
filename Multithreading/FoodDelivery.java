class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order placement started");
        System.out.println("Order placed successfully");
    }
}

class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order delivery started");
        System.out.println("Order delivered successfully");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        OrderPlacement order = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        order.start();

        try {
            order.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        delivery.start();
    }
}
