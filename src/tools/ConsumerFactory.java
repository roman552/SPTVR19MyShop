/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Scanner;
import entity.Consumer;

/**
 *
 * @author A
 */
public class ConsumerFactory {
    public Consumer createConsumer() {
        Consumer consumer = new Consumer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя покупателя: ");
        consumer.setName(scanner.nextLine());
        System.out.println("Введите имя купленного товара: ");
        consumer.setPurchase(scanner.nextLine());
        System.out.println("Введите количество купленного товара");
        consumer.setQuantity(scanner.nextInt());
        return consumer;
    }
}
