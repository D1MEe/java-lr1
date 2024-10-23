import java.util.ArrayList;
import java.util.List;

// Класс ConcreteSubject, реализующий интерфейс Subject
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Метод для изменения состояния субъекта и уведомления наблюдателей
    public void changeState(String newState) {
        notifyObservers("Состояние изменилось на: " + newState);
    }
}