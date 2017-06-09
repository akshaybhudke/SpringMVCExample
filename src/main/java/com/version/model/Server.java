package com.version.model;

import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;


public class Server {

	String ServerName;
	String SoftType;
	String SoftName;
	String Version ;
	
	public Server(){}
	
	public Server(String serverName, String softType, String softName, String version) {
		super();
		ServerName = serverName;
		SoftType = softType;
		SoftName = softName;
		Version = version;
	}
	
	public String getServerName() {
		return ServerName;
	}
	public void setServerName(String serverName) {
		ServerName = serverName;
	}
	public String getSoftType() {
		return SoftType;
	}
	public void setSoftType(String softType) {
		SoftType = softType;
	}
	public String getSoftName() {
		return SoftName;
	}
	public void setSoftName(String softName) {
		SoftName = softName;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	
		
}
