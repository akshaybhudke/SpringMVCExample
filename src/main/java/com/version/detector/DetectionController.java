package com.version.detector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.version.model.Server;
import com.version.model.ServerList;

@Controller
public class DetectionController {

	@Autowired
	Server server;

	@RequestMapping("/xml")
	@ResponseBody
	public ServerList renderInXmlFormat()  {
		List<Server> serverList = new ArrayList<Server>();
		// ab muzhe yaha construcor level injection karana hai toh jkaiase hoga
		// if i dont have setters and getters in pojo
		File file = new File("/outdatedsoftdetector/src/main/resources/server.txt");
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			bufferedReader.readLine();
			while (bufferedReader.readLine()!=null){
				String line = bufferedReader.readLine();
				System.out.println(line);
				StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
				
					server.setServerName(stringTokenizer.nextToken());
					server.setSoftType(stringTokenizer.nextToken());
					server.setSoftName(stringTokenizer.nextToken());					
					server.setVersion(stringTokenizer.nextToken());
					
					serverList.add(server);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  new ServerList(serverList);

	}
	
	
	
	
	@RequestMapping("/json")
	@ResponseBody
	public String renderInJsonFormat()  {
		List<Server> serverList = new ArrayList<Server>();
		// ab muzhe yaha construcor level injection karana hai toh jkaiase hoga
		// if i dont have setters and getters in pojo
		File file = new File("server.txt");
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			bufferedReader.readLine();
			while (bufferedReader.readLine()!=null){
				String line = bufferedReader.readLine();
				System.out.println(line);
				StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
				
					server.setServerName(stringTokenizer.nextToken());
					server.setSoftType(stringTokenizer.nextToken());
					server.setSoftName(stringTokenizer.nextToken());					
					server.setVersion(stringTokenizer.nextToken());
					
					serverList.add(server);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 String json = new Gson().toJson(serverList);
		return  json;

	}
	
	

}
