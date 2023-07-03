package Projects_OOP.Seminar01.Vending_machine.src.vending_machine;

import Projects_OOP.Seminar01.Vending_machine.src.product.Product;
import Projects_OOP.Seminar01.Vending_machine.src.vending_machine.vending.Vending_machine;
import Projects_OOP.Seminar01.Vending_machine.src.product.Bottle;

public class Main {
    public static void main(String[] args) {
        Vending_machine vending_machine = new Vending_machine();
        
        Product product1 = new Bottle("Coca-cola", 150, 1.5);
        Product product2 = new Product("Milka", 100);

        vending_machine.addProduct(product1);
        vending_machine.addProduct(product2);

        System.out.println(vending_machine.getProductsInfo());
    }
}
