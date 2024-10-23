public class Burger {
    private String cutlet;
    private String roll;
    private String sauce;
    private String[] toppings;

    // Private constructor to prevent objects from being created without using Builder
    private Burger(BurgerBuilder builder) {
        this.cutlet = builder.cutlet;
        this.roll = builder.roll;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
    }

    @Override
    public String toString() {
        return "Бургер [Розмiр=" + cutlet + ", булочка=" + roll + ", соус=" + sauce + ", добавки=" + String.join(", ", toppings) + "]";
    }

    // Nested Builder class
    public static class BurgerBuilder {
        private String cutlet;
        private String roll;
        private String sauce;
        private String[] toppings;

        public BurgerBuilder setcutlet(String cutlet) {
            this.cutlet = cutlet;
            return this;
        }

        public BurgerBuilder setroll(String roll) {
            this.roll = roll;
            return this;
        }

        public BurgerBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BurgerBuilder setToppings(String... toppings) {
            this.toppings = toppings;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}