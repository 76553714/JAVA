package ·ºÐÍ;

import java.util.List;

public interface Dao <T> 
{
	void add(T t);
	void update(T t);
	void del(T t);
	T getByID();
	List<T> AllList();
}
