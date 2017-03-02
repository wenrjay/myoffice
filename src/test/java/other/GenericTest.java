package other;

import java.lang.reflect.Field;

/**
 * Created by jay on 2017/3/1.
 *
 * @author jay
 */
public class GenericTest<T> {
	public T t;
	public void getTClass(){
		Class cla = this.getClass();
		Field[] fields = cla.getFields();
		for (Field field : fields){
			System.out.println(field.toGenericString());
		}
	}

	public static void main(String ages[]){
		GenericTest<Integer> genericTest = new GenericTest<Integer>();
		genericTest.getTClass();
	}
}

