package po;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import assistant.ContactWayEnum;

public class ContactWayList implements Map<ContactWayEnum, ContactWay>{
	private HashMap<ContactWayEnum, ContactWay> contactMap;
	
	@Override
	public void clear() {
		contactMap.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return contactMap.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return contactMap.containsValue(value);
	}


	@Override
	public Set<java.util.Map.Entry<ContactWayEnum, ContactWay>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactWay get(Object key) {
		return contactMap.get(key);
	}

	@Override
	public boolean isEmpty() {
		return contactMap.isEmpty();
	}

	@Override
	public Set<ContactWayEnum> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactWay put(ContactWayEnum key, ContactWay value) {
		return contactMap.put(key, value);
	}

	@Override
	public void putAll(Map<? extends ContactWayEnum, ? extends ContactWay> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ContactWay remove(Object key) {
		return contactMap.remove(key);
	}

	@Override
	public int size() {
		return contactMap.size();
	}

	@Override
	public Collection<ContactWay> values() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
