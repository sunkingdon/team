package com.web.project.purchase.vo;

public class PurchaseVo {
	private int purchaseno;
	private int itemmno;
	private String id;
	private String regdate;
	private int amount;
	private String title;
	private int genreno;
	private String genrename;
	
	
	public int getPurchaseno() {
		return purchaseno;
	}
	public void setPurchaseno(int purchaseno) {
		this.purchaseno = purchaseno;
	}
	public int getItemmno() {
		return itemmno;
	}
	public void setItemmno(int itemmno) {
		this.itemmno = itemmno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getGenreno() {
		return genreno;
	}
	public void setGenreno(int genreno) {
		this.genreno = genreno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenrename() {
		return genrename;
	}
	public void setGenrename(String genrename) {
		this.genrename = genrename;
	}
	
	
}
