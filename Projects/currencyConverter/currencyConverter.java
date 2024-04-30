package currencyConverter;

import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class currencyConverter {

    public static void main(String[] args) {

        double npr = 0.00, dollar = 0.00, euro = 0.00, yen = 0.00, indNpr = 0.00, currency, convert;
        DecimalFormat d = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);

        System.out.println("------Currency Converter------");
        System.out.println("Enter 1 : Neplai Rupee");
        System.out.println("Enter 2 : Euro (ER)");
        System.out.println("Enter 3 : Japneese yen(YN)");
        System.out.println("Enter 4 : Indian Rupese (NPR)");
        System.out.println("Enter 5 : Dollar$(D)");
        System.out.println("\n");
        System.out.println("Enter the currency");
        currency = sc.nextInt();

        if (currency == 1) {
            System.out.println("Enter the amount in Neplese Rupeese");
            npr = sc.nextFloat();
            System.out.println(" Convert the currency into -----");
            System.out.println("Enter 1 : Dollar$(D)");
            System.out.println("Enter 2 : Euro (ER)");
            System.out.println("Enter 3 : Japneese yen(YN)");
            System.out.println("Enter 4 : Indian Rupese (NPR)");
            System.out.println("\n");
            System.out.println("Enter the Currency Converter");
            convert = sc.nextInt();

            System.out.println("\n");

            if (convert == 1) {
                dollar = npr * 0.0075;
                System.out.println("Dollar : " + d.format(dollar));
            } else if (convert == 2) {
                euro = npr * 0.0070;
                System.out.println("Euro : " + d.format(euro));
            } else if (convert == 3) {
                yen = npr * 1.17;
                System.out.println("Japneese Yen : " + d.format(yen));
            } else if (convert == 4) {
                indNpr = npr * 0.62;
                System.out.println("Indian Rupeese : " + d.format(indNpr));
            } else {
                System.out.println("----Invalid-----");
            }
        } else if (currency == 2) {
            System.out.println("Enter the amount in Euro");
            euro = sc.nextFloat();
            System.out.println(" Convert the currency into -----");
            System.out.println("Enter 1 : Nepali Rupee (npr)");
            System.out.println("Enter 2 : Japneese yen(YN)");
            System.out.println("Enter 3 : Indian Rupese (NPR)");
            System.out.println("Enter 4 : DOllar($)");
            System.out.println("\n");
            System.out.println("Enter the Currency Converter");
            convert = sc.nextInt();
            if (convert == 4) {
                dollar = euro / 0.93;
                System.out.println("Dollar : " + d.format(dollar));
            } else if (convert == 1) {
                npr = euro * 143.26;
                System.out.println("Euro : " + d.format(npr));
            } else if (convert == 2) {
                yen = euro * 168.26;
                System.out.println("Japneese Yen : " + d.format(yen));
            } else if (convert == 3) {
                indNpr = euro * 89.51;
                System.out.println("Indian Rupeese : " + d.format(indNpr));
            } else {
                System.out.println("----Invalid-----");
            }

        } else if (currency == 3) {
            System.out.println("Enter the amount in Japnese yen");
            yen = sc.nextFloat();
            System.out.println(" Convert the currency into -----");
            System.out.println("Enter 1 : Nepali Rupee (npr)");
            System.out.println("Enter 2 : Euro (ER)");
            System.out.println("Enter 3 : Indian Rupese (NPR)");
            System.out.println("Enter 4 : Dollar(D)");
            System.out.println("\n");
            System.out.println("Enter the Currency Converter");
            convert = sc.nextInt();
            if (convert == 1) {
                npr = yen * 0.85;
                System.out.println("Nepali Rupee : " + d.format(npr));
            } else if (convert == 2) {
                euro = yen * 0.0059;
                System.out.println("Euro : " + d.format(euro));
            } else if (convert == 3) {
                indNpr = yen * 0.53;
                System.out.println(" Indian Rupeese: " + d.format(indNpr));
            } else if (convert == 4) {
                dollar = yen * 0.0064;
                System.out.println("Dollar : " + d.format(dollar));
            } else {
                System.out.println("----Invalid-----");
            }
        } else if (currency == 4) {
            System.out.println("Enter the amount in Indian  Rupee");
            indNpr = sc.nextFloat();
            System.out.println(" Convert the currency into -----");
            System.out.println("Enter 1 : Nepali Rupee (npr)");
            System.out.println("Enter 2 : Euro (ER)");
            System.out.println("Enter 3 : Japneese yen(YN)");
            System.out.println("Enter 4 : Dollar (D)");
            System.out.println("\n");
            System.out.println("Enter the Currency Converter");
            convert = sc.nextInt();
            if (convert == 1) {
                npr = indNpr * 1.60;
                System.out.println("Nepali Rupee : " + d.format(npr));
            } else if (convert == 2) {
                euro = indNpr * 0.011;
                System.out.println("Euro : " + d.format(euro));
            } else if (convert == 3) {
                yen = indNpr * 1.88;
                System.out.println("Japneese Yen : " + d.format(yen));
            } else if (convert == 4) {
                dollar = indNpr * 0.012;
                System.out.println("Indian Rupeese : " + d.format(dollar));
            } else {
                System.out.println("----Invalid-----");
            }

        } else if (currency == 5) {
            System.out.println("Enter the amount in dollar");
            dollar = sc.nextFloat();
            System.out.println(" Convert the currency into -----");
            System.out.println("Enter 1 : Nepali Rupee (npr)");
            System.out.println("Enter 2 : Euro(ER)");
            System.out.println("Enter 3 : Japneese yen(YN)");
            System.out.println("Enter 4 : Indian Rupese (NPR)");
            System.out.println("\n");
            System.out.println("Enter the Currency Converter");
            convert = sc.nextInt();
            if (convert == 1) {
                npr = dollar * 133.59;
                System.out.println("Nepali Rupee : " + d.format(npr));
            } else if (convert == 2) {
                euro = dollar * 0.93;
                System.out.println("Euro : " + d.format(euro));
            } else if (convert == 3) {
                yen = dollar * 156.90;
                System.out.println("Japneese Yen : " + d.format(yen));
            } else if (convert == 4) {
                indNpr = dollar * 83.46;
                System.out.println("Indian Rupeese : " + d.format(indNpr));
            } else {
                System.out.println("----Invalid-----");
            }
        } else {
            System.out.println("Invalid Currency ");
        }

    }
}
