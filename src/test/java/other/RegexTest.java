package other;

import java.util.regex.Pattern;

/**
 * Created by jay on 2017/2/11.
 *
 * @author jay
 */
public class RegexTest {
	public static void main(String args[]) {
		String regex = "([a-z]|//d)*";
		String inputStr = "";
		for (int i = 0; i <= 800; i++) //此处的值为>=400则会马上抛异常
		{
			inputStr = inputStr.concat(String.valueOf(i));  //循环的拼接输入字符串
		}
		System.out.println("字符串长度为："+inputStr.length());
		boolean flag = checkSpecialChars(inputStr, regex);
		System.out.println("匹配结果为: "+flag);
	}
	public static boolean checkSpecialChars(String inputstr, String regex) {
		if (inputstr == null || "".equals(inputstr)) {
			return false;
		}
		return Pattern.compile(regex).matcher(inputstr).matches(); //注意是此处matches()方法抛的异常
	}


}
