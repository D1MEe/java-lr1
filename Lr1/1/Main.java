public class Main {
    public static void main(String[] args) {

        // Create a burger using the Builder
        Burger Burger = new Burger.BurgerBuilder()
                .setcutlet("Яловичина")
                .setroll("Звичайна")
                .setSauce("Кетчуп")
                .setToppings("Огірок", "Цибуля", "Олiвки")
                .build();

        System.out.println(Burger);

       // Create another burger with another set of parameters
        Burger anotherOneBurger = new Burger.BurgerBuilder()
                .setcutlet("Курка")
                .setroll("Житня")
                .setSauce("Сирний")
                .setToppings("Бекон", "Соус барбекю", "Сир")
                .build();

        System.out.println(anotherOneBurger);
    }
}