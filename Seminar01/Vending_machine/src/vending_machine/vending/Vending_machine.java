package Projects_OOP.Seminar01.Vending_machine.src.vending_machine.vending;

import java.util.List;
import java.util.ArrayList;

import Projects_OOP.Seminar01.Vending_machine.src.product.Product;

public class Vending_machine {
    private int id_product;
    private List<Product> productList;

    public Vending_machine() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        product.setId(id_product++);
        productList.add(product);
    }

    public String getProductsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:\n");
        for (Product product : productList) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
