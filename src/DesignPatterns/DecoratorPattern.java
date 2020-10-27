package DesignPatterns;

interface ShoppingCart{
    void cartList();
}

class ShoppingCartItem implements ShoppingCart{
    String item;
    int qty;
    double price;
    double total;

    private ShoppingCart shoppingCart;

    @Override
    public void cartList() {
        System.out.println(item + " is in your cart");
    }

    ShoppingCartItem(String item, int qty, double price){
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    public double getTotal() {
        return total = price * qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}

abstract class cartDecorator implements ShoppingCart{
    protected ShoppingCart cart;

    public cartDecorator(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void cartList() {
        cart.cartList();
    }
}

class DairyProduct extends cartDecorator{

    String milkProd;

    public DairyProduct(ShoppingCart cart) {
        super(cart);
    }

    @Override
    public void cartList() {
        cart.cartList();
        setMilkProd(cart);
    }

    private void setMilkProd(ShoppingCart cart){
        System.out.println("This is 3kg Fresh Cream Dairy Milk");
    }
}

public class DecoratorPattern {

    public static void main(String[] args) {
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem("2kg Cheddar Cheese", 1, 42);
        shoppingCartItem.cartList();
        System.out.println("--------------------------");
        System.out.println("Item in cart: " + shoppingCartItem.getItem());
        System.out.println("Price: R" + shoppingCartItem.getPrice());
        System.out.println("How many: " + shoppingCartItem.getQty());
        System.out.println("Total price: R" + shoppingCartItem.getTotal());

        ShoppingCart cart = new ShoppingCartItem("White Milky Chocolate", 2, 14.85);
        ShoppingCart cart1 = new DairyProduct(cart);
        System.out.println("---- cart list -----");
        cart1.cartList();
        cart.cartList();
    }
}
