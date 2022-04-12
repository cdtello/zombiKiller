package Memento;

public interface Originator {
  public void save(Object object);
  public Memento saveStateToMemento();
  public void getStateFromMemento(Memento memento);
  public Object getState();
}
