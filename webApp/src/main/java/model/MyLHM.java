package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class MyLHM <T extends Automobile> {

	private T t;
	private String hashkey;
	private LinkedHashMap<String, T> lhm = new LinkedHashMap<String, T>();
	
	public MyLHM() {}
	public MyLHM(T auto) { 
		auto = this.t;
	}
	public void setHashKey(String make, String model, String year) {
		make = this.t.getMake();
		model = this.t.getModel();
		year = this.t.getYear();
		this.hashkey = make+model+year;
	}
	public String getHashkey() { return this.hashkey; }
	public void addLink(String hashkey, T auto) {
		//this.hashkey = hashkey;
		this.lhm.put(hashkey, auto);
	}
	public void removeLink(String hashkey) {
		this.lhm.remove(hashkey);
	}
	public Automobile findLink(String hashkey) {
		return this.lhm.get(hashkey);
	}
	public void deleteMap() {
		this.lhm.clear();
	}
	public Collection<T> getValues() {
		return lhm.values();
	}
	public int getSize() {
		return lhm.size();
	}
	public void printMap() {
		int counter = 0;
		Collection<T> c = this.lhm.values();
		Iterator<T> itr = c.iterator();
		while(itr.hasNext()) {
			counter+=1;
			System.out.println("[" + counter + "] " + itr.next().getAuto());
		}
	}
	
}