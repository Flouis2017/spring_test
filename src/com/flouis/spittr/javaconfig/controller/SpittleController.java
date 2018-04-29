package com.flouis.spittr.javaconfig.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

	@RequestMapping("/showMessage")
	public void showMessage(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		String  param = request.getParameter("param");
		System.out.println(param);
		Map<String,String> map = new HashMap<String,String>();
		map.put("titleName", "Spittles");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		map.put("dataTime", sdf.format(new Date()));
		PrintWriter writer = response.getWriter();
		String json = JSONObject.fromObject(map).toString();
		System.out.println(json);
		writer.write(json);
		writer.flush();
		writer.close();
	}
}

