package com.example.retrofit_api.model;

import com.google.gson.annotations.SerializedName;

public class QuariPostResponseItem{

	@SerializedName("name")
	private String name;

	@SerializedName("postId")
	private Integer postId;

	@SerializedName("id")
	private Integer id;

	@SerializedName("body")
	private String body;

	@SerializedName("email")
	private String email;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPostId(Integer postId){
		this.postId = postId;
	}

	public Integer getPostId(){
		return postId;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public void setBody(String body){
		this.body = body;
	}

	public String getBody(){
		return body;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}
}