package other;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by jay on 2017/2/23.
 *
 * @author jay
 */
public class RefTest {
	public static void main(String args[]) throws NoSuchMethodException {
		Class<?> clazz = RefTest.class;
//		Method method = clazz.getDeclaredMethod("sum", Long.class, Long.class);
		 Class<?> [] classs = {Long.class,Long.class};
		Method method = clazz.getDeclaredMethod("sum",classs);
		System.out.print("sum : ");
		Parameter[] parameters = method.getParameters();

		for (final Parameter parameter : parameters) {
			if (parameter.isNamePresent()) {
				System.out.print(parameter.getName() + ' ');
			}
		}

	}

	public Long sum(Long num1,Long num2 ){
		return num1 + num2;
	}
}
