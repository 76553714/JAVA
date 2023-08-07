package 泛型;

import java.util.List;

public class DaoImple <T> implements Dao<T> 
{

	@Override
	public void add(T t) {
		System.out.println("add:"+t);
	}

	@Override
	public void update(T t) {
		System.out.println("update:"+t);
		
	}

	@Override
	public void del(T t) {
		// TODO 自动生成的方法存根
	System.out.println("del:"+t);
	}

	@Override
	public T getByID() {
	System.out.println("通过ID找");
		return null;
	}

	@Override
	public List<T> AllList() {
		System.out.println("找所有");
		return null;
	}

}
