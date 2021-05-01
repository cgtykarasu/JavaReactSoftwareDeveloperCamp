/**
 * @author Çağatay KARASU
 * @since 04.2021
 **/

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1, "Lenovo V15 IIL", 4.399,
                "Intel Core i3 1005G1 8GB 256GB SSD Windows 10 Home 15.6\" FHD");

        Product product2 = new Product(2, "Lenovo IdeaPad", 5.399,
                "AMD Ryzen 7 5700U 8GB 512GB SSD Freedos 14\" FHD Taşınabilir");

        Product product3 = new Product(3, "Lenovo V14 IGL", 6.399,
                "Intel Celeron N4020 8GB 256GB SSD Windows 10 Home 14\" FHD");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {

            System.out.println(product.name);
        }

        System.out.println(products.length);

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev/Bahçe";

        ProductManager productManager = new ProductManager();

        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);

    }
}
