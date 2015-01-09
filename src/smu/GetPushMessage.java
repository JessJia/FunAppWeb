package smu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetPushMessage extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		Map<String, String[]> map = req.getParameterMap();
		Set<String> str = map.keySet();
		
		for(String st : str) {
			System.out.println(st);
			System.out.println(map.get(st)[0]);
		}
		
		
		System.out.println("------------post----------------");
		
		resp.setHeader("Content-type", "text/html;charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		writer.append("ƒ˙∫√£∫<br>");
		writer.append("post«Î«Û–ª–ª£°");
		writer.println();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
		req.setCharacterEncoding("UTF-8");
		Map<String, String[]> map = req.getParameterMap();
		Set<String> str = map.keySet();
		
		for(String st : str) {
			System.out.println(st);
			System.out.println(map.get(st)[0]);
			
		}
		
		System.out.println("================get================");
		
		resp.setHeader("Content-type", "text/html;charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		writer.append("ƒ˙∫√£∫<br>");
		writer.append("get «Î«Û–ª–ª£°");
		writer.println();
		
	}
}
