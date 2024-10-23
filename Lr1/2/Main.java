public class Main {
    public static void main(String[] args) {
        // Получаем единственный экземпляр Singleton
        Singleton singleton = Singleton.getInstance();

        // Вызываем метод экземпляра
        singleton.showMessage();
    } 
}