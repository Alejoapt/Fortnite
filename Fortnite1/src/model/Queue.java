package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Queue<T> implements IQueue<T> {

		private LinkedList<T> list;

		public Queue(){
			newQueue();
		}

		public void newQueue() {
			list = new LinkedList<T>();
		}

		public T check() {
			if (!isEmpty())
				return list.get(0);
			else
				return null;
		}

		
		public void poll() {
			if (!isEmpty())
				list.remove(0);
		}

		public void offer(T nuevo) {
			list.add(nuevo);
		}

		public boolean isEmpty() {
			return list.size() == 0;
		}

	}
