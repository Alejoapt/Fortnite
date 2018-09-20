package model;

import java.util.ArrayList;

public class Queue<T> implements IQueue<T> {

		private ArrayList<T> list;

		public Queue(){
			newQueue();
		}

		public void newQueue() {
			list = new ArrayList<T>();
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
