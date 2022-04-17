package adapter;

import java.util.Collection;

import model.Automobile;

public interface StoreAutos  {

	public void addHashLink(String key, Automobile a1);
	public void removeHashLink(String key);
	public Automobile findHashLink(String key);
	public void deleteHashMap();
	public void printLinkedHashMap();
	public int getSize();
	public Collection<Automobile> getValues();

	
}
