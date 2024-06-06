import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Product product1 = new Product(1, "Producto 1");
        Product product2 = new Product(2, "Producto 2");
        Product product3 = new Product(3, "Producto 3");
        Product product4 = new Product(4, "Producto 4");
        Product product5 = new Product(5, "Producto 5");
        
        // 1. Agregar 
        // List
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        
        // Set
        Set<Product> productSet = new HashSet<>();
        productSet.add(product2);
        productSet.add(product3);
        
        // Map
        Map<Integer, Product> productMap = new HashMap<>();
        productMap.put(product3.getId(), product3);
        productMap.put(product4.getId(), product4);
        
        // Stack
        Stack<Product> productStack = new Stack<>();
        productStack.push(product4);
        
        // Queue
        Queue<Product> productQueue = new LinkedList<>();
        productQueue.add(product5);
        
        // 2. Buscar 
        // List
        Product foundProduct = null;
        for (Product product : productList) {
            if (product.getId() == 1) {
                foundProduct = product;
                break;
            }
        }
        System.out.println("Producto encontrado en la lista: " + foundProduct);
        
        // Set
        System.out.println("¿El producto 2 está en el conjunto? " + productSet.contains(product2));
        
        // Map
        System.out.println("Producto con ID 3 encontrado en el mapa: " + productMap.get(3));
        
        // Stack
        System.out.println("¿El producto 4 está en la pila? " + productStack.contains(product4));
        
        // Queue
        System.out.println("¿El producto 5 está en la cola? " + productQueue.contains(product5));
        
        // 3. Insertar 
        // List
        productList.add(1, product3);
        System.out.println("Lista después de insertar el producto 3: " + productList);
        
        // Set
        productSet.add(product1);
        System.out.println("Conjunto después de insertar el producto 1: " + productSet);
        
        // Map
        productMap.put(product1.getId(), product1);
        System.out.println("Mapa después de insertar el producto 1: " + productMap);
        
        // Stack
        productStack.push(product1);
        System.out.println("Pila después de insertar el producto 1: " + productStack);
        
        // Queue
        productQueue.offer(product1);
        System.out.println("Cola después de insertar el producto 1: " + productQueue);
        
        // 4. Eliminar 
        // List
        productList.remove(product1);
        System.out.println("Lista después de eliminar el producto 1: " + productList);
        
        // Set
        productSet.remove(product3);
        System.out.println("Conjunto después de eliminar el producto 3: " + productSet);
        
        // Map
        productMap.remove(3);
        System.out.println("Mapa después de eliminar el producto con ID 3: " + productMap);
        
        // Stack
        productStack.pop();
        System.out.println("Pila después de eliminar el producto en la cima: " + productStack);
        
        // Queue
        productQueue.poll();
        System.out.println("Cola después de eliminar el primer producto: " + productQueue);
        
        // 5. Saber si un objeto existe
        // List
        System.out.println("¿El producto 2 está en la lista? " + productList.contains(product2));
        
        // Set
        System.out.println("¿El producto 4 está en el conjunto? " + productSet.contains(product4));
        
        // Map
        System.out.println("¿El mapa contiene un producto con ID 5? " + productMap.containsKey(5));
        
        // Stack
        System.out.println("¿La pila contiene el producto 5? " + productStack.contains(product5));
        
        // Queue
        System.out.println("¿La cola contiene el producto 3? " + productQueue.contains(product3));
    }
}

class Product {
    private int id;
    private String name;
    
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
