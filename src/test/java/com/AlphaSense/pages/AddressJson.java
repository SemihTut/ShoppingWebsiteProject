package com.AlphaSense.pages;

import java.util.List;

public class AddressJson{
	private List<AddressesItem> addresses;
	private List<String> attribution;

	public void setAddresses(List<AddressesItem> addresses){
		this.addresses = addresses;
	}

	public List<AddressesItem> getAddresses(){
		return addresses;
	}

	public void setAttribution(List<String> attribution){
		this.attribution = attribution;
	}

	public List<String> getAttribution(){
		return attribution;
	}

	@Override
 	public String toString(){
		return 
			"AddressJson{" + 
			"addresses = '" + addresses + '\'' + 
			",attribution = '" + attribution + '\'' + 
			"}";
		}
}