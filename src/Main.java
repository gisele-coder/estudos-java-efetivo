import Cap2.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //new Room(10).close();

        try(Room myRoom = new Room(7)) {
            System.out.println("goodbye");
        }

        /*
        Stack stack = new Stack();
        stack.push(new String("Um"));
        stack.push(new String("Dois"));
        stack.push(new String("Tres"));
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());

        DependencyInjection.Engine carEngine = new DependencyInjection.Engine(); // Crie uma instância de Engine
        DependencyInjection.Car myCar = new DependencyInjection.Car(carEngine); // Injete a dependência (Engine) no construtor de Car
        myCar.startCar(); // Inicialize o carro

        System.out.println("Hello and welcome Deva!");

        Person1 person1 = Person1.createPerson("Alice", 30);

        Person2 person2 = new Person2.Builder("Alice", "Johnson")
                .age(30)
                .address("123 Main St")
                .build();

        List<String> lista = new ArrayList<>();
        lista.add("Objeto 1");
        lista.add("Objeto 2");

        String objetoRemovido = lista.remove(0);
        objetoRemovido = null;
        */

    }
}
