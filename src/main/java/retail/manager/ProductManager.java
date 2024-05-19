package retail.manager;

import retail.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();
    }

    // Method untuk menambah produk ke daftar produk
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Method untuk menghapus produk dari daftar produk
    public void removeProduct(Product product) {
        productList.remove(product);
    }

    // Method untuk mendapatkan semua produk dari daftar produk
    public List<Product> getAllProducts() {
        return productList;
    }

    // Method untuk mencari produk berdasarkan nama
    public Product findProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    // Method untuk mencari produk berdasarkan harga
    public List<Product> findProductByPrice(double price) {
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() == price) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }

    // Method untuk mencari produk berdasarkan jumlah yang tersedia
    public List<Product> findProductByQuantity(int quantity) {
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : productList) {
            if (product.getQuantity() == quantity) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }
}
