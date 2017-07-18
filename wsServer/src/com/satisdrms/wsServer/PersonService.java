package com.satisdrms.wsServer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.satisdrms.wsServer.Person;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonService {

	@WebMethod
	public boolean addPerson(Person p);

	@WebMethod
	public boolean deletePerson(int id);

	@WebMethod
	public Person getPerson(int id);

	@WebMethod
	public Person[] getAllPersons();
}