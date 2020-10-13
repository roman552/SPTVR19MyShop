/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Scanner;
import entity.Product;
/**
 *
 * @author A
 */
public class ProductFactory {
    public Product createProduct(){
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        product.setName(scanner.nextLine());
        System.out.print("Введите количество товара: ");
        product.setQuantity(scanner.nextInt());
        System.out.print("Введите цену товара: ");
        product.setPrice(scanner.nextInt());
        return product;
    }
    
}
