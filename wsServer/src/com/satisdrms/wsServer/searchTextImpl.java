package com.satisdrms.wsServer;

import javax.jws.WebService;

@WebService(endpointInterface = "com.satisdrms.wsServer.searchText")

public class searchTextImpl implements searchText {
	private static final String SALUTATION = "Hello";

	@Override
	public String getGreeting(String name) {
		return SALUTATION + " " + name;
	}

}
