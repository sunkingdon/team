package com.web.project.emp.vo;

public class ReviewVo {
	private String reviewcontent,id;
	private int reviewno, genreno;

	public int getReviewno() {
		return reviewno;
	}

	public void setReviewno(int reviewno) {
		this.reviewno = reviewno;
	}

	public String getReviewcontent() {
		return reviewcontent;
	}

	public void setReviewcontent(String reviewcontent) {
		this.reviewcontent = reviewcontent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGenreno() {
		return genreno;
	}

	public void setGenreno(int genreno) {
		this.genreno = genreno;
	}
}
