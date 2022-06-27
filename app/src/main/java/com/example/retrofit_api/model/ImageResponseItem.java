package com.example.retrofit_api.model;

import com.google.gson.annotations.SerializedName;

public class ImageResponseItem{

	@SerializedName("albumId")
	private Integer albumId;

	@SerializedName("id")
	private Integer id;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private int url;

	@SerializedName("thumbnailUrl")
	private String thumbnailUrl;

	public void setAlbumId(Integer albumId){
		this.albumId = albumId;
	}

	public Integer getAlbumId(){
		return albumId;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(int url){
		this.url = url;
	}

	public int getUrl(){
		return url;
	}

	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getThumbnailUrl(){
		return thumbnailUrl;
	}
}