package FirstPackage;
import static java.lang.System.out;

import java.nio.charset.Charset;

public class Basic {
	public static void main(String[] args) {
		String s = "你好hello world";
		byte[] bs = s.getBytes();
		for(byte b : bs) {
			out.print(b);
			out.print(" ");
		}
		out.println("");
		out.println("original string length: " + s.length());
		System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
		System.out.println(Charset.defaultCharset());
	}
	
}
