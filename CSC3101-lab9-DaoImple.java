package ����;

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
		// TODO �Զ����ɵķ������
	System.out.println("del:"+t);
	}

	@Override
	public T getByID() {
	System.out.println("ͨ��ID��");
		return null;
	}

	@Override
	public List<T> AllList() {
		System.out.println("������");
		return null;
	}

}
