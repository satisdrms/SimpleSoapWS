package com.satisdrms.wsServer;

import javax.jws.WebMethod;
import javax.xml.ws.Endpoint;
import javax.jws.WebService;

@WebService

public class RunService {

	@WebMethod
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Web Service started for text search");
		Endpoint.publish("http://localhost:1234/AddService", new RunService());
	}
}
