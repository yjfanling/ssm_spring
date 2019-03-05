package com.catherine.bean;

public class User {
	private Integer u_id;
	private String u_username;
	private String u_password;
	private Pet u_pet;
	public Pet getU_pet() {
		return u_pet;
	}
	public void setU_pet(Pet u_pet) {
		this.u_pet = u_pet;
	}
	public User(Integer u_id, String u_username, String u_password) {
		this.u_id = u_id;
		this.u_username = u_username;
		this.u_password = u_password;
	}
	public User(String u_username, Pet u_pet) {
		System.out.println("方法一 String Pet");
		this.u_username = u_username;
		this.u_pet = u_pet;
	}
	public User(Integer u_username, Pet u_pet) {
		System.out.println("方法二 Integer Pet");
		this.u_username = u_username.toString();
		this.u_pet = u_pet;
	}
	public User(Pet u_pet,Integer u_username) {
		System.out.println("方法三 Pet Integer ");
		this.u_username = u_username.toString();
		this.u_pet = u_pet;
	}
	public User() 
	{
		System.out.println("User对象空参构造方法");
	}
	
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_username() {
		return u_username;
	}
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_username=" + u_username + ", u_password=" + u_password + ", u_pet=" + u_pet
				+ "]";
	}
	public  void userInit(){
		System.out.println("user init");
	}
	public void userDestroy()
	{
		System.out.println("user destroy");
	}
}
