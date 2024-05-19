package retail.gui;

import retail.manager.ProductManager;
import retail.model.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private ProductManager productManager;

    private JTextField nameField;
    private JTextField priceField;
    private JTextField quantityField;
    private JTextArea productArea;

    public MainFrame() {
        // Initialize ProductManager
        productManager = new ProductManager();

        // Set frame properties
        setTitle("Retail Management System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen

        // Create components
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel priceLabel = new JLabel("Price:");
        priceField = new JTextField();
        JLabel quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField();
        JButton addButton = new JButton("Add Product");
        addButton.addActionListener(new AddButtonListener());
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(priceLabel);
        inputPanel.add(priceField);
        inputPanel.add(quantityLabel);
        inputPanel.add(quantityField);
        inputPanel.add(addButton);

        productArea = new JTextArea();
        JScrollPane productScrollPane = new JScrollPane(productArea);

        // Add components to the frame
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(productScrollPane, BorderLayout.CENTER);
    }

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get input values
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            int quantity = Integer.parseInt(quantityField.getText());

            // Create a new product
            Product product = new Product(name, price, quantity);

            // Add the product to the ProductManager
            productManager.addProduct(product);

            // Update the product list display
            updateProductList();
        }
    }

    private void updateProductList() {
        productArea.setText(""); // Clear the text area
        for (Product product : productManager.getAllProducts()) {
            productArea.append(product.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
}
