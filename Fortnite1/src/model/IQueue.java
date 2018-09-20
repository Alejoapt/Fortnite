package model;

public interface IQueue<T> {

	public abstract void newQueue();

	public abstract T check();

	public abstract void poll();

	public abstract void offer(T nuevo);

	public abstract boolean isEmpty();

}
