package smu;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test {
	public static void main(String[] args) {
		String str = "http://192.168.0.225:8080/TestServlet/smu/message?mess=APACHE6GET";
		System.out.println(str.charAt(61));
		
		String st;
		try {
			st = URLEncoder.encode("http://192.168.0.225:8080", "UTF-8");
			System.out.println(st);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
