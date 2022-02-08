package _12_Java_Collection_Framework.bai_tap.luyen_tap_sd_ArrayList_LinkedList_trg_JVCollectionFramework;

import java.util.List;
import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        do {
            System.out.println("1. Create product\n2. Update product\n3. Delete a product\n4. Display list product" +
                    "\n5. Search by name\n6. Sort by price\n7. Exit");
            int choose;
            do {
                System.out.print("Input your choose: ");
                choose = Integer.parseInt(scanner.nextLine());
            } while (choose > 7 || choose < 0);

            switch (choose) {
                case 1:
                    create();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    System.out.println("Input id to delete: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    productManager.delete(id);
                    System.out.println("Delete successful!");
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Input name to search: ");
                    String name = scanner.nextLine();

                    productManager.search(name).forEach(System.out:: println);
//                    List<Product> productList = productManager.search(name);
//                    for (int i = 0; i < productList.size(); i++) {
//                        System.out.println(productList.get(i));
//                    }


                    break;
                case 6:
                    productManager.sort();
                    productManager.getAll().forEach(System.out:: println);
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);

    }

    private static void create() {
        inputSave(0);
        System.out.println("Create sucessfull!");
    }

    private static void display() {
//        List<Product> productList= productManager.getAll();
//        for (int i = 0; i < productList.size(); i++) {
//            System.out.println(productList.get(i));
//        }

        productManager.getAll().forEach(System.out::println);
    }

    private static void update() {
        System.out.print("Input id to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        inputSave(id);
        System.out.println("Updated sucessfull!");
    }

    private static void inputSave(int id) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Desciption: ");
        String description = scanner.nextLine();
        Product product = new Product(id, name, price, description);
        productManager.save(product);
    }
}