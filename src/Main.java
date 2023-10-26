import Cap2.DependencyInjection;
import Cap2.Person1;
import Cap2.Person2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        DependencyInjection.Engine carEngine = new DependencyInjection.Engine(); // Crie uma instância de Engine
        DependencyInjection.Car myCar = new DependencyInjection.Car(carEngine); // Injete a dependência (Engine) no construtor de Car
        myCar.startCar(); // Inicialize o carro

        System.out.println("Hello and welcome Deva!");

        Person1 person1 = Person1.createPerson("Alice", 30);

        Person2 person2 = new Person2.Builder("Alice", "Johnson")
                .age(30)
                .address("123 Main St")
                .build();

    }
}
