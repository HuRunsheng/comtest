package test1;

import org.apache.commons.text.StringEscapeUtils;

/**
 * EscapeTest class
 * 
 * @author HuRunsheng
 * @date 2018/02/27
 */
public class EscapeTest {

	public static void main(String[] args) {
		String strb = "中国";
		String stra=StringEscapeUtils.escapeJava(strb);
		System.out.println(stra);

	}

}
