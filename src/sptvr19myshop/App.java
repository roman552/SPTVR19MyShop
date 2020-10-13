/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myshop;

import entity.Consumer;
import entity.Product;

import java.util.Scanner;
import tools.ProductFactory;
import tools.ConsumerFactory;
import tools.ConsumerSaver;
import tools.ProductSaver;


/**
 *
 * @author A
 */
class App {
    private Product[] productArray = new Product[10];
    private Consumer[] consumerArray = new Consumer[10];

    public App(){
        ProductSaver productSaver = new ProductSaver();
        productArray = productSaver.loadFile();
        ConsumerSaver consumerSaver = new ConsumerSaver();
        consumerArray = consumerSaver.loadFile();

    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===My shop===");
        boolean a = true;
        do {
            System.out.println("0. Конец программы");
            System.out.println("1. Добавить товар");
            System.out.println("2. Список товаров");
            System.out.println("3. Добавить покупки");
            System.out.println("4. Список покупок");
            System.out.println("------------------------");
            int task = scanner.nextInt();
            switch (task) {
                case (0):
                    System.out.println("===Конец программы===");
                    a = false;
                    break;
                    
                case (1):
                    System.out.println("---Добавить товар---");
                    Product product;
                    ProductFactory productFactory = new ProductFactory();
                    product = productFactory.createProduct();
                    for (int i = 0; i < productArray.length; i++) {
                        if(productArray[i]==null) {
                            productArray[i] = product;
                            break;
                        }
                    }
                    System.out.println("товар добавлен");
                    ProductSaver productSaver = new ProductSaver();
                    productSaver.saveBooks(productArray);
                    System.out.println("===========================================");
                    break;
                case (2):
                    System.out.println("---Список товаров---");
                    for (int i = 0; i < productArray.length; i++) {
                        if(productArray[i]!=null) {
                            System.out.println("Название товара: "+productArray[i].getName()
                                    +"\nКоличество: "+productArray[i].getQuantity()
                                    +" штук \nЦена : "+productArray[i].getPrice()
                                    +"$\n==========================");
                        }
                    }
                    System.out.println("===========================================");
                    break;
                case (3):
                    System.out.println("---Добавить покупки---");
                    Consumer consumer;
                    ConsumerFactory consumerFactory = new ConsumerFactory();
                    consumer = consumerFactory.createConsumer();
                    for (int i = 0; i < consumerArray.length; i++) {
                        if(consumerArray[i]==null) {
                            consumerArray[i] = consumer;
                            break;
                        }    
                    }
                    System.out.println("Покупки добавлены");
                    ConsumerSaver consumerSaver = new ConsumerSaver();
                    consumerSaver.saveBooks(consumerArray);
                    System.out.println("===========================================");
                    break;
                case (4):
                    System.out.println("---Список покупок---");
                    for (int i = 0; i < consumerArray.length; i++) {
                        if(consumerArray[i]!=null) {
                        System.out.println(consumerArray[i].getName()+
                                " купил "+consumerArray[i].getPurchase()+
                                " в количестве "+consumerArray[i].getQuantity()+" штук");
                        System.out.println("===========================================");
                        }
                    }


                    break;
                default:
                    System.out.println("Неверная операция");
                    System.out.println("===========================================");
            }
        }while(a);
    }
}
