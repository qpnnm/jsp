package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberService;

public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService memberService = new MemberService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	static Map<String, String> mapToMap(Map<String, String[]> map) {
		Map<String, String> rMap = new HashMap<>();
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String[] values = map.get(key);
			rMap.put(key, values[0]);
		}
		return rMap;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Map<String, String> map = mapToMap(request.getParameterMap());
		Map<String, Object> rMap;
		try {
			rMap = memberService.insertMember(map);
			doProcess(rMap, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void doProcess(Map<String, Object> rMap, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.print("입력갯수 : " + rMap.get("result"));
		pw.print("메시지 : " + rMap.get("msg"));
	}

}
