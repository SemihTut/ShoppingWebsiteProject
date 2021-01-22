package com.AlphaSense.pages;

public class AddressesItem{
	private String city;
	private String address1;
	private String postalCode;
	private String jsonMember;


	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setAddress1(String address1){
		this.address1 = address1;
	}

	public String getAddress1(){
		return address1;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setJsonMember(String jsonMember){
		this.jsonMember = jsonMember;
	}

	public String getJsonMember(){
		return jsonMember;
	}

	@Override
 	public String toString(){
		return 
			"AddressesItem{" +
			",city = '" + city + '\'' + 
			",address1 = '" + address1 + '\'' + 
			",postalCode = '" + postalCode + '\'' +
			", = '" + jsonMember + '\'' + 
			"}";
		}
}
