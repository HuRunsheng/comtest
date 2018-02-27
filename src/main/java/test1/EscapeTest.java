package test1;

import org.apache.commons.text.StringEscapeUtils;

public class EscapeTest {

	public static void main(String[] args) {
		String strb = "中国";
		String stra=StringEscapeUtils.escapeJava(strb);
		System.out.println(stra);

	}

}
