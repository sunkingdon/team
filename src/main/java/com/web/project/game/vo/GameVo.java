package com.web.project.game.vo;

public class GameVo {
	private int itemno;
	private String title;
	private String info;
	private int price;
	private String regdate;
	private int genreno;
	private int imgno;
	
	ImageVo imagevo;
	CategoryVo categoryvo;
	
	public ImageVo getImagevo() {
		return imagevo;
	}
	public void setImagevo(ImageVo imagevo) {
		this.imagevo = imagevo;
	}
	public CategoryVo getCategoryvo() {
		return categoryvo;
	}
	public void setCategoryvo(CategoryVo categoryvo) {
		this.categoryvo = categoryvo;
	}
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getGenreno() {
		return genreno;
	}
	public void setGenreno(int genreno) {
		this.genreno = genreno;
	}
	public int getImgno() {
		return imgno;
	}
	public void setImgno(int imgno) {
		this.imgno = imgno;
	}
}
