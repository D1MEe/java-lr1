// Класс Main для демонстрации работы
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        // Создаем наблюдателей
        ConcreteObserver observer1 = new ConcreteObserver("Наблюдатель 1");
        ConcreteObserver observer2 = new ConcreteObserver("Наблюдатель 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // Изменяем состояние
        subject.changeState("Новое состояние 1");

        // Удаляем одного из наблюдателей
        subject.removeObserver(observer1);

        // Изменяем состояние 
        subject.changeState("Новое состояние 2");
    }
}