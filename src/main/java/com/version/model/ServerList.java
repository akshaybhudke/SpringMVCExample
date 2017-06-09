package com.version.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Server-list")
public class ServerList {

 private List<Server> ServerList;

 protected ServerList() {
 }

 public ServerList(List<Server> ServerList) {
  this.ServerList = ServerList;
 }

 @javax.xml.bind.annotation.XmlElement(name = "Server")
 public List<Server> getServerList() {
  return ServerList;
 }
}

