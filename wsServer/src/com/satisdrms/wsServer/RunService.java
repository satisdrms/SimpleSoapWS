package com.satisdrms.wsServer;

import javax.jws.WebMethod;
import javax.xml.ws.Endpoint;
import javax.xml.ws.spi.http.HttpContext;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(endpointInterface = "com.satisdrms.wsServerTest.RunService")
@SOAPBinding(style = Style.RPC)
public class RunService {

	@WebMethod
	public int add(int a, int b) {
		return a + b;
	}

	@WebMethod
	public String helloworld(String s) {

		return "hello world from satidrms";
	}

	/*
	 * public void HelloWord(HttpContext context) { context.Response.ContentType
	 * = "text/plain"; context.Response.Write("Hello world"); }
	 */

	public static void main(String[] args) {
		System.out.println("Web Service started for text search");
		Endpoint.publish("http://localhost:1234/ws/RunService",
				new RunService());
		System.out.println("sa");

	}
}
