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
		for (int i = 0; i <= 800; i++) //�˴���ֵΪ>=400����������쳣
		{
			inputStr = inputStr.concat(String.valueOf(i));  //ѭ����ƴ�������ַ���
		}
		System.out.println("�ַ�������Ϊ��"+inputStr.length());
		boolean flag = checkSpecialChars(inputStr, regex);
		System.out.println("ƥ����Ϊ: "+flag);
	}
	public static boolean checkSpecialChars(String inputstr, String regex) {
		if (inputstr == null || "".equals(inputstr)) {
			return false;
		}
		return Pattern.compile(regex).matcher(inputstr).matches(); //ע���Ǵ˴�matches()�����׵��쳣
	}


}
