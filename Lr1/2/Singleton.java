public class Singleton {
    // Уникальный экземпляр класса
    private static Singleton instance;

    private Singleton() {
    }

    // Метод для получения единственного экземпляра класса
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance; 
    }

    public void showMessage() {
        System.out.println("Welcome to Singleton!");
    }
}