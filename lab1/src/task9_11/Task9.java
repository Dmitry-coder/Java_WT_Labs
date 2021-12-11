package task9_11;

public class Task9 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addToEnd("синий", 1);
        basket.addToEnd("синий", 2);
        basket.addToEnd("красный", 3);
        basket.addToEnd("синий", 4);
        basket.addToEnd("красный", 5);
        basket.addToEnd("синий", 6);

        System.out.println("вес корзины: " + basket.countWeight(basket));
        System.out.println("синих шаров в корзине: " + basket.countBlueBalls(basket));
    }
}
