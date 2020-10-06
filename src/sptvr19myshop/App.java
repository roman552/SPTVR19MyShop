/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myshop;

import entity.Consumer;
import entity.Product;
import java.util.Scanner;

/**
 *
 * @author A
 */
class App {
    private Product[] productArray = new Product[5];
    private Consumer[] consumerArray = new Consumer[3];
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
                    Product product = new Product("яблоко", 100, 2);
                    productArray[0] = product;
                   
                    Product product1 = new Product("апельсин", 150, 1);
                    productArray[1] = product1;
                   
                    Product product2 = new Product("груша", 70, 2);
                    productArray[2] = product2;
                    
                    Product product3 = new Product("помидор", 140, 3);
                    productArray[3] = product3;
                    
                    Product product4 = new Product("арбуз", 150, 5);
                    productArray[4] = product4;
                    System.out.println("товар добавлен");
                    System.out.println("===========================================");
                    break;
                case (2):
                    System.out.println("---Список товаров---");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Название товара: "+productArray[i].getName()+"\nКоличество: "+productArray[i].getQuantity()
                                +" штук \nЦена : "+productArray[i].getPrice()+"$\n==========================");
                    }
                    System.out.println("===========================================");
                    break;
                case (3):
                    System.out.println("---Добавить покупки---");
                    Consumer consumer = new Consumer("Роман", productArray[0].getName(), 10);
                    Consumer consumer1 = new Consumer("Иван", productArray[4].getName(), 2);
                    Consumer consumer2 = new Consumer("Олег", productArray[2].getName(), 12);
                    consumerArray[0] = consumer;
                    consumerArray[1] = consumer1;
                    consumerArray[2] = consumer2;
                    System.out.println("Покупки добавлены");
                    System.out.println("===========================================");
                    break;
                case (4):
                    System.out.println("---Список покупок---");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(consumerArray[i].getName()+
                                " купил "+consumerArray[i].getPurchase()+
                                " в количестве "+consumerArray[i].getQuantity()+" штук");
                        System.out.println("===========================================");
                    }


                    break;
                default:
                    System.out.println("Неверная операция");
                    System.out.println("===========================================");
            }
        }while(a);
    }
}
