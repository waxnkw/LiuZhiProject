package po;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ProblemList implements Collection<Problem>{
	private ArrayList<Problem> problems;
	
	public Problem get(int i){
		return problems.get(i);
	}

	@Override
	public boolean add(Problem e) {
		return problems.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends Problem> c) {
		return problems.addAll(c);
	}

	@Override
	public void clear() {
		problems.clear();
	}

	@Override
	public boolean contains(Object o) {
		return problems.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return problems.isEmpty();
	}

	@Override
	public Iterator<Problem> iterator() {
		return problems.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return problems.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
