package kuangjian;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll=new ArrayList();
//		show(coll);
	}
	public static void show(Collection coll){
		//1.����Ԫ�� add 
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		//2.ɾ��Ԫ�� remove
		coll.remove("abc2");
		//3����ռ���
//		coll.clear();
		System.out.println(coll.contains("abc2"));
		System.out.println(coll);
		
	}
}