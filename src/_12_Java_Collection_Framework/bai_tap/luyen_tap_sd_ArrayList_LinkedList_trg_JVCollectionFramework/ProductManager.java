package _12_Java_Collection_Framework.bai_tap.luyen_tap_sd_ArrayList_LinkedList_trg_JVCollectionFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ProductManager {
    private List<Product> products= new ArrayList<>();

    public void create(Product product){
        product.setId(products.size()+1);
        products.add(product);
    }

    public void update(Product product){
//        for (int i = 0; i < products.size(); i++) {
//            if(products.get(i).getId()== product.getId()){
//                products.set(i, product);
//                break;
//            }
//        }

        int index= products.indexOf(product);
        products.set(index, product);
    }

    public void save(Product product){
        if(product.getId()> 0){
            int index= products.indexOf(product);
            products.set(index, product);
        }
        else {
            product.setId(products.size()+1);
            products.add(product);
        }
    }

    public void delete(int id){
//        int size= products.size();
//        for (int i = 0; i < size; i++) {
//            if(products.get(i).getId()== id){
//                products.remove(i);
//                break;
//            }
//        }

        products.removeIf(e-> e.getId()== id);
    }

    public List<Product> getAll(){
        return products;
    }

    public List<Product> search(String name){
//        List<Product> result= new ArrayList<>();
//
//        int size= products.size();
//        for (int i = 0; i < size; i++) {
//            if(products.get(i).getName().contains(name)){
//                products.add(products.get(i));
//            }
//        }
//
//        return result;

        return products.stream().filter(e-> e.getName().contains(name)).collect(Collectors.toList());
    }

    public void sort(){
//        products.sort(new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return (int)o1.getPrice() - (int)o2.getPrice();
//            }
//        });

        Collections.sort(products);
    }
}
